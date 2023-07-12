package com.stockapp;

public class Stock {
	
	private String stockid;
	private String stockname;
	private int quantity;
	public String getStockid() {
		return stockid;
	}
	public void setStockid(String stockid) {
		this.stockid = stockid;
	}
	public String getStockname() {
		return stockname;
	}
	public void setStockname(String stockname) {
		this.stockname = stockname;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Stock(String stockid, String stockname, int quantity) {
		super();
		this.stockid = stockid;
		this.stockname = stockname;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Stock [stockid=" + stockid + ", stockname=" + stockname + ", quantity=" + quantity + "]";
	}
	
	
	

}
