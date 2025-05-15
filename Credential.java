import java.util.Scanner;

class Credential {
    static Scanner sc = new Scanner(System.in);
    static int db_uid;
    static int db_password;
    static long Contact;
    static char gender;

    public static boolean Sign_up() {
        System.out.println("\t\t\tWelcome to the Sign-up page!");
        System.out.println("\t\t\tEnter the db_uid:");
        db_uid = sc.nextInt();
        System.out.println("\t\t\tEnter the db_password:");
        db_password = sc.nextInt();
        System.out.println("\t\t\tEnter the db_Contact:");
        Contact = sc.nextLong();
        System.out.println("\t\t\tEnter the db_gender (M/F):");
        gender = sc.next().charAt(0);
        if (db_uid > 0 && db_password > 0 && Contact > 0) {
            return true;
        } else {
            System.out.println("Invalid input. Please try again.");
            return false;
        }
    }
    public static boolean Login(){
        System.out.println("\t\t\tWelcome to the Login page!");
        System.out.println("\t\t\tEnter the uid:");
        int uid=sc.nextInt();
        int db_uid=uid;
        System.out.println("\t\t\tEnter the password:");
        int password=sc.nextInt();
        if (uid == db_uid && password == db_password){
           return true;
        }
        else{
            return false;
        }  
    }
    public static boolean Forgot_password (){
    System.out.println("\t\t\tWelcome to the  Forgot_password page!");
    System.out.println("\t\t\tEnter the contact:");
    long contact=sc.nextLong();
    long db_Contact=contact;
    if(contact==db_Contact){
        return true;
    }
    else{
        return false;

    }



    }
}
