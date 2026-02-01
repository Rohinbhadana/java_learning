import java.util.Scanner;
public class questionNEsted{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter numbers");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    
    if(a>b){
        System.out.println("a is greater than b ");
        if(a>c){
            System.out.println("a is greater than c");
            System.out.println("A is largest"+a);
        }else{
            System.out.println("c is bigger than a");
            System.out.println("c is largest"+c);
        }
    }else{
        if(b>c){
            System.out.println("b is greater than c");
            System.out.println("B is the largest no."+b);
        }else{
            System.out.println("c is bigger than b");
            System.out.println("C is Largest"+c);
        }
    }
    }
    
}
