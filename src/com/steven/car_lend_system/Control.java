package com.steven.car_lend_system;

import java.util.Scanner;

public class Control {
	
	public boolean Initial(){
		Scanner sc = new Scanner(System.in);
		System.out.println("欢迎使用Steven租车系统!");
		System.out.println("您是否要租车？1是 0否");
		int lend = sc.nextInt();
		if(lend == 1)
			return true;
	    return false;
	}
	
	public void Print(Cars[] cars){
		int len=1;
		System.out.println("详细的车辆信息列表如下：");
		for(Cars car : cars){
			System.out.println(len+"."+car.toString());
			len++;
		}
	}
	
	public void GetInput(Cars[] cars){
		Calculate MyCal = new Calculate();
		Scanner sc = new Scanner(System.in);
		System.out.println("您想租几辆车？");
		int CarNumber = sc.nextInt();
		Cars[] YourLends = new Cars[CarNumber];
		for(int i=0;i<CarNumber;i++){
			System.out.println("请输入您想租的第"+(i+1)+"辆车的编号：");
			YourLends[i] = cars[sc.nextInt()-1];
			MyCal.AddMoney(YourLends[i].Price);
			MyCal.AddPerson(YourLends[i].PersonNum);
			MyCal.AddThings(YourLends[i].ThingsNum);
		}
		System.out.println("请输入您想租的天数：");
		int Day = sc.nextInt();
		MyCal.MultDay(Day);
		
		System.out.println("您的账单：\n***可载人的车有：");
		for(Cars car:YourLends){
			if(car.TakePerson){
				System.out.print("  "+car.name);
			}
		}
		System.out.print("  共载人："+MyCal.getTotalPerson()+"人\n");
		
		System.out.println("***可载货的车有：");
		for(Cars car:YourLends){
			if(car.TakeThings){
				System.out.print("  "+car.name);
			}
		}
		System.out.print("  共载货："+MyCal.getTotalThings()+"吨\n");
		System.out.println("***租车总价格："+MyCal.getTotalPrice()+"元");
	}
	
	
	
}
