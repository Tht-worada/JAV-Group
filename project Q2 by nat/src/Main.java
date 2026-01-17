import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        double[] X = new double[4];
        double[] Y = new double[4];

        System.out.print("First point : ");
        X[0] = kb.nextDouble();
        Y[0] = kb.nextDouble();

        System.out.print("Second point: ");
        X[1] = kb.nextDouble();
        Y[1] = kb.nextDouble();

        System.out.print("Third point : ");
        X[2] = kb.nextDouble();
        Y[2] = kb.nextDouble();

        System.out.print("Fourth point: ");
        X[3] = kb.nextDouble();
        Y[3] = kb.nextDouble();

        /*-----หาจุดกึ่งกลาง------*/
        double allx = 0 , ally = 0;
        for(int num = 0 ; num<4 ; num++){
            allx += X[num];
            ally += Y[num];
        }
        double cen_X = allx/4 ;
        double cen_Y = ally/4 ;

        /*-----เก็บค่ามาก น้อย เอามาเปรียบเทียบกัน-----*/
        double maxDIS = Double.MIN_VALUE;
        double minDIS = Double.MAX_VALUE;

        /*------จุดถึง จุดกึ่งกลาง-----*/
        double DISTANCE = 0;

        for(int i = 0 ; i<4 ; i++){
            double Xx = X[i] - cen_X;
            double Yy = Y[i] - cen_Y;
            double distance = Math.sqrt(Math.pow(Xx,2) + Math.pow(Yy,2));

            DISTANCE += distance;
            minDIS = Math.min(minDIS,distance);
            maxDIS = Math.max(maxDIS,distance);

        }

        System.out.println("The centroid is ( "+ cen_X +", "+ cen_Y + " ).");
        System.out.println("Sum of distance is "+ DISTANCE +"." );
        System.out.println("Shortest distance is "+ minDIS +".");
        System.out.println("Longest distance is " + maxDIS +".");


    }
}