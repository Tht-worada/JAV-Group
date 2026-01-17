import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Double[] x = new Double[4];
        Double[] y = new Double[4];

        for (int i = 0 ; i < 4 ; i++) {
            System.out.print(i + 1 + "(x,y):");
            x[i] = sc.nextDouble();
            y[i] = sc.nextDouble();
        }

        double SumX = 0;
        double SumY = 0;

        for (int i = 0; i < 4 ; i++){
            SumX += x[i];
            SumY += y[i];
        }
        System.out.println("The centroid is: " + "("+ SumX/4 + "," +SumY/4 + ")" );

        double distance = Math.sqrt(Math.pow(SumX, 2) + Math.pow(SumY, 2));
        System.out.println(distance);



    }
}


