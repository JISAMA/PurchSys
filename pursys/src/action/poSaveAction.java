package action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.struts2.interceptor.ServletRequestAware;

import service.PoSaveService;
import bean.PoSaveFrom;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import domain.Need;
import domain.Plan;
import domain.planlist;


public class poSaveAction extends ActionSupport implements ModelDriven<planlist>,ServletRequestAware {
	
	private PoSaveService poSaveService;
	private String needlist;
	private PoSaveFrom poSaveFrom;
	private List<planlist> plans;
	
	public void addNeed(){
		System.out.println(needlist);
		JSONArray json=JSONArray.fromObject(needlist);
		List<PoSaveFrom> plans=JSONArray.toList(json, PoSaveFrom.class);
		
		
		for(PoSaveFrom ps:plans){
			poSaveFrom=new PoSaveFrom(ps.getItemNum(),ps.getQty(),0);
			poSaveService.addNeed(poSaveFrom);
		}
	}
	
	public String findAllList(){
		System.out.println("bean");
		plans=poSaveService.findAll();
		return "planlist";
	}

	public PoSaveService getPoSaveService() {
		return poSaveService;
	}

	public void setPoSaveService(PoSaveService poSaveService) {
		this.poSaveService = poSaveService;
	}
	
	

public String getNeedlist() {
		return needlist;
	}

	public void setNeedlist(String needlist) {
		this.needlist = needlist;
	}

	//	public List<Need> getNeedlist() {
//		return needlist;
//	}
//
//	public void setNeedlist(List<Need> needlist) {
//		this.needlist = needlist;
//	}
//
	@Override
	public void setServletRequest(HttpServletRequest arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public planlist getModel() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<planlist> getPlans() {
		return plans;
	}

	public void setPlans(List<planlist> plans) {
		this.plans = plans;
	}
	
	

}
