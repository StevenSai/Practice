package com.steven.car_lend_system;

public class Cars {
	boolean TakePerson = false;
	boolean TakeThings = false;
	String name = null;
	int PersonNum = 0;
	int ThingsNum = 0;
	int Price = 0;

	public Cars(boolean takePerson, boolean takeThings, String name, int personNum, int thingsNum, int price) {
		super();
		TakePerson = takePerson;
		TakeThings = takeThings;
		this.name = name;
		PersonNum = personNum;
		ThingsNum = thingsNum;
		Price = price;
	}
	
	
	@Override
	public String toString() {
		if(TakeThings&&TakePerson){
			return  name + "\t\t载客数" + PersonNum + "人\t\t载货数" + ThingsNum + "吨\t\t价格" + Price + "元";
		}else if(TakeThings){
			return  name + "\t\t载货数" + ThingsNum + "吨\t\t价格" + Price + "元";
		}else{
			return  name + "\t\t载客数" + PersonNum + "人\t\t价格" + Price + "元";
		}
	}
	
}
