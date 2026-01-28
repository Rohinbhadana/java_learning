// import java.util.Scanner;
// public class userinput04 {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter your age");
//         int age=sc.nextInt();
//         System.out.println("your age is "+age);
//     }
    
// }

import java.util.Scanner;
public class userinput04{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enternumbers");
        int firstnumber = sc.nextInt();
        int secondnumber = sc.nextInt();
        int result=firstnumber+secondnumber;
        System.out.println(result);
    }
}