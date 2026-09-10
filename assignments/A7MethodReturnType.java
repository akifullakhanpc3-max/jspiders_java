package assignments;

public class A7MethodReturnType {

    public final float pi = 3.14f;

    // Square
    int square(int r) {
        return r * r;
    }

    // Triangle
    double triangle(int l, int h) {
        return (l * h) / 2.0;
    }

    // Rectangle
    int rectangle(int l, int h) {
        return l * h;
    }

    // Parallelogram
    int parallelogram(int l, int h) {
        return l * h;
    }

    // Trapezoid
    double trapezoidal(int tl, int tb, int th) {
        return ((tl + tb) * th) / 2.0;
    }

    // Circle
    float circle(int r) {
        return pi * r * r;
    }

    // Ellipse
    float ellipse(int ea, int eb) {
        return pi * ea * eb;
    }

    // Sector
    float sector(int r, float angle) {
        float theta = angle / 360.0f;
        return pi * r * r * theta;
    }

    public static void main(String[] args) {

        A7MethodReturnType obj = new A7MethodReturnType();

        System.out.println("Square: " + obj.square(5));
        System.out.println("Triangle: " + obj.triangle(10, 5));
        System.out.println("Rectangle: " + obj.rectangle(10, 5));
        System.out.println("Parallelogram: " + obj.parallelogram(10, 5));
        System.out.println("Trapezoid: " + obj.trapezoidal(10, 20, 5));
        System.out.println("Circle: " + obj.circle(5));
        System.out.println("Ellipse: " + obj.ellipse(5, 3));
        System.out.println("Sector: " + obj.sector(5, 90));
    }
}
