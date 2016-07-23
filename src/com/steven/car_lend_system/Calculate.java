package com.steven.car_lend_system;

public class Calculate {
	private int TotalPrice = 0;
	private int TotalPerson = 0;
	private int TotalThings = 0;
	
	public void AddMoney(int Money){
		TotalPrice += Money;
	}
	
	public void AddPerson(int Person){
		TotalPerson += Person;
	}
	
	public void AddThings(int Things){
		TotalThings += Things;
	}
	
	public void MultDay(int Day){
		TotalPrice *= Day;
	}

	public int getTotalPrice() {
		return TotalPrice;
	}
	
	public int getTotalPerson() {
		return TotalPerson;
	}
	
	public int getTotalThings() {
		return TotalThings;
	}
}
