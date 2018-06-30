package com.croods.relationship.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.croods.relationship.model.EmpVo;
import com.croods.relationship.model.Emp_CompVo;
import com.croods.relationship.service.EmpService;

@Controller
public class EmpController {
	@Autowired
	EmpService empservice;
	@RequestMapping("/")
	public ModelAndView home()
	{	ModelAndView modelAndView =new ModelAndView("home");
	modelAndView.addObject("list",empservice.findAll());
		return modelAndView;
		
	}
	@RequestMapping(value = "rege", method = RequestMethod.POST)
	public ModelAndView add(@ModelAttribute("EmpVo") EmpVo empVo /*,@ModelAttribute("Emp_CompVo") Emp_CompVo emp_CompVo*/ ) {
	
		empservice.save(empVo);
		//System.out.println(empVo.getEmpskillvo().get(0));
		ModelAndView home=new ModelAndView("redirect:/");
		return home;
		}
	@RequestMapping(value ="delete/{a}", method = RequestMethod.GET)
	public ModelAndView delete(@PathVariable("a")int a) {
		empservice.delete(a);
		ModelAndView home=new ModelAndView("redirect:/");
		return home;
	}

}
