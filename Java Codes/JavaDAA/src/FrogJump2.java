public class FrogJump2 {
        static int [] memo ;
        static boolean [] found;

        static int solve(int n,int [] stones){
            if(found[n]) return memo[n];
            if(n==0 || n==1) return 0;
            int i =0;
            int j =0;

            return memo[n] = Math.abs(stones[i]-stones[j]);
        }
        public int maxJump(int[] stones){
            int n = stones.length;
            memo = new int[n+1];
            found = new boolean[n+1];
            return solve(n,stones);
        }

    static void main() {

    }
}
