package com.cg.mobile.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	
	
	public static HashMap<Integer, Purchase_details> purchase(Purchase_details p)
	{ int orderid=100;
		
		ArrayList<Purchase_details> obdetail = new ArrayList<>(); 
		obdetail.add(p);
		
		HashMap<Integer,Purchase_details > hm2 = new HashMap<>();
		for(int i=0;i<obdetail.size();i++)
		{
			hm2.put(orderid, obdetail.get(i));
			orderid++;
		}
		
		return hm2;
		
	}
	
public void addPurchaseDetails(HashMap<Integer, Mobile_info> hm1,HashMap<Integer, Purchase_details> hm2)
{
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile_info ob1=new Mobile_info("Samsung","1000",500,4);
		Mobile_info ob2=new Mobile_info("Samsung","1100",700,4);
		Mobile_info ob3=new Mobile_info("Nokia","1200",1000,4);
		Mobile_info ob4=new Mobile_info("Motorola","1300",600,4);
		Mobile_info ob5=new Mobile_info("Oppo","1400",400,4);
		HashMap<Integer,Mobile_info > hm1 = new HashMap<>();
		hm1.put(100, ob1);
		hm1.put(101, ob2);
		hm1.put(102, ob3);
		hm1.put(103, ob4);
		hm1.put(104, ob5);
		Main obj4=new Main();
		obj4.addPurchaseDetails(hm1,obj3);
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter mobile id to be bought");
		int Id=scanner.nextInt();
		scanner.nextLine();
		System.out.println("enter your name");
		
		String name=scanner.nextLine();
		
		System.out.println("enter phone no.");
		long num=scanner.nextLong();
		Purchase_details obj1=new Purchase_details(name,num,Id);
		HashMap<Integer, Purchase_details> obj3=purchase(obj1);
		for(Integer key :obj3.keySet())
		{
			String keys = key.toString();
			String value = obj3.get(key).toString();
			System.out.println(keys +"  "+ value);
		}

	}

}
