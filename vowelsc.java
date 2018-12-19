import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
public static void main(String[] args)
{
char ch;
Scanner scan = new Scanner(System.in);
ch=scan.next().charAt(0);
if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
{
System.out.print("Vowel");
}
else if(ch=='f')
{
System.out.print("Consonant");
}
else
{
System.out.println("invalid");
}
}
}

