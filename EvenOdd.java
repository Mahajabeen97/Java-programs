import java.util.Scanner;

class EvenOdd
{
  public static void main(String[] args)
 {
 int a;
 Scanner in=new Scanner(System.in);
 a=in.nextInt();
if(a%2==0)
  System.out.println("Even");
else if(a%2==1)
 System.out.println("Odd");
else 
  System.out.println("Invalid");
 }
  }
