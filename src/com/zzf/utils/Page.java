package com.zzf.utils;

import java.util.List;
//��ҳ������
public class Page<T> {
    
	private int total;//��¼��
	private int page;//��ǰҳ��
	private int size;//ÿһҳ��¼��
    private List<T> rows;//��¼ÿһҳ������
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
