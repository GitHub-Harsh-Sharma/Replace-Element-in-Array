import java.util.Scanner;

class Arrayreplace {
    int a[], n, m, c, d;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size:");
        n = sc.nextInt();
        a = new int[n];

        System.out.print("Enter elements:");
        for (m = 0; m < n; m++) {
            a[m] = sc.nextInt();
        }
    }

    public void print() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Searching elements:");
        c = sc.nextInt();

        System.out.print("Enter Replace elements:");
        d = sc.nextInt();
        for (int i = 0; i < n; i++)
            if (a[i] == c)
                a[i] = d;

        System.out.println("Elements are:");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        Arrayreplace ar = new Arrayreplace();
        ar.input();
        ar.print();
    }
}
