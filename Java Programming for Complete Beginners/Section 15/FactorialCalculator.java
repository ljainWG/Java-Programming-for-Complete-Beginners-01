import java.util.Scanner;

public class FactorialCalculator {

    public int calculateFactorial(int number) {
        // Write your code here
        if(number<0)
        return -1;
        int result=1;
        for (int i=1;i<=number;i++){
            result*=i;
        }
        return result;
    }
    public static void main(String[] args){
        FactorialCalculator obj = new FactorialCalculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer");
        int num=sc.nextInt();
        int result= obj.calculateFactorial(num);
        System.out.printf("Factorial value of %d is %d",num,result).println();;
    }
}