import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        // code here
        if(n < m) System.out.println("less");
        if(n > m) System.out.println("greater");
        if(n == m) System.out.println("equal");
    }
}