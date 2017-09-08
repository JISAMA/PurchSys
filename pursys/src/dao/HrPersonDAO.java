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

import bean.HrPerson;

/**
 * A data access object (DAO) providing persistence and search support for
 * HrPerson entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see dao.HrPerson
 * @author MyEclipse Persistence Tools
 */
@Transactional
public class HrPersonDAO {
	private static final Logger log = LoggerFactory
			.getLogger(HrPersonDAO.class);
	// property constants
	public static final String NAME = "name";
	public static final String MANAGER_EMP_NUM = "managerEmpNum";
	public static final String JOB = "job";
	public static final String DEPARTMENT = "department";

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

	public String save(HrPerson transientInstance) {
		log.debug("saving HrPerson instance");
		try {
			String str=(String)getCurrentSession().save(transientInstance);
			log.debug("save successful");
			return str;
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(HrPerson persistentInstance) {
		log.debug("deleting HrPerson instance");
		try {
			getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public HrPerson findById(java.lang.String id) {
		log.debug("getting HrPerson instance with id: " + id);
		try {
			HrPerson instance = (HrPerson) getCurrentSession().get(
					"dao.HrPerson", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(HrPerson instance) {
		log.debug("finding HrPerson instance by example");
		try {
			List results = getCurrentSession().createCriteria("dao.HrPerson")
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
		log.debug("finding HrPerson instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from HrPerson as model where model."
					+ propertyName + "= ?";
			Query queryObject = getCurrentSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByName(Object name) {
		return findByProperty(NAME, name);
	}

	public List findByManagerEmpNum(Object managerEmpNum) {
		return findByProperty(MANAGER_EMP_NUM, managerEmpNum);
	}

	public List findByJob(Object job) {
		return findByProperty(JOB, job);
	}

	public List findByDepartment(Object department) {
		return findByProperty(DEPARTMENT, department);
	}

	public List findAll() {
		log.debug("finding all HrPerson instances");
		try {
			String queryString = "from HrPerson";
			Query queryObject = getCurrentSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public HrPerson merge(HrPerson detachedInstance) {
		log.debug("merging HrPerson instance");
		try {
			HrPerson result = (HrPerson) getCurrentSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(HrPerson instance) {
		log.debug("attaching dirty HrPerson instance");
		try {
			getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(HrPerson instance) {
		log.debug("attaching clean HrPerson instance");
		try {
			getCurrentSession().buildLockRequest(LockOptions.NONE).lock(
					instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static HrPersonDAO getFromApplicationContext(ApplicationContext ctx) {
		return (HrPersonDAO) ctx.getBean("HrPersonDAO");
	}
}