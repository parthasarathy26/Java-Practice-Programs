import java.util.Scanner;
class ReverseString{
    public static void main(String[]a){
        Scanner sc=new Scanner(System.in);
        System.out.println("\t\t\tenter the string:");
        String Orginal=sc.nextLine();
        String Reversed=""; 
        for(int i=Orginal.length()-1;i>=0;i--){
            Reversed=Reversed+Orginal.charAt(i);
        }    
        System.out.println("reversed String:"+Reversed);      
    
    }


}