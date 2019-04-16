package com.zzf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zzf.pojo.BaseDict;
import com.zzf.pojo.Customer;
import com.zzf.pojo.Vo;
import com.zzf.service.BaseDictService;
import com.zzf.service.CustomerService;
import com.zzf.utils.Page;


/**
***********************************************
*
* @className:      UserControl.java
* @author:         M10F
* @date:           2019��4��15��--����12:00:27
* @version:        v1.0
* @description:    
*
* *********************************************
*/
@Controller
public class UserControl {
	@Autowired
	BaseDictService bService;
	@Autowired
	CustomerService cService;
	@RequestMapping("/customer/list.action")
	public String getUser(Model model,Vo vo) {
		List<BaseDict> fromType = bService.getBaseDicts("002");
		List<BaseDict> industryType = bService.getBaseDicts("001");
		List<BaseDict> levelType = bService.getBaseDicts("006");
		model.addAttribute("fromType", fromType);
		model.addAttribute("industryType", industryType);
		model.addAttribute("levelType", levelType);
//		��ѯ��ҳ����
		Page<Customer> customers = cService.getCustomers(vo);
		model.addAttribute("custName", vo.getCustName());
		model.addAttribute("custSource", vo.getCustSource());
		model.addAttribute("custIndustry", vo.getCustIndustry());
		model.addAttribute("custLevel", vo.getCustLevel());
		model.addAttribute("page", customers);
		return "customer";
	}
	@RequestMapping("/customer/edit")
	@ResponseBody
	public Customer show(Integer id) {
		System.out.println("�༭");
		Customer customer = cService.getCustomer(id);
		return customer;
	} 
	@RequestMapping("/customer/update")
	@ResponseBody
	public String show1(Customer c) {
		System.out.println("����");
		cService.getCustomerupdate(c);
		return "OK";
	}
	@RequestMapping("/customer/delete" )
	@ResponseBody
	public String show2(Integer id) {
//		����idɾ��
		cService.getCustomerdelete(id);
		return "OK";
	}
}
