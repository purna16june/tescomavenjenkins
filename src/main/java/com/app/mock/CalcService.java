package com.app.mock;

public class CalcService {
	public AddService addService;

	public CalcService(AddService addService) {
		super();
		this.addService = addService;
	}


	public int calc(int a, int b) {
		return addService.add(a,b);
	}
}
