import java.util.Scanner;
public class Fahrenheit{
public static void main(String[] args){
 Scanner input=new Scanner(System.in);

 System.out.print("Enter as celsius: ");
 double number1= input.nextDouble();

 double fahrenheit  = ((9/5)*number1 + 32);                                                                              
 System.out.printf("%.2f Celsius To Fahrenheit is %.3f ",number1,fahrenheit);




}





}