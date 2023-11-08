package javaproject22504;

public class Employee {
	String name;
	String job_title;
	int salary;
	int update_salary(int n)
	{
		salary = n + 10000;
		return salary;
	}

	public static void main(String[] args) {
		Employee e1 = new Employee();
		System.out.println("the updated salary is :"+e1.update_salary(90000));
	}

}
