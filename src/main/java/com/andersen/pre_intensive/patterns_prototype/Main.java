package com.andersen.pre_intensive.patterns_prototype;

public class Main {

	public static void main(String[] args) {
		
		Chair chair1 = new Chair();
		chair1.material = "wood";
		chair1.weight = 3;
		chair1.Colour = "brown";
		
		Table table1 = new Table();
		table1.material = "plastic";
		table1.weight = 5;
		table1.Colour = "white";
		
		System.out.println("chair1 " + chair1);
		Chair chair2 = (Chair) chair1.clone();
		System.out.println("chair2 " + chair2);
		
		System.out.println("table1 " + table1);
		Table table2 = (Table) table1.clone();
		System.out.println("table2 " + table2);
	}

}
