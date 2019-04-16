package com.zzf.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzf.mapper.CustomerMapper;
import com.zzf.pojo.Customer;
import com.zzf.pojo.Vo;
import com.zzf.service.CustomerService;
import com.zzf.utils.Page;

/**
***********************************************
*
* @className:      CustomerServiceImpl.java
* @author:         M10F
* @date:           2019年4月15日--下午5:23:34
* @version:        v1.0
* @description:    
*
* *********************************************
*/
@Service("customerservice")
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	CustomerMapper cMapper;
//	查询分页数据
	@Override
	public Page<Customer> getCustomers(Vo vo) {
		Page<Customer> page = new Page<Customer>();
		page.setSize(10);
		vo.setSize(10);
		if (null != vo) {
			if (null != vo.getPage()) {
				vo.setPage(vo.getPage());
//				获取当前页码的索引值
				vo.setStartRow((vo.getPage()-1)*(vo.getSize()));
			}
			if (vo.getCustName() != null && !("").equals(vo.getCustName().trim())) {
				vo.setCustName(vo.getCustName().trim());
			}
			if (vo.getCustSource() != null && !("").equals(vo.getCustSource().trim())) {
				vo.setCustSource(vo.getCustSource().trim());
			}
			if (vo.getCustIndustry() != null && !("").equals(vo.getCustIndustry().trim())) {
				vo.setCustIndustry(vo.getCustIndustry().trim());
			}
			if (vo.getCustLevel() != null && !("").equals(vo.getCustLevel().trim())) {
				vo.setCustLevel(vo.getCustLevel().trim());
			}
		}
		// TODO Auto-generated method stub

		page.setTotal(cMapper.getCustomerstotal(vo));
		page.setRows(cMapper.getCustomerspage(vo));
		return page;
	}
//	根据指定id打开界面
	@Override
	public Customer getCustomer(Integer id) {
		// TODO Auto-generated method stub
		Customer customer = cMapper.getCustomer(id);
		return customer;
	}
//	修改打开界面
	@Override
	public void getCustomerupdate(Customer c) {
		// TODO Auto-generated method stub
		cMapper.getCustomerupdate(c);
	}
	@Override
	public void getCustomerdelete(Integer id) {
		// TODO Auto-generated method stub
		cMapper.getCustomerdelete(id);
	}
}
