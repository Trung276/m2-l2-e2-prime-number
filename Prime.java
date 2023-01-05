import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = sc.nextInt();
        int count = 0;
        int N = 2;
        System.out.println("The " + number + "th prime number:");
        while (count < number) {
            int cnt = 0;
            for (int i = 1; i <= N; i++) {
                if(N - (N / i) * i == 0) cnt ++;
            }
            if(cnt == 2) {
                System.out.println(N);
                count++;
            }
            N++;
        }
    }
}
