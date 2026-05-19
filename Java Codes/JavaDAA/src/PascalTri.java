import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class PascalTri {
    static List<List<Integer>> memo;
    static boolean[] found;

    static void solve(int n){
        if(n==0) return;
        if(found[n]) return;

        solve(n-1); //recursive call

        List<Integer> row = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(i==0 || i==n-1) row.add(1);
            else{
                int val = memo.get(n-2).get(i-1) + memo.get(n-2).get(i);
                row.add( val );
            }
        }
        memo.add(row);
        found[n] = true;
    }
    public static List<List<Integer>> generate(int n) {
        memo = new ArrayList<>();
        found = new boolean[n+1];
        solve(n);
        return memo;
    }
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(generate(n));
    }
}