// 1.4.3
import java.util.Scanner;

class Euclidean {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int n=10;
        int [] b =new int[n];
        int[] a= new int[n];
        for(int i =0; i < n;i++)
            a[i] = b[i];



        b[0]=3;
        b[1]=5;
        a[0]=7;
        a[1]=8;

        double sum = (b[0]-b[1]);
        double sum1= (a[0]-a[1]);
        double sum3= Math.pow(sum,2)+Math.pow(sum1,2);

        System.out.print(Math.sqrt(sum3));

    }
}