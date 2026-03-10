package StringExample;

public class StringExample {
	public static void main(String[]args) {
		//literal way
	String s1 = "Hello";
	
	String s2 = "Hello";
	
System.out.println(s1==s2);

//new keyword
String s3 = new String("Hi");
String s4 = new String("Hi");
System.out.println(s3==s4);
System.out.println(s1.length());
System.out.println(s1.charAt(4));

System.out.println(s1.substring(3));

System.out.println(s1.substring(1, 4));

System.out.println(s1.concat("Java World"));
System.out.println("s1:" + s1);

System.out.println(s1.indexOf("e"));
System.out.println(s1.indexOf('1', 2));
System.out.println(s1.contains("E"));
	}
	}

