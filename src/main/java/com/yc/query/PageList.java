package com.yc.query;

import java.io.Serializable;
import java.util.List;

/**
 * EsayUi返回
 * @author Administrator
 */
public class PageList implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8732770422589502375L;
	private long total;  //返回JSon中的total值
	private List<?> rows; //返回JSon中的rows值
	
	
	public PageList() {
		super();
	}
	
	
	public PageList(long total, List<?> rows) {
		super();
		this.total = total;
		this.rows = rows;
	}


	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List<?> getRows() {
		return rows;
	}
	public void setRows(List<?> rows) {
		this.rows = rows;
	}
	
	
}
