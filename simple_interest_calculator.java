import java.util.Scanner;
public class simpleinterest{
    public static void main(String[] args){
        double simpleInterest,principal,rate,time;
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Principal: ");
        principal =scan.nextDouble();

        System.out.println("Rate: ");
        rate = scan.nextDouble();

        System.out.println("Time: ");
        time = scan.nextDouble();

        simpleInterest = (principal * time * rate);

        System.out.println("The Simple Interest:\t$" + simpleInterest);

    }


}
