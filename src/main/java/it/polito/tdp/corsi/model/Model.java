package it.polito.tdp.corsi.model;

import java.util.List;
import java.util.Map;

import it.polito.tdp.dao.CorsoDAO;

public class Model {
	
	private CorsoDAO corsoDao;
	
	public Model() {
		corsoDao = new CorsoDAO();
	}
	
	public List<Corso> getCorsiByPeriodo(int  pd){
		return corsoDao.getCorsiByPeriodo(pd);
	}
	
	public Map <Corso, Integer> getIscrittiByPeriodo(int pd){
		return corsoDao.getIscrittiByPeriodo(pd);
	}
}
