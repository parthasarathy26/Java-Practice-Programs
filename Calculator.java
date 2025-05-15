class Calculator{
    public static int Addtition(int a,int b){
        return a+b;
    }
    public static int Subraction(int a,int b){
        return a-b;
    }
    public static int Multiplication(int a,int b){
        return a*b;
    }
    public static int Division(int a, int b){
        return a/b;
    }
    public static int modulus(int a, int b){
        return a%b;
    }

public static void main (String[] args){
    int a =10;
    int b=5;
    System.out.println(Addtition(a,b));
    System.out.println(Multiplication(a,b));
    System.out.println(Subraction(a,b));
    System.out.println(Division(a,b));
    System.out.println(modulus(a,b));
    
}}