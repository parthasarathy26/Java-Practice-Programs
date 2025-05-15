import java.util.Scanner;
class Measurements1{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("\t\t\t enter the length and breadth:");
        int length=sc.nextInt();
        int breadth=sc.nextInt();
        System.out.println(AreaOfReactangle(length,breadth));
        System.out.println(PerimeterOfRectangle(length,breadth));

    }
    public static int AreaOfReactangle(int length,int breadth){
        return length*breadth;
    }
    public static int PerimeterOfRectangle(int length,int breadth){
        return 2*(length + breadth);
    }

}