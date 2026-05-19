import java.util.Scanner;

public class FibUsingDP {
    static int fibo(int n, int [] temp){
        if(n == 0) return 0;
        if(n == 1) return 1;

        if(temp[n] != 0)  return temp[n];
        temp[n] = fibo(n - 1, temp) + fibo(n - 2, temp);
        return temp[n];
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n :");
        int n = input.nextInt();
        int[] dp = new int[n + 1];
        System.out.println("Nth Fibonacci Number = " + fibo(n, dp));

    }
}
