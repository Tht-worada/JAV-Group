public class Point {
    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public double distance(Point other) {
        return (Math.sqrt(Math.pow((this.x-other.x),2)+
                Math.pow((this.y-other.y),2)));
    }


    public void translate(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }


    public boolean equals(Point other) {
        return (this.x == other.x && this.y == other.y);
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
