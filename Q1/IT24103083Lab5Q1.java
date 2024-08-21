import java.util.Scanner;
 public class IT24103083Lab5Q1{

  public static void main(String[] args){
     int num1;
     int num2;
     int num3;
     int max;
     int min;
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter the first integer: ");
   num1 =sc.nextInt();
   System.out.print("Enter the second integer: ");
   num2=sc.nextInt();
   System.out.print("Enter the third integer: ");
   num3=sc.nextInt();
   System.out.print("User entered numbers are:"+num1+" "+num2+" "+num3 );


   System.out.println();
   if (num1>num2){
     
      max=num1;
      min=num2;}
  else{
       max=num2;
       min=num1;}
  if (num3>max){
      max=num3;} 
  else if(num3<min){
      min=num3;}
  
    System.out.println("The smallest number is: "+min);
    System.out.println("The largest number is: "+max);
 }
}

 
      
      

   
 