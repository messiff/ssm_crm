package com.zzf.pojo;
/**
***********************************************
*
* @className:      Vo.java
* @author:         M10F
* @date:           2019��4��15��--����3:59:47
* @version:        v1.0
* @description:    
*
* *********************************************
*/
public class Vo {
public Integer getStartRow() {
		return startRow;
	}
	public void setStartRow(Integer startRow) {
		this.startRow = startRow;
	}
public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustSource() {
		return custSource;
	}
	public void setCustSource(String custSource) {
		this.custSource = custSource;
	}
	public String getCustIndustry() {
		return custIndustry;
	}
	public void setCustIndustry(String custIndustry) {
		this.custIndustry = custIndustry;
	}
	public String getCustLevel() {
		return custLevel;
	}
	public void setCustLevel(String custLevel) {
		this.custLevel = custLevel;
	}
	//	��װ�ĸ�
	private String custName;
	private String custSource;
	private String custIndustry;
	private String custLevel;
	//	��ҳ����
	private Integer page;//��ǰҳ��
	private Integer size=10;//��¼��
	private Integer startRow=0;//��ʼҳ
	
	
}
