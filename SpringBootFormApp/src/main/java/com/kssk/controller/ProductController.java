package com.kssk.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {

	@GetMapping(value={"/","/loadform"})   // 2 types of url patterns
	public String loadForm() {
		return "index";
	}
	
	@PostMapping(value="/saveProduct")
	public  String hanleSubmitBtn(HttpServletRequest req, ModelMap model)
	{
		//logic to save form data
		String pid=req.getParameter("pid");
		String pname=req.getParameter("pname");
		String price=req.getParameter("price");
		System.out.println("Product ID:"+pid);
		System.out.println("Product Name:"+pname);
		System.out.println("Product Price"+price);
		model.addAttribute("msg", "Product Saved  To Catalog Successfully");
		return "success";
	}
	
}
 