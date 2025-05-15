import java.util.Scanner;
class Primenumber{
    public static void main(String[]a){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int number=sc.nextInt();
        int count=0;
        for(int i=2;i<number;i++){
            if(i%number==0){
                count++;
            }

        }
        if(count==0 && number>1){
            System.out.println("prime number");
        }
        else{
             System.out.println("not a prime number");

        }
       
        
    }

}