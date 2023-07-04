package test2;

import java.util.Scanner;

public class Q4 {
  public static void main(String[] args){  
int a, b, c;
System.out.println("Enter three integers: "); 
Scanner scan = new Scanner(System. in );
a=scan.nextInt();  
b=scan.nextInt();  
c=scan.nextInt();
if(a>=b && a>=c)  
System.out.println(a+" is the largest Number");   
else if (b>=a && b>=c)  
System.out.println(b+" is the largest Number");  
else   
System.out.println(c+" is the largest number");  
}    
}