import java.util.*;  
class interestcalculation   
{  
public static void main(String[] args)  
{  
Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
System.out.print("Enter your amount- ");  
int p= sc.nextInt();  
  Scanner sc= new Scanner(System.in); 
System.out.print("Enter your rate- ");  
int r= sc.nextInt();  
  Scanner sc= new Scanner(System.in); 
System.out.print("Enter your timeduration- ");  
int t= sc.nextInt();  
int d=(p * r * t)/100;  
System.out.println("Total= " +d);  
}  
}  
