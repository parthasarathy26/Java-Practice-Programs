import java.util.Scanner;
class Measurements{
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("\t\t\t Enter the side:");
        int side=sc.nextInt();
        System.out.println(areaOfSquare(side));
        System.out.println(PerimeterOfSquare(side));

    }
    public static int areaOfSquare(int side){
        return side*side;
    }
    public static int PerimeterOfSquare(int side){
        return 4*side;
    }

}