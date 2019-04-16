package com.zzf.mapper;

import java.util.List;

import com.zzf.pojo.Customer;
import com.zzf.pojo.Vo;

/**
***********************************************
*
* @className:      CustomerMapper.java
* @author:         M10F
* @date:           2019��4��15��--����5:08:37
* @version:        v1.0
* @description:    
*
* *********************************************
*/
public interface CustomerMapper {
	public Integer getCustomerstotal(Vo vo);
	public List<Customer> getCustomerspage(Vo vo);
//	����id��ѯ�ͻ�
	public Customer getCustomer(Integer id) ;
//	�޸Ŀͻ�
	public void getCustomerupdate(Customer c) ;
//	ɾ���ͻ�
	public void getCustomerdelete(Integer id) ;
}
