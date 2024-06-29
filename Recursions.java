import java.util.*;
public class Recursions{
    public static void factorial(int i,int n, int fact){
        if(i==n){
            fact=fact*i;
            System.out.println(fact);
            return;
        }
        fact=fact*i;
        factorial(i+1, n, fact);
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        factorial(1, n, 1);
    }
}