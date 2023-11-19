import java.util.Scanner;
 public class Years{
 public static void main(String[] args){
 Scanner input= new Scanner(System.in);

 System.out.println("Enter the month: ");
 int month=input.nextInt(); 
 System.out.println("Enter the year: ");
 int year= input.nextInt();
 

if(month ==1) System.out.print("January has 31");

if(month ==2 && year%4 == 0)System.out.print("feburary is 29");

if(month ==2 && year%4 !=0) System.out.print("Feburary has 28");

if(month ==3) System.out.print("March has 31");

if(month ==4) System.out.print("April has 30");

if(month ==5) System.out.print("May has 31");

if(month ==6) System.out.print("June has 30");

if(month ==7) System.out.print("July has 31");

if(month ==8) System.out.print("August has 31");

if(month ==9) System.out.print("September has 30");

if(month ==10) System.out.print("October has 31");

if(month ==11) System.out.print("November has 30");

if(month ==12) System.out.print("december has 31");
 
 





}
}