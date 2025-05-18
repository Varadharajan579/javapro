import java.util.Scanner;
public class Home4{
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num1 = scanner.nextInt();
        System.out.println("Enter a number");
        int num2 = scanner.nextInt();
       System.out.println("Enter a number");
        int num3 = scanner.nextInt();
    
    
         int  smallest = num1;
         if(num1 <= num2 && num1 <= num3){
             smallest=num1;
            }else if(num2 <= num1 && num2 <= num3){
                smallest=num2;
            }else{
                smallest=num3;
            }
            System.out.println("The smallest number is: " + smallest);

         scanner.close();





 }

}