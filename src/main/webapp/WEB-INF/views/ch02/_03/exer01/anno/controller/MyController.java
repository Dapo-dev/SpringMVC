package exer01.anno.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import exer01.anno.service.IService;

@Controller
public class MyController implements IController  {
	
	@Autowired
	IService  service;
	
	@Override
	public void doWork() {

    	service.process();	
    }
}
