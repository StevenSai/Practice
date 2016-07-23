package com.steven.car_lend_system;

public class MainTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Cars(boolean takePerson, boolean takeThings, String name, int personNum, int thingsNum, int price)
		Cars[] cars = new Cars[6];
		cars[0] = new Cars(true,false,"奥迪A4",4,0,500);
		cars[1] = new Cars(true,false,"马自达6",4,0,400);
		cars[2] = new Cars(true,true,"皮卡车",4,2,450);
		cars[3] = new Cars(true,false,"金龙",20,0,800);
		cars[4] = new Cars(false,true,"松花江",0,4,400);
		cars[5] = new Cars(false,true,"依维柯",0,20,1000);
		
		//模拟初始化车辆情况完毕
		
		Control SystemRuning = new Control();
		
		//系统开始跑
		
		boolean Step1 = SystemRuning.Initial();
		
		if(Step1){
			SystemRuning.Print(cars);
		}
		
	}
}
