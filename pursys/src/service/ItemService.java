package service;

import java.util.ArrayList;
import java.util.List;

import bean.MtlItemsAll;
import dao.MtlItemsAllDAO;
import domain.Item;

public class ItemService {
	private static Integer SUCCESS=1;
	private static Integer FAIL=0;
	private static Integer NULLCLASS=2;
	
	private MtlItemsAllDAO mtlItemsAllDAO;
	
	public List<Item> findAll(){
		List<MtlItemsAll> mtlItems=mtlItemsAllDAO.findAll();
		List<Item> items=new ArrayList<Item>();
		for(MtlItemsAll mtlItem:mtlItems){
			Item item=new Item();
			item.setItemNum(mtlItem.getItemNum());
			item.setItemName(mtlItem.getItemName());
			item.setItemDesp(mtlItem.getItemDescription());
			item.setItemType(mtlItem.getItemType());
			
			items.add(item);
		}
		return items;
		
	}

	public MtlItemsAllDAO getMtlItemsAllDAO() {
		return mtlItemsAllDAO;
	}

	public void setMtlItemsAllDAO(MtlItemsAllDAO mtlItemsAllDAO) {
		this.mtlItemsAllDAO = mtlItemsAllDAO;
	}

	
	
	
	
	
	
	

}
