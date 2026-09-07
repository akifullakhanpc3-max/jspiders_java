public class A5AreaUsingMethods {

    public int radius = 10;
    public int length = 10, breadth = 20, l = length, b = breadth, h = breadth;
    public final float pi = 3.14f;

    void square() {
        int a = 10;
        System.out.println("area of square : " + a * a);
    }

    void triangle() {
        // triangle
        double triangle = (l * h) / 2;
        System.out.println("area of triangle : " + triangle);
    }

    // rectangle
    void rectangle() {
        System.out.println("the area of rectangle is : " + (l * h));
    }

    // parallelogram
    void parallelogram() {
        System.out.println("the area of rectangle is : " + (l * h));
    }

    // trapizoidal
    void trapizoidal() {
        double tl = 10, tb = 20, th = 30;
        System.out.println("the area of tropizodal is : " + ((tl + tb) * (th / 2)));
    }

    // circle
    void circle() {
        int r = 10;
        System.out.println("the area of a circle is : " + (pi * r * r));
    }

    // eclips
    void eclipse() {
        int ea = 10, eb = 20;
        System.out.println("the area of eclipse is : " + (pi * ea * eb));
    }

    // sector
    void sector() {
        float theta = 35.0f / 360;
        int r = radius;
        System.out.println("the area of sector is : " + (pi * r * r * theta));
    }

    public static void main(String[] args) {
        A5AreaUsingMethods a1 = new A5AreaUsingMethods();
        a1.square();
        a1.rectangle();
        a1.circle();
        a1.parallelogram();
        a1.trapizoidal();
        a1.triangle();
        a1.eclipse();
        a1.sector();
    }
}
