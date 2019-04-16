package com.zzf.mapper;

import java.util.List;

import com.zzf.pojo.Customer;
import com.zzf.pojo.Vo;

/**
***********************************************
*
* @className:      CustomerMapper.java
* @author:         M10F
* @date:           2019年4月15日--下午5:08:37
* @version:        v1.0
* @description:    
*
* *********************************************
*/
public interface CustomerMapper {
	public Integer getCustomerstotal(Vo vo);
	public List<Customer> getCustomerspage(Vo vo);
//	根据id查询客户
	public Customer getCustomer(Integer id) ;
//	修改客户
	public void getCustomerupdate(Customer c) ;
//	删除客户
	public void getCustomerdelete(Integer id) ;
}
