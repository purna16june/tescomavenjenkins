package com.stockapp;

import java.util.List;

public class Portfolio {
	
	private StockService service;
	private List<Stock> stocks;
	
	public StockService getService() {
		return service;
	}
	public void setService(StockService service) {
		this.service = service;
	}
	public List<Stock> getStocks() {
		return stocks;
	}
	public void setStocks(List<Stock> stocks) {
		this.stocks = stocks;
	}
	
	public double getMarketValue() {
		double marketValue = 0.0;
		
		for(Stock stock: stocks) {
			marketValue += service.getPrice(stock) * stock.getQuantity();
		}
		return marketValue;
	}
}
