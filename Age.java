import java.util.Scanner;
class Age{
    static Scanner sc=new Scanner(System.in);
    public static void main(String []args){
        System.out.println("/t/t/tEnter Your age:");
        int age=sc.nextInt();
        if(age>0&&age<=15){
            System.out.println("/t/t/t you are child");
        }
        else if(age>=15 && age<=20){
            System.out.println("/t/t/tyou are teanage");
        }
        else if(age>20 && age<=30){
            System.out.println("/t/t/t you are adult");
        }
        else{
            System.out.println("veliya poda");
        }
        
    }

}