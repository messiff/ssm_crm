package com.zzf.utils;

import java.util.List;
//分页工具类
public class Page<T> {
    
	private int total;//记录数
	private int page;//当前页码
	private int size;//每一页记录数
    private List<T> rows;//记录每一页的数据
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public List<T> getRows() {
		return rows;
	}
	public void setRows(List<T> rows) {
		this.rows = rows;
	}
    
	
    
}
