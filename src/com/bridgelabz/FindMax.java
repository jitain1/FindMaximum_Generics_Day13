package com.bridgelabz;

public class FindMax {

	float checkMaximum(Float x, Float y, Float z) {
		float max = x; //Assuming x is the largest (initially)

		if (y.compareTo(max) > 0)
			max = y; // y is the largest so far

		if (z.compareTo(max) > 0)
			max = z; // now z is the largest

		return  max;
	}

	public static void main(String[] args) {
		FindMax obj = new FindMax();
		System.out.println("The maximum Float is : " + obj.checkMaximum(2.25f, 5.52f, 7.026f));
		
	}

}