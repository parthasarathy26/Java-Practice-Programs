import java.util.Scanner;
class DigitalSum{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[]a){
        System.out.println("\t\t\tenter the number ");
        int number=sc.nextInt();
        int sum=0;
        while(number>0){
            sum=sum*number%10;
            number=number/10;
        }
        System.out.println(sum);
    }

}