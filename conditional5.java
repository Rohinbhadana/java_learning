//    normal if else statement

// public class conditional5 {
//     public static void main(String[] args) {
//         int age=25;
//         if (age >= 18){
//         System.out.println("u can vote");
//     System.out.println("hey!");
//         } else {
//             System.out.println("u cannt vote");
//         }
//     }
    
// }
//  by using user input using if else
// import java.util.Scanner;
// public class conditional5 {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);

//         System.out.println("enter age");
//         int age=sc.nextInt();
//         if(age>=18){
//             System.out.println("person can vote");
//         }else{
//             System.out.println("u cannt vote");
//         }
//     }
// }

// public class conditional5 {
//     public static void main(String[] args) {
//         int day=8;
//         if (day == 1){
//         System.out.println("go to home");
//         } else {
//             System.out.println("go to office");
//         }
//     }
// }


// if - else if conditional statement

// public class conditional5{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter day");
//         int day =sc.nextInt();
//         if(day >=5 && day<15){
//             System.out.println("go to office");
//         }    else if(day==3){
//             System.out.println("go to palyground");
//         }else if(day==2){
//             System.out.println("go to kitchen");
//         }else if(day == 1){
//             System.out.println("go for a bike trip");
//         }else{
//             System.out.println("sit at home");
//         }
//     }
// }

//  Nested if else
// import java.util.Scanner;
// public class conditional5{
//     public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     System.out.println("Enter numbers");
//     int a=sc.nextInt();
//     int b=sc.nextInt();
//     int c=sc.nextInt();
    
//     if(a>b){
//         System.out.println("a is greater than b ");
//         if(a>c){
//             System.out.println("a is greater than c");
//             System.out.println("A is largest"+a);
//         }else{
//             System.out.println("c is bigger than a");
//             System.out.println("c is largest"+c);
//         }
//     }else{
//         if(b>c){
//             System.out.println("b is greater than c");
//             System.out.println("B is the largest no."+b);
//         }else{
//             System.out.println("c is bigger than b");
//             System.out.println("C is Largest"+c);
//         }
//     }
//     }
    
// }


// logical operators in if else

public class conditional5 {

    public static void main(String[] args) {
        
        int time=2;
        if(time>=5 && time<10){
            System.out.println("working time");
    }else{
        System.out.println("lunch time");
    }
}
}