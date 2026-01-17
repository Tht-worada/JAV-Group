import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Point A: ");
        Point A = new Point(sc.nextDouble(),sc.nextDouble());

        System.out.print("Point B: ");
        Point B = new Point(sc.nextDouble(),sc.nextDouble());


        System.out.println("A = " + A.toString() + "  B = " + B.toString() +
                "  Distance = " + A.distance(B));


        System.out.print("Move the points: ");
        double dx = sc.nextDouble();
        double dy = sc.nextDouble();


        A.translate(dx, dy);
        B.translate(dx, dy);


        System.out.println("A = " + A.toString() + "  B = " + B.toString() +
                "  Distance = " + A.distance(B));

        if (A.equals(B)) {
            System.out.println("A and B are at the same position.");
        } else {
            System.out.println("A and B are not at the same position.");
        }

    }
}
