package action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import service.ItemService;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import domain.Item;

public class itemAction extends ActionSupport implements ModelDriven<Item>,ServletRequestAware {
	private Item item =new Item();
	private ItemService itemService;
	private List<Item> items;
	
	
	public String findAllItems(){
		items=itemService.findAll();
		return SUCCESS;
	}


	@Override
	public void setServletRequest(HttpServletRequest arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
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
	
	
	
	

	
	

}
