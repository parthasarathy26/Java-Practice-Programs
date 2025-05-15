import java.util.Scanner;

class Loginmaster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("\t\t\tWelcome to Login Master:");
            System.out.println("\t\t\tSelect the input:");
            System.out.println("\t\t\t1. Login");
            System.out.println("\t\t\t2. Sign_up");
            System.out.println("\t\t\t3. Forgot_Password");
            System.out.println("\t\t\t4. Exit");
            
            int input = sc.nextInt();
            
            switch (input) {
                case 1: {
                    // Login 
                    boolean result=Credential.Login();
                    if(result){
                        System.out.println("\t\t\tlogin sucessfully");
                        Home.shapes();
                        
                    }
                    else{
                        System.out.println("\t\t\tAccount not exist");
                    }
                    break;
                }
                case 2: {
                    boolean result = Credential.Sign_up();
                    if (result) {
                        System.out.println("Sign-up was successful!");
                    } else {
                        System.out.println("Error during sign-up.");
                    }
                    break;
                }
                case 3: {
                    boolean result=Credential.Forgot_password();
                    if(result){
                    System.out.println("\t\t\tEnter the  new password:");
                    int New_password=sc.nextInt();
                    Credential.db_password = New_password;
                    }
                    else{
                        System.out.println("\t\t\tcontact doesnot match");

                    }
                    
                    break;
                }
                case 4: {
                    // Exit
                    System.out.println("Exiting the page...");
                    break;
                }
               
            }
        }
    }
}
