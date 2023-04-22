import java.util.Scanner;

public class shape {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    
        System.out.print("enter radius :");
        float a = in.nextInt();
        System.out.println(area(a));
        System.out.print("enter length and width : ");
        a = in.nextInt();
        float b = in.nextInt();
        System.out.println(area(a, b));
    }
    static float area(float radius){
        float x =  (float) (3.14 * radius * radius);
        return x;
    }
    static float area(float length,float width){
        return length * width;
    }
}

