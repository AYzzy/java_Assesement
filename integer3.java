import java.util.Scanner;
 public class integer3{
 public static void main(String[] args)	{
 Scanner input= new Scanner(System.in);

 System.out.print("Enter 1st integer: ");
 int integer1 = input.nextInt();
  System.out.print("Enter 2nd integer: ");
 int integer2 = input.nextInt();
  System.out.print("Enter 3rd integer: ");
 int integer3 = input.nextInt();

if (integer1 > integer2 && integer1 > integer3)
{
	System.out.print(integer1);
	System.out.print(integer2);
	System.out.print(integer3);
}




}
}