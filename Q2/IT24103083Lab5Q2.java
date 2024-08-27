import java.util.Scanner;
  public class IT24103083Lab5Q2 {
    public static void main(String [] args) {
      int num;
      Scanner scanner= new Scanner(System.in);
    
      System.out.print("Enter the numbers intrioduced:");
      
      num =scanner.nextInt();
      

      if(num<0) {
      System.out.print("The number of new members must be 0 0r greater");
      }
      else{
      switch(num){
         
      case 0:
      System.out.println("No prize");
      break;
     
      case 1:
      System.out.println("Prize is a:Pen");
      break;
     
      case 2:
      System.out.println("Prize is a:Umbrella");
      break;
      
      case 3:
      System.out.println("Prize is a:Bag");
      break;
     
      
      case 4:
      System.out.println("Prize is a:Travelling chair");
      break;
      
      default:
      System.out.println("Prize is a: Headphone");
      break;
      }
      }
      }
}
      
          

           