import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);// to take user input
        int n = sc.nextInt(); // taking user input
        int i,fact = 1;
        for (i=1;i<=n;i++){

            fact = fact*i;
        }
        System.out.println(fact); // printing the factorial 
    }
}
