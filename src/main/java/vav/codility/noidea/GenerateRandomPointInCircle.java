package vav.codility.noidea;

public class GenerateRandomPointInCircle {

    private double radius;
    private double xCenter;
    private double yCenter;

    public GenerateRandomPointInCircle(double radius, double x_center, double y_center) {
        this.radius = radius;
        this.xCenter = x_center;
        this.yCenter = y_center;
    }

    public double[] randPoint() {
        double x0 = xCenter - radius;
        double y0 = yCenter - radius;

        while (true) {
            double x = x0 + 2 * radius * Math.random();
            double y = y0 + 2 * radius * Math.random();
            if (Math.sqrt(Math.pow(xCenter- x, 2) + Math.pow(yCenter -y, 2)) < radius) {
               return new double[]{x,y};
            }
        }
    }
}
