import java.util.Scanner;
public class Ques3 {
    public static void main(String[] args) {
        System.out.println("Enter the mark of three subject:");
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=a+b+c;
        float e=(d*100)/300;
        System.out.println("Total marks:"+d);
        System.out.println("Percentage:"+e);
    }
}