package com.zzf.pojo;
/**
***********************************************
*
* @className:      Vo.java
* @author:         M10F
* @date:           2019年4月15日--下午3:59:47
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
	//	封装四个
	private String custName;
	private String custSource;
	private String custIndustry;
	private String custLevel;
	//	分页参数
	private Integer page;//当前页码
	private Integer size=10;//记录数
	private Integer startRow=0;//起始页
	
	
}
