package exer01.anno.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import exer01.anno.dao.IDao;

@Service
public class MyService implements IService  {
	
	@Autowired
	IDao dao;
	
	@Override
	public void process() {
		dao.accessDatabase(); 
	}
}
