package com.zzf.service;

import java.util.List;

import com.zzf.pojo.BaseDict;
import com.zzf.pojo.Customer;
import com.zzf.pojo.Vo;
import com.zzf.utils.Page;

/**
***********************************************
*
* @className:      BaseDictService.java
* @author:         M10F
* @date:           2019年4月15日--下午3:36:08
* @version:        v1.0
* @description:    
*
* *********************************************
*/
public interface BaseDictService {
	public List<BaseDict> getBaseDicts(String code);

}
