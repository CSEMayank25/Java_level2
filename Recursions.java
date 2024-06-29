import java.util.*;
public class Recursions{
    public static void sumOfNumb(int i, int n, int sum){
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        sumOfNumb(i+1, n, sum);
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sumOfNumb(1, n, 0);
    }
}