package testetesteunitario;

public class Ponto2D {

    private double x, y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Ponto2D() {
        x = 0;
        y = 0;
    }

    public Ponto2D(double px, double py) {
        x = px;
        y = py;
    }

    public double distancia(double px, double py) {
        return distancia(new Ponto2D(px, py));
    }

    public double distancia(Ponto2D p) {
        return Math.sqrt(Math.pow(x - p.getX(), 2) + Math.pow(y - p.getY(), 2));
    }
    
    public static double distancia(final double x1, final double y1, final double x2, final double y2){
        Ponto2D p1 = new Ponto2D(x1,y1);
        Ponto2D p2 = new Ponto2D(x2,y2);
        return p1.distancia(p2);
    }
    
    public static double distancia(Ponto2D p1, Ponto2D p2){
        return p1.distancia(p2);
    }

    public String toString() {
        return "Ponto2D[x=" + x + ",y=" + y + "]";
    }
}
