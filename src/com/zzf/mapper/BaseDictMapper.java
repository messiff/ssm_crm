package com.zzf.mapper;
/**
***********************************************
*
* @className:      BaseDictMapper.java
* @author:         M10F
* @date:           2019年4月15日--下午3:29:39
* @version:        v1.0
* @description:    
*
* *********************************************
*/

import java.util.List;

import com.zzf.pojo.BaseDict;
import com.zzf.pojo.Customer;
import com.zzf.pojo.Vo;
import com.zzf.utils.Page;

public interface BaseDictMapper {
	public List<BaseDict> getBaseDicts(String code);
	public Integer getCustomerstotal(Vo vo);
	public List<Customer> getCustomerspage(Vo vo);
}
