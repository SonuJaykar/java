import java.util.Scanner;

public class p4 {

    public static void main(String[] args) {

        int [][] a  = new int [3][3];
        int [][] b  = new int [3][3];
        int [][] c  = new int [3][3];

        Scanner sc = new Scanner(System.in);

        System.out.println("\n\n<-----1st Matrix----->\n\n");  

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print("Enter 1 Matrix [" + i + "] [" + j + "] :");
                
                a[i][j] = sc.nextInt();

            }
        }
        System.out.println("\n\n<-----2nd Matrix----->\n\n");

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                
                System.out.print("Enter 2 Matrix [" + i + "] [" + j + "] :");

                b[i][j] = sc.nextInt();

            }
        }
        System.out.println("\n\n<-----Output Answer----->\n\n");

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                c[i][j] = a[i][j] + b[i][j];

                System.out.print(" [ "+c[i][j]+" ] ");

            }

            System.out.println();

        }
    }
}


[ 3 ]  [ 5 ]  [ 7 ]
[ 9 ]  [ 11 ]  [ 13 ]
[ 15 ]  [ 17 ]  [ 9 ]