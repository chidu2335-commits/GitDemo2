package corejavabrushup3;

public class corejavabrushup3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//String s = "Rahul shetty academy";
String s1 = "Rahul shetty academy";
String s5 = "hello";

String s2 = new String("welcome");
String s3 = new String("welcome");

String s = "Rahul shetty academy";
String[] splittedString = s.split(" ");

System.out.println(splittedString[0]);
System.out.println(splittedString[1]);
System.out.println(splittedString[1].trim());
//System.out.println(splittedString[2]);
for(int i =s.length()-1;i>=0;i--)
{
	System.out.println(s.charAt(i)); 
}
	}

}
