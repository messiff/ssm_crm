package com.zzf.service;

import com.zzf.pojo.Customer;
import com.zzf.pojo.Vo;
import com.zzf.utils.Page;

/**
***********************************************
*
* @className:      CustomerService.java
* @author:         M10F
* @date:           2019��4��15��--����5:23:07
* @version:        v1.0
* @description:    
*
* *********************************************
*/
public interface CustomerService {
//	��ѯ��ҳ����
	public Page<Customer> getCustomers(Vo vo);
//	����id��ѯ�ͻ�
	public Customer getCustomer(Integer id) ;
//	�޸Ŀͻ�
	public void getCustomerupdate(Customer c) ;
//	ɾ���ͻ�
	public void getCustomerdelete(Integer id) ;
}
