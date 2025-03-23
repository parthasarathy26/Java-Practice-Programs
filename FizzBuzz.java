import java.util.Scanner;
class FizzBuzz{
    static Scanner sc=new Scanner(System.in);
    public static void main (String[]args){
        System.out.println("/t/t/tEnter your number");
        int number=sc.nextInt();
        if(number%3==0 && number%5==0){
            System.out.println("Fizz BUzz");
        }
        else if(number%3==0){
            System.out.println("Fizz");
        }
        else if(number%5==0){
            System.out.println("Buzz");
        }
        else{
            System.out.println("not valid");
        }
    }

}