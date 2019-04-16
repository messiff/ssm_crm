package com.zzf.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzf.mapper.BaseDictMapper;
import com.zzf.mapper.CustomerMapper;
import com.zzf.pojo.BaseDict;
import com.zzf.pojo.Customer;
import com.zzf.pojo.Vo;
import com.zzf.service.BaseDictService;
import com.zzf.utils.Page;

/**
 ***********************************************
 *
 * @className: BaseDictServiceImpl.java
 * @author: M10F
 * @date: 2019年4月15日--下午3:36:29
 * @version: v1.0
 * @description:
 *
 **********************************************
 */
@Service("basedictservice")
public class BaseDictServiceImpl implements BaseDictService {
	@Autowired
	BaseDictMapper bMapper;

	@Override
	public List<BaseDict> getBaseDicts(String code) {
		// TODO Auto-generated method stub
		List<BaseDict> baseDicts = bMapper.getBaseDicts(code);
		return baseDicts;
	}

	
}
