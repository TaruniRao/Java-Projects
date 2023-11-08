package javaproject22504;

public class Calculator {
	int add(int x,int y)
	{
		int r = x + y;
		return r;
	}
	int subtract(int x,int y) {
		int r  = x - y;
		return r;
	}
	int multiply(int x,int y) {
		int r = x*y;
		return r;
	}
	float divide(int x,int y)
	{
		float r = x/y;
		return r;
	}
	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println(c.add(2,3));
		System.out.println(c.subtract(4,7));
		System.out.println(c.multiply(4,8));
		System.out.println(c.divide(8,4));
	}
}
