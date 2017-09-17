package service;

import java.util.ArrayList;
import java.util.List;

import bean.HrPerson;
import dao.HrPersonDAO;
import domain.Person;

public class PersonService {
	private static Integer SUCCESS=1;
	private static Integer FAIL=0;
	private static Integer FAILDB=2;
	
	private HrPersonDAO hrPersonDAO;
	private HrPerson hrPerson;
	
	
	public int addPerson(HrPerson hrPerson){
		if(hrPerson!=null){
			HrPerson person=new HrPerson(hrPerson.getEmpNum(),hrPerson.getName(),hrPerson.getEmpNum(),hrPerson.getJob(),hrPerson.getDepartment());
			String str=hrPersonDAO.save(person);
			if(str!=null){
				return SUCCESS;
			}else{
				return FAILDB;
			}
		}else{
	       return FAIL;
		}
		
		
	}
	
	public HrPerson findById(String id){
		hrPerson=hrPersonDAO.findById(id);
		return hrPerson;
	}
	

	
	public List<Person> findAll(){
		List<HrPerson> hperson=hrPersonDAO.findAll();
		List<Person> persons=new ArrayList<Person>();
		for(HrPerson hp:hperson){
			Person person=new Person();
			person.setEmpNum(hp.getEmpNum());
			person.setName(hp.getName());
//			System.out.println(findById(hp.getManagerEmpNum()).getName());
//			person.setManagerEmpNum((findById(hp.getManagerEmpNum())).getName());
			person.setManagerEmpNum(hp.getManagerEmpNum());
			person.setJob(hp.getJob());
			person.setDepartment(hp.getDepartment());
			persons.add(person);
		}
		
		return persons;
		
		}

	public HrPersonDAO getHrPersonDAO() {
		return hrPersonDAO;
	}

	public void setHrPersonDAO(HrPersonDAO hrPersonDAO) {
		this.hrPersonDAO = hrPersonDAO;
	}
	
	
	
	

}
