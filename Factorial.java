import java.util.Scanner;
class Factorial{
    public static void main(String[]a){
        Scanner sc=new Scanner(System.in);
        System.out.println("\t\t\tenter the number:");
        int number=sc.nextInt();
        int ans=1;
        for(int i=2;i<=number;i++){
            ans=ans*i;
        }
        System.out.println(ans);
    }

}