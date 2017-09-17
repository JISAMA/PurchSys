package service;

import java.util.ArrayList;
import java.util.List;

import dao.MtlItemsAllDAO;
import dao.PoSaveFromDAO;
import domain.Plan;
import domain.planlist;
import bean.MtlItemsAll;
import bean.PoSaveFrom;

public class PoSaveService {
	private PoSaveFromDAO poSaveFromDAO;
	
	public void addNeed(PoSaveFrom need){
		poSaveFromDAO.save(need);
	}
	public List<planlist> findAll(){
		List<PoSaveFrom> poSaveFroms=poSaveFromDAO.findAll();
		List<planlist> plans=new ArrayList<planlist>();
		for(PoSaveFrom po:poSaveFroms){
			planlist pl=new planlist();
			pl.setPoPlanCode(po.getPoPlanCode());
			pl.setItemNum(po.getItemNum());
			pl.setQty(po.getQty());
			pl.setStatus(po.getStatus());
			plans.add(pl);
		}
		return plans;
	}

	public PoSaveFromDAO getPoSaveFromDAO() {
		return poSaveFromDAO;
	}

	public void setPoSaveFromDAO(PoSaveFromDAO poSaveFromDAO) {
		this.poSaveFromDAO = poSaveFromDAO;
	}
	
	

}
