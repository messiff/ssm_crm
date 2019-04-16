package com.zzf.service;

import com.zzf.pojo.Customer;
import com.zzf.pojo.Vo;
import com.zzf.utils.Page;

/**
***********************************************
*
* @className:      CustomerService.java
* @author:         M10F
* @date:           2019年4月15日--下午5:23:07
* @version:        v1.0
* @description:    
*
* *********************************************
*/
public interface CustomerService {
//	查询分页数据
	public Page<Customer> getCustomers(Vo vo);
//	根据id查询客户
	public Customer getCustomer(Integer id) ;
//	修改客户
	public void getCustomerupdate(Customer c) ;
//	删除客户
	public void getCustomerdelete(Integer id) ;
}
