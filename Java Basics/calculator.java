import java.util.*;
public class calculator {
    // public static void main(String arg[]){
    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("enter a:");
    //     int a=sc.nextInt();
    //     System.out.println("enter b:");
    //     int b=sc.nextInt();
    //     System.out.println("enter operator:");
    //     char ch=sc.next().charAt(0);
    //     switch(ch){
    //         case '+': System.out.println(a+b);
    //                     break;
    //         case '-': System.out.println(a-b);
    //                     break;
    //         case '*': System.out.println(a*b);
    //                     break;
    //         case '/': System.out.println(a/b);
    //                     break;
    //         case '%': System.out.println(a%b);
            



    //     }
    // }
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Input the year: ");
int year = sc.nextInt();
boolean x = (year % 4) == 0;
boolean y = (year % 100) != 0;
boolean z = ((year % 100 == 0) && (year % 400 == 0));
if (x && (y || z)) {
System.out.println(year + " is a leap year");
} else {
System.out.println(year + " is not a leap year");
}
}
    
}
