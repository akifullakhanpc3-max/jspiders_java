public class A6Methodparameters {

    public final float pi = 3.14f;

    // Square
    void square(int r) {
        int a = r;
        System.out.println("Area of square: " + (a * a));
    }

    // Triangle
    void triangle(int l, int h) {
        double triangle = (l * h) / 2.0;
        System.out.println("Area of triangle: " + triangle);
    }

    // Rectangle
    void rectangle(int l, int h) {
        System.out.println("Area of rectangle: " + (l * h));
    }

    // Parallelogram
    void parallelogram(int l, int h) {
        System.out.println("Area of parallelogram: " + (l * h));
    }

    // Trapezoid
    void trapezoidal(int tl, int tb, int th) {
        double area = ((tl + tb) * th) / 2.0;
        System.out.println("Area of trapezoid: " + area);
    }

    // Circle
    void circle(int r) {
        System.out.println("Area of circle: " + (pi * r * r));
    }

    // Ellipse
    void ellipse(int ea, int eb) {
        System.out.println("Area of ellipse: " + (pi * ea * eb));
    }

    // Sector
    void sector(int r, float angle) {
        float theta = angle / 360;
        System.out.println("Area of sector: " + (pi * r * r * theta));
    }

    public static void main(String[] args) {

        A6Methodparameters a1 = new A6Methodparameters();

        a1.square(10);
        a1.rectangle(10, 20);
        a1.circle(10);
        a1.parallelogram(10, 20);
        a1.trapezoidal(10, 20, 30);
        a1.triangle(10, 20);
        a1.ellipse(10, 20);
        a1.sector(10, 35);
    }
}