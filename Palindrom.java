// This is a Palindrom program
import java.util.*;
class Palindrom
{
public static void main(String [] args)
{
Scanner s=new Scanner(System.in);
String str1,str2="";
char ch;
System.out.println("ENTER THE STRING");
str1=s.nextLine();
for(int i=0;i<str1.length();i++)
{
ch=str1.charAt(i);
str2=ch+str2;
}
if(str1.equals(str2))
System.out.println(" GIVEN STRING IS PALINDROM");
else 
System.out.println(" GIVEN STRING IS NOT PALINDROM");
System.out.println("STR1=  "+str1);
System.out.println("STR2=  "+str2);
}
}