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
		int len = cars.length;
		for(Cars car : cars){
			System.out.println(car.toString());
		}
	}
	
}
