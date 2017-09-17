package dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import bean.PoSaveFrom;

/**
 * A data access object (DAO) providing persistence and search support for
 * PoSaveFrom entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see dao.PoSaveFrom
 * @author MyEclipse Persistence Tools
 */
@Transactional
public class PoSaveFromDAO {
	private static final Logger log = LoggerFactory
			.getLogger(PoSaveFromDAO.class);
	// property constants
	public static final String ITEM_NUM = "itemNum";
	public static final String QTY = "qty";
	public static final String STATUS = "status";

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	protected void initDao() {
		// do nothing
	}

	public void save(PoSaveFrom transientInstance) {
		log.debug("saving PoSaveFrom instance");
		try {
			getCurrentSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(PoSaveFrom persistentInstance) {
		log.debug("deleting PoSaveFrom instance");
		try {
			getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PoSaveFrom findById(java.lang.Integer id) {
		log.debug("getting PoSaveFrom instance with id: " + id);
		try {
			PoSaveFrom instance = (PoSaveFrom) getCurrentSession().get(
					"dao.PoSaveFrom", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(PoSaveFrom instance) {
		log.debug("finding PoSaveFrom instance by example");
		try {
			List results = getCurrentSession().createCriteria("dao.PoSaveFrom")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding PoSaveFrom instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from PoSaveFrom as model where model."
					+ propertyName + "= ?";
			Query queryObject = getCurrentSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByItemNum(Object itemNum) {
		return findByProperty(ITEM_NUM, itemNum);
	}

	public List findByQty(Object qty) {
		return findByProperty(QTY, qty);
	}

	public List findByStatus(Object status) {
		return findByProperty(STATUS, status);
	}

	public List findAll() {
		log.debug("finding all PoSaveFrom instances");
		try {
			String queryString = "from PoSaveFrom";
			Query queryObject = getCurrentSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public PoSaveFrom merge(PoSaveFrom detachedInstance) {
		log.debug("merging PoSaveFrom instance");
		try {
			PoSaveFrom result = (PoSaveFrom) getCurrentSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(PoSaveFrom instance) {
		log.debug("attaching dirty PoSaveFrom instance");
		try {
			getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PoSaveFrom instance) {
		log.debug("attaching clean PoSaveFrom instance");
		try {
			getCurrentSession().buildLockRequest(LockOptions.NONE).lock(
					instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static PoSaveFromDAO getFromApplicationContext(ApplicationContext ctx) {
		return (PoSaveFromDAO) ctx.getBean("PoSaveFromDAO");
	}
}