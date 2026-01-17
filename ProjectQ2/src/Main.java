import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> allx = new ArrayList<>();
        List<Double> ally = new ArrayList<>();
        String[] pointCount = {"First ", "Second ", "Third ", "Fourth "};
        Double sumx = 0.0, sumy = 0.0, sumDis = 0.0;

        for (int i = 0 ; i < 4 ; i++) {
            System.out.print(pointCount[i]+ "point: ");
            allx.add(scanner.nextDouble());
            ally.add(scanner.nextDouble());
            sumx += allx.get(i);
            sumy += ally.get(i);
        }

        Double centroidx = sumx/4.0;
        Double centroidy = sumy/4.0;

        List<Double> distance = new ArrayList<>();
        for (int i = 0 ; i < 4 ; i++) {
            distance.add(Math.sqrt(Math.pow(Math.abs(centroidx-allx.get(i)),2)+
                    Math.pow(Math.abs(centroidy-ally.get(i)),2)));
            sumDis += distance.get(i);
        }

        Double minDis = Collections.min(distance);
        Double maxDis = Collections.max(distance);

        System.out.printf("The centroid is (%f, %f).\n", centroidx, centroidy);
        System.out.printf("Sum of distance is %f.\n", sumDis);
        System.out.printf("Shortest distance is %f.\nLongest distance is %f.",
                minDis, maxDis);
    }
}
