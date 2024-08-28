public class Staircase {

    public int climbStairs(int n) {
        int[] arr = new int[n+1];
        arr[0]=1;
        arr[1]=1;
        for (int i=2; i<n+1; i++){
            arr[i]= arr[i-1]+arr[i-2];    // arr[2]=arr[i-1]+arr[i-2]
        }
        return arr[n];
    }

    public static void main(String[] args) {
        Staircase staircase = new Staircase();

        int n1 = 2;
        System.out.println("Number of ways to climb " + n1 + " steps: " + staircase.climbStairs(n1));

        int n2 = 3;
        System.out.println("Number of ways to climb " + n2 + " steps: " + staircase.climbStairs(n2));
    }
}