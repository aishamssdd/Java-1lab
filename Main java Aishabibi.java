import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextInt();
        float b = sc.nextInt();
        if(a > b) {
            System.out.println(a + "is greater than " + b);
        } else if(b < a) {
            System.out.println(a + "is less than " + b);
        } else {
            System.out.println("Two numbers are equal");
        }
    }
}

/*
    task 1
        float a = sc.nextInt();
        float b = sc.nextInt();
        if(a > b) {
            System.out.println(a + "is greater than " + b);
        } else if(b < a) {
            System.out.println(a + "is less than " + b);
        } else {
            System.out.println("Two numbers are equal");
        }

        task 2
        int a = sc.nextInt();
        if ((a / 100000) + ((a / 10000) % 10) + ((a / 1000) % 10) == ((a / 100) % 10) + ((a / 10) % 10) + (a % 10)) {
            System.out.println("Yes");
        } else System.out.println("No");
    }

        task 3
        int a = sc.nextInt();
        int t1 = sc.nextInt();
        int t2 = sc.nextInt();
        int b = 20/t1;
        if(b > (a-20)/t2) {
            System.out.println("Before");
        } else System.out.println("After");

        task 4
        float x = sc.nextFloat();
        float y = sc.nextFloat();
        if((5*x*x) - (7*x) + 2 == y) {
            System.out.println("Yes");
        } else System.out.println("No");
        task 5
        int n = sc.nextInt();
        int sum = 0;
        while (n!=0) {
            if(n % 2 != 0) {
                sum+=n;
            }
            n = sc.nextInt();
            if(n==0) {
                break;
            }
        }
        System.out.println(sum);

        task 6
        float n = sc.nextFloat();
        float sum = 1;
        for (float i = 2; i <= n; i++) {
            sum += 1/i;
        }
        System.out.println(sum);

        task 7
        // y = -2.4x^2 + 5x - 3
        double n = sc.nextFloat();
        double m = sc.nextFloat();
        while (n != m+0.5) {
            double y = (-2.4*(n*n)) + (5*n) - 3;
            System.out.println(n + " " + y);
            n+=0.5;
            if(n == m+0.5) {
                break;
            }
        }

        task 8

        int n = sc.nextInt();
        float r = 1;
        float a = 3;
        for (int i = 2; i <= n; i++) {
                if (i % 2 == 0) {
                    r = r - (1/a);
                    a += 2;
                }
                if (i % 2 != 0) {
                    r = r + (1/a);
                    a += 2;
                }
            }
        System.out.println(r);

        task 9
        int n = sc.nextInt();
        int sum = 0;
        while(n!=0) {
            sum+= n%10;
            n/=10;
        }
        System.out.println(sum);
*/