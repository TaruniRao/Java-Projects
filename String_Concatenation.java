package javaproject22504;

public class String_Concatenation {
	void concat(String s1,String s2)
	{
		s1 = s1+" " +s2;
		System.out.println("the string after concatenation is :"+s1);
	}

	public static void main(String[] args) {
		String_Concatenation s = new String_Concatenation();
		s.concat("Taruni","Rao");
	}

}
