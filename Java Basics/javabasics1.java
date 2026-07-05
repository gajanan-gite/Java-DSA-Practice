import java.util.*;
public class javabasics1 {
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        // String input =sc.next();
        // System.out.println(input);

        // String name =sc.nextLine();
        // System.out.println(name);

        // int num=sc.nextInt(); 
        // System.out.println(num);
        //   int a=sc.nextInt();
        //   int b=sc.nextInt();
        //   int sum=a+b;
        //   System.out.println(sum);

        //type convertion

        // float number=sc.nextInt();
        // System.out.println(number);
        // possible
        // int number=sc.nextFloat();// gives error
        // System.out.println(number);

        // type casting
        float e=25.12f;
        int f=(int)e;
        System.out.println(f);

        char ch='a';
        char ch2='b';
        int number=ch;
        int number2=ch2;
        System.out.println(number);
        System.out.println(number2);

        // type promotion in java
        // 1) automatically promotes the byte,short and char into int whie evaluating
        // 2) if one oprtand is long, float , double whole exoression is promoted to lagest one 
    } 
}
