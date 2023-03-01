package com.tasks.kalai;

public class Customer {
	//Object variable or Instance variable or Normal variable
	private String name;
	private Short partnerscount;
	private int employees;
	private Long contactnum;
	private Float brandvalue;
	private Double marketcap;
	private char site;
	//static or class variable
	private static String companyname;
	//final static variable
	private final static Boolean indiancom = false;    
	
	public void method1() {
		System.out.println("Method1 value is:" + "hey ms.Kalai");
	}   
	public static void method2() {
		System.out.println("Method2 value is:" + "hey java");
	}
	public void method3(int a, int b) {
		System.out.println("Method3 value is:" + a + ","+b);
	}
	public static void method4() {
		String name = "core";
		String name1 = "java";
		
		System.out.println("Method4 value is:" + name+" "+name1);
	}
	public int method5() {
		short num = 1;
		short num1 = 2;
		int num3 = (num-num1);
		System.out.println("Method5 value is:"+ num3);
		return num3;
	}
	
	public static void main(String[] args) {
		Customer firm = new Customer();
		firm.name = "Larry Page";
		firm.partnerscount = 0;
		firm.employees = 139995;
		firm.contactnum = 18004190157L;
		firm.brandvalue = 1.59f;
		firm.marketcap = 1583882908800.00;
		firm.site = 'A';
		Customer.companyname = "Google";
		
		System.out.println("Founder Name is: "+ firm.name);
		System.out.println("Partners Count:  "+ firm.partnerscount);
		System.out.println("Total Employees:"+ firm.employees);
		System.out.println("Contact Number:"+ firm.contactnum);
		System.out.println("Brand Value:"+ firm.brandvalue);
		System.out.println("Market Capacity  :"+ firm.marketcap);
		System.out.println("Company Site:"+ firm.site);
		System.out.println("Company Name:"+ companyname);
		System.out.println("Is Indian Company:"+ indiancom);
		System.out.println("-------------------------------------------------METHODS--------------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		firm.method1();
		Customer.method2();
		firm.method3(5,2);
		Customer.method4();
		int num3 = firm.method5();
				
	}
	
	
}


  