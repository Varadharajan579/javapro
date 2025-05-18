import java.util.Scanner;
public class Home5{
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int i = scanner.nextInt();
        
         if(i<=500){
              System.out.println("offer:No discount is applied");
            }else if(i>=500 && i<=1000){
                  System.out.println("offer:10% discount is applied");
            }else{
                System.out.println("offer :20% discount is applied");
            }
           

         scanner.close();





 }

}