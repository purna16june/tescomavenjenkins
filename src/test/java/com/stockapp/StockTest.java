package com.stockapp;

import java.util.ArrayList;
import java.util.List;

import org.mockito.Mockito;

public class StockTest {
	
	private Portfolio portfolio;
	StockService service;
	
	public static void main(String[] args) {
		StockTest stockTest = new StockTest();
		stockTest.setUp();
		System.out.println(stockTest.testmarketValue() ? "pass" : "fail");
	}
	
	public void setUp() {
		portfolio = new Portfolio();
		service = Mockito.mock(StockService.class);
		portfolio.setService(service);
	}
	
	public boolean testmarketValue() {
		List<Stock> stocks = new ArrayList<Stock>();
		Stock google = new Stock("1", "Google", 10);
		Stock ms = new Stock("2", "Microsoft", 100);
		stocks.add(google);
		stocks.add(ms);
		portfolio.setStocks(stocks);
		Mockito.when(service.getPrice(google)).thenReturn(50.00);
		Mockito.when(service.getPrice(ms)).thenReturn(1000.00);
		double marketValue = portfolio.getMarketValue();
		return marketValue == 100500.00;
	}
}
