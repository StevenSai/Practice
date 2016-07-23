package com.steven.car_lend_system;

public class Calculate {
	private int TotalPrice = 0;
	
	public void AddMoney(int Money){
		TotalPrice += Money;
	}
	
	public void MultDay(int Day){
		TotalPrice *= Day;
	}

	public int getTotalPrice() {
		return TotalPrice;
	}
}
