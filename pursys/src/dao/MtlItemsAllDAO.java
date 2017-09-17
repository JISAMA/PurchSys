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

import bean.MtlItemsAll;

/**
 * A data access object (DAO) providing persistence and search support for
 * MtlItemsAll entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see bean.MtlItemsAll
 * @author MyEclipse Persistence Tools
 */
@Transactional
public class MtlItemsAllDAO {
	private static final Logger log = LoggerFactory
			.getLogger(MtlItemsAllDAO.class);
	// property constants
	public static final String ITEM_NAME = "itemName";
	public static final String ITEM_DESCRIPTION = "itemDescription";
	public static final String ITEM_TYPE = "itemType";

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

	public void save(MtlItemsAll transientInstance) {
		log.debug("saving MtlItemsAll instance");
		try {
			getCurrentSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			System.out.println("插入失败");
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(MtlItemsAll persistentInstance) {
		log.debug("deleting MtlItemsAll instance");
		try {
			getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public MtlItemsAll findById(java.lang.Integer id) {
		log.debug("getting MtlItemsAll instance with id: " + id);
		try {
			MtlItemsAll instance = (MtlItemsAll) getCurrentSession().get(
					"bean.MtlItemsAll", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(MtlItemsAll instance) {
		log.debug("finding MtlItemsAll instance by example");
		try {
			List results = getCurrentSession()
					.createCriteria("bean.MtlItemsAll")
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
		log.debug("finding MtlItemsAll instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from MtlItemsAll as model where model."
					+ propertyName + "= ?";
			Query queryObject = getCurrentSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByItemName(Object itemName) {
		return findByProperty(ITEM_NAME, itemName);
	}

	public List findByItemDescription(Object itemDescription) {
		return findByProperty(ITEM_DESCRIPTION, itemDescription);
	}

	public List findByItemType(Object itemType) {
		return findByProperty(ITEM_TYPE, itemType);
	}

	public List findAll() {
		log.debug("finding all MtlItemsAll instances");
		try {
			String queryString = "from MtlItemsAll";
			Query queryObject = getCurrentSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public MtlItemsAll merge(MtlItemsAll detachedInstance) {
		log.debug("merging MtlItemsAll instance");
		try {
			MtlItemsAll result = (MtlItemsAll) getCurrentSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(MtlItemsAll instance) {
		log.debug("attaching dirty MtlItemsAll instance");
		try {
			getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(MtlItemsAll instance) {
		log.debug("attaching clean MtlItemsAll instance");
		try {
			getCurrentSession().buildLockRequest(LockOptions.NONE).lock(
					instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static MtlItemsAllDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (MtlItemsAllDAO) ctx.getBean("MtlItemsAllDAO");
	}
}