package javaproject22504;

public class Is_Pallindrome {
	String method(String s)
	{	
		for(int i =0;i<s.length();i++)
		{
			if(s.charAt(i)==s.charAt((s.length()-1)-i))
			{
				continue;
			}
			else 
			{
				return "not pallindrome";
			}
		}
		return "Pallindrome";	
	}
	public static void main(String[] args) {
		Is_Pallindrome s1 = new Is_Pallindrome();
		System.out.println(s1.method("mom"));
		System.out.println(s1.method("mother"));
		System.out.println(s1.method("madam"));
	}

}
