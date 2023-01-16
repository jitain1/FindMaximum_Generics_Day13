package com.bridgelabz;

import java.util.ArrayList;
import java.util.Collections;

public class FindMax <E> {

	<E extends Comparable<E>> E checkMaximum(E var1, E var2, E var3, E var4, E var5) {
		ArrayList<E> list = new ArrayList<>();
		list.add(var1);
		list.add(var2);
		list.add(var3);
		list.add(var4);
		list.add(var5);
			
		return Collections.max(list) ;
	}
	
	public static void main(String[] args) {
		FindMax<Integer> intObj = new FindMax<>();
		System.out.println("The maximum Integer is : " + intObj.checkMaximum(1, 7, 15 , 14, 10));
		
		FindMax<Float> floatObj = new FindMax<>();
		System.out.println("The maximum Float is : " + floatObj.checkMaximum(1.25f,11.480f, 9.55f, 10.589f, 9.568f));
		
		FindMax<String> stringObj = new FindMax<>();
		System.out.println("The maximum String is : " + stringObj.checkMaximum("Apple", "Peach", "Banana", "Grapes", "Orange"));
		
	}

}