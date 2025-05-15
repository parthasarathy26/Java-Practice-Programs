import java.util.Scanner;
class Home{
    public static void shapes(){
        Scanner sc=new Scanner(System.in);
        System.out.println("welcome to home page:");
        System.out.println("1.square\n2.triangle \n3.Swiggyapp");
        int input=sc.nextInt();
        switch(input){
            case 1:{
                int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(true){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");

                }          
            }
            System.out.println();
            break;

        }
            }
            case 2:{
               int  n=5;
               for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(i+j<=n-1){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
               }
               break;

            }
            

        }
        
    }
    


}