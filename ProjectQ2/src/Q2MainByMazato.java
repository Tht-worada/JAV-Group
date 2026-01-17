import java.util.Scanner;
public class Q2MainByMazato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[4][2];
        //สร้าง array รับพิกัด
        for(int i = 0; i < 4; i++ ){
            System.out.print("Enter Point: ");
            String s = scanner.nextLine();
            int l = s.indexOf(" ");
             data[i][0] = Double.parseDouble(s.trim().substring(0,l));
             data[i][1] = Double.parseDouble(s.trim().substring(l).trim());
        }
        double[] x,y ;
        x = new double[4];
        y = new double[4];
        for(int j = 0 ; j<4 ; j++){
            x[j] = data[j][0];
            y[j] = data[j][1];

        }
        double sumx = 0;
        double sumy = 0;
        for(double a : x){
            sumx += a;
        }
        for(double b : y){
            sumy += b;
        }
        double controidX,controidY ;
        controidX = sumx/x.length;
        controidY = sumy/y.length;
        System.out.println("The centroid is (" + controidX +" , "+ controidY +").");
        double[] d = new double[4];
        double dsum = 0;
        for(int i = 0 ; i < 4 ; i++ ){
            double d1 = Math.sqrt(
                    Math.pow(Math.abs(x[i] - controidX), 2)
                  + Math.pow(Math.abs(y[i] - controidY),2)
            );
            d[i] = d1;
            dsum += d1;
        }
        double max = d[0];
        for(int i = 1 ; i < d.length ; i++){
            max = Math.max(max,d[i]);
        }
        double min = d[0];
        for(int i = 1 ; i < d.length ; i++){
            min = Math.min(min,d[i]);
        }
        System.out.println("Sum of distance is "+ dsum +".");
        System.out.println("Shortest distance is "+min+"." );
        System.out.println("Longest distance is "+max+"." );

    }
}