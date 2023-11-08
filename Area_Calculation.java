package javaproject22504;

public class Area_Calculation {
	int area(int a , int b)
	{
		int r = a*b;
		return r;
	}
	double area(float a)
	{
		double r = 3.14*a*a;
		return r;
	}
	int area(int s)
	{
		int r = s*s;
		return s;
	}
	public static void main(String[] args) {
		Area_Calculation o1 = new Area_Calculation();
		System.out.println("the area of rectangle is :"+o1.area(20,30));
		System.out.println("the area of Circle is :"+o1.area(3f));
		System.out.println("the area of the square is :"+o1.area(5));
	}

}
