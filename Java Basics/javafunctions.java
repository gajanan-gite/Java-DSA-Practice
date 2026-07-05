import java.util.Scanner;

public class javafunctions {
    public static void printhelloworld(){
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
        
    }
    public static int  calculatesum(int num1,int num2)//num 1, num2 parametes or formal paramerters
    {
        int sum=num1+num2;
        return sum;
    }
    public static int factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
         return f;//factorial of n
    }
    public static int binocoefficient(int n,int r){
        int n_fact=factorial(n);
        int r_fact=factorial(r);
        int nr_fact=factorial(n-r);
        int binCoff=n_fact/(r_fact*nr_fact);
        return binCoff;
    }

    // public static boolean isPrime(int n){
    //      if(n==2){
    //          return true;
    //          }
    //     boolean isPrime=true;
    //     for(int i=2;i<=n-1;i++){
    //         if(n%i==0){
    //             isPrime=false;
    //             break;
    //         }
    //     }

    //     return isPrime;
    // }

    //optimized
    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }

        return true;
    }

    public static void primesinrange(int n){
        for (int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void BintoDec(int Binnum){
        int mynum=Binnum;
        int pow=0;
        int decNum=0;

        while(Binnum>0){
            int lastDigit=Binnum%10;
            decNum=decNum+(lastDigit*(int)Math.pow(2,pow));

            pow++;
            Binnum=Binnum/10;
        }
        System.out.println("decimal of "+mynum +"="+decNum);
    }
    public static void DectoBin(int Decnum){
        int mynum=Decnum;
        int pow=0;
        int Binnum=0;

        while(Decnum>0){
            int rem=Decnum%2;
            Binnum=Binnum+(rem*(int)Math.pow(10,pow));

            pow++;
            Decnum=Decnum/2;
        }
        System.out.println("binary of "+mynum +"="+Binnum);
    }
    public static void main(String arg[]){
        DectoBin(12);
    }
}
 