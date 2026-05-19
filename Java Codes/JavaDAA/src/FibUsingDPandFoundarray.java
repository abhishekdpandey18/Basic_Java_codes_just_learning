import java.util.Scanner;

public class FibUsingDPandFoundarray {

    static int[] memo;
    static boolean[] found;

    static int fib(int n) {
        memo = new int[n + 1];
        found = new boolean[n + 1];
        return fibonacci(n);
    }
    static int fibonacci(int n) {
        if (found[n]) return memo[n];
        if (n == 0) return n;
        if (n == 1) return n;
        found[n] = true;
        memo[n] = fibonacci(n - 1) + fibonacci(n - 2);
        return memo[n];
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n :");
        int n = input.nextInt();
        System.out.println("Nth Fibonacci Number = " + fib(n));

    }
}
