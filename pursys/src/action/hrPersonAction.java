package action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import service.PersonService;
import bean.HrPerson;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import domain.Person;

public class hrPersonAction extends ActionSupport implements ModelDriven<Person>,ServletRequestAware{
	private Person person=new Person();
	private HttpServletRequest request;
	private PersonService personService;
	private List<Person> persons;
	private String id;
	private HrPerson p;
	
	public String findAllPerson(){
		persons=personService.findAll();
		
		return SUCCESS;
	}
	public String findByid(){
		p=personService.findById(id);
		return "id";
	}

	@Override
	public void setServletRequest(HttpServletRequest arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Person getModel() {
		// TODO Auto-generated method stub
		return null;
	}

	public PersonService getPersonService() {
		return personService;
	}

	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}

	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public HrPerson getP() {
		return p;
	}
	public void setP(HrPerson p) {
		this.p = p;
	}
	public List<Person> getPersons() {
		return persons;
	}
	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}
	
	
	
	

}
