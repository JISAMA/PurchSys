package action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONObject;

import org.apache.struts2.interceptor.ServletRequestAware;

import service.ItemService;
import bean.MtlItemsAll;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import domain.Item;

public class itemAction extends ActionSupport implements ModelDriven<Item>,ServletRequestAware {
	private ItemService itemService;
	private List<Item> items;
	private MtlItemsAll mtlItemsAll;
	
	private String name;
	private String desp;
	private String type;
	
	
	public String findAllItems(){
		items=itemService.findAll();
		return SUCCESS;
	}
	public void addItem(){
		System.out.println(name+desp+type);
		mtlItemsAll=new MtlItemsAll(name, desp, type);
		itemService.addItem(mtlItemsAll);
	}


	@Override
	public void setServletRequest(HttpServletRequest arg0) {
		// TODO Auto-generated method stub
		
	}


	public Item getModel() {
		// TODO Auto-generated method stub
		return null;
	}


	public ItemService getItemService() {
		return itemService;
	}


	public void setItemService(ItemService itemService) {
		this.itemService = itemService;
	}


	public List<Item> getItems() {
		return items;
	}


	public void setItems(List<Item> items) {
		this.items = items;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesp() {
		return desp;
	}
	public void setDesp(String desp) {
		this.desp = desp;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	
	
	
	
	

	
	

}
