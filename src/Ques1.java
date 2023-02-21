import java.util.Scanner;
public class Ques1 {
    public static void main(String[] args) {
        System.out.println("Enter your name,roll number and field of interest:");
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int roll=sc.nextInt();
        String field=sc.next();
        System.out.println("Name:"+a);
        System.out.println("Roll No:"+roll);
        System.out.println("Field of interest:"+field);

    }
}
