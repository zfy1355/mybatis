package org.mybatis.controller;

import java.util.Map;

import org.mybatis.entity.TestEntity;
import org.mybatis.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/test")
public class TestController {
	@Autowired
	private TestService service;
	
	@RequestMapping("/{id}")
	public ModelAndView index(@PathVariable int id, Model data){
		TestEntity test = service.selectOne(id);
		data.addAttribute("entity", test);
		return new ModelAndView("test");
	}
}
