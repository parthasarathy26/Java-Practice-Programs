import java.util.Scanner;
class CountNmbers{
     static Scanner sc=new Scanner(System.in);
    public static void main(String[]a){
        System.out.println("\t\t\t enter the number");
        int number=sc.nextInt();
        int count=0;
        while(number>0){
            number=number/10;
            count++;
        }
        System.out.println(count);

    }
}