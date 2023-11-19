import java.util.Scanner;
 public class RateExchange{
 public static void main(String[] args){
 Scanner input= new Scanner(System.in);
 
 System.out.print("Enter exchange rate: ");
 double exchangerate=input.nextDouble();
 System.out.print("Enter 0 to covert dollar to rmb and vice verse: ");
 int dollar=input.nextInt();
 if(dollar==0){
 System.out.print("Enter the amount of dollar: ");
 double Dollar=input.nextDouble();
 double DollarToRmb=Dollar * exchangerate;
 System.out.printf("$%.1f to Rmb is %.1f yuan",Dollar,DollarToRmb);
}

if(dollar==1){
System.out.print("Enter the amount of Rmb: ");
double Rmb= input.nextDouble();
double RmbToDollar=Rmb/ exchangerate;
 System.out.printf("%.1f to Dollar is %.1f",Rmb, RmbToDollar);
}




}

}