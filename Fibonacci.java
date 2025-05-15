import java. util.Scanner;
class Fibonacci{

    public static void main(String[]a){
    Scanner sc=new Scanner(System.in);
    System.out.println("\t\t\t enter the series");
    int series=sc.nextInt();
    int n1=0;
    int n2=1;
    System.out.println(n1);
     System.out.println(n2);
    for(int i=2;i<=series-2;i++){
       int  n3=n1+n2;
        System.out.println(n3);
        n1=n2;
        n2=n3;
    }
    }


}