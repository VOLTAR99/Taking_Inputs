import java.util.Scanner;
public class Ques4 {
    public static void main(String[] args) {
        System.out.println("Enter the number of terms:");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        for (int i=0;i<a;i++){
            System.out.println("enter 2 numbers to print:");
            int b=sc.nextInt();
            int c=sc.nextInt();
            int e=b+c;
            System.out.println("the sum of 2 numbers is:"+e);
        }
    }
}