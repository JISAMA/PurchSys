package action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import service.PersonService;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import domain.Person;

public class hrPersonAction extends ActionSupport implements ModelDriven<Person>,ServletRequestAware{
	private Person person=new Person();
	private HttpServletRequest request;
	private PersonService personService;
	private List<Person> persons;
	
	public String findAllPerson(){
		persons=personService.findAll();
		return SUCCESS;
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

	public List<Person> getPersons() {
		return persons;
	}

	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}
	
	

}
