package javaproject22504;

public class Person {
	String name;
	int age;
	Person(String x,int n)
	{
		name = x;
		age = n;
	}
	void print_details()
	{
		System.out.println("the name of the person is "+ name);
		System.out.println("the age of the person is "+age);
	}

	public static void main(String[] args) {
		Person p1 = new Person("Taruni",18);
		p1.print_details();

	}

}
