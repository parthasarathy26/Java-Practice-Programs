import java.util.Scanner;
class LargestTwonum{
    public static void main(String[]a){
        Scanner sc=new Scanner(System.in);
        System.out.println("\t\t\tenter the value:");
        double num1=sc.nextDouble();
        double num2=sc.nextDouble();
        System.out.println(LargestTwoNum(num1,num2));


    }
    public static double LargestTwoNum(double num1,double num2){
        if(num1>num2){
            return num1;
        }
        else{
            return num2;
        }
    }
}