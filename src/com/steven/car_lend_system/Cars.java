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
			return  name + " 载客数" + PersonNum + "人 载货数" + ThingsNum + "吨 价格" + Price + "元/天";
		}else if(TakeThings){
			//return  name + "载货数" + ThingsNum + "吨价格" + Price + "元";
			return  name  + " 载货数" + ThingsNum + "吨 价格" + Price + "元/天";
		}else{
			//return  name + "载客数" + PersonNum + "人价格" + Price + "元";
			return  name + " 载客数" + PersonNum + "人 价格" + Price + "元/天";
		}
	}
	
}
