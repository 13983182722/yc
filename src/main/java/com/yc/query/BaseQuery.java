package com.yc.query;

import java.io.Serializable;

/**
 * 基本查询条件
 * @author Administrator
 */
public class BaseQuery implements Serializable{
	
	private static final long serialVersionUID = -6137594339080193988L;
	
	private int page;
	private int rows;
	private int total;
	
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
}
