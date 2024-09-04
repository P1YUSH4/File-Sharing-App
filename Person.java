import java.util.* ;
import java.io.*; 
class Person {
	
	String name;
	int age;
	public void setValue(String a, int b)
	{
		this.name=a;
		this.age=b;
	}
	public void getValue()
	{
		System.out.println(name);
		System.out.println(age);
	}
}

class Solution {
	
	public static void main(String args[]) {
		
		// Write your code here
		Scanner sc=new Scanner(System.in);
		String name;int age;
		name=sc.next();
		age=sc.nextInt();
		Person p=new Person();
		p.setValue(name,age);
		p.getValue();
	}
}