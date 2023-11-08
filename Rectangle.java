package javaproject22504;

public class Rectangle {
	int length;
	int bredth;
	Rectangle(int l,int b)
	{
		length = l;
		bredth = b;
	}
	int area()
	{
		int a = length * bredth;
		return a;
	}
	int perimeter()
	{
		int p = 2*(length +bredth);
		return p;
	}

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(30,10);
		System.out.println("the area of the rectangle is :"+r1.area());
		System.out.println("The perimeter of the rectangle is :"+r1.perimeter());
	}

}
