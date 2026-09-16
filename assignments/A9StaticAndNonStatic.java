package assignments;
//while running in edit plus please comment the package line or remove it

class WithDefault {
    final static double pi=3.14;
    class Square {
        static void area() {
            int a = 10;
            System.out.println("area of square "+(a * a));
        }
    }

    class Rectangle {
        static void area() {
            int l = 10, b = 20;
            System.out.println("area of rectangle is : " + (l * b));
        }
    }

    class Parallelogram {
        static void area() {
            int pl = 10, pb = 20;
            System.out.println("area of Parallelogram is : " + (pl * pb));
        }
    }

    class Trapizoidal {
        static void area() {
            int l = 10, b = 20, h = 20;
            System.out.println("area of trapizoidal is : " + (0.5 * (l * b) * h));
        }
    }
    class Triangle{
        static int l=10,b=20;
        static void area(){
            System.out.println("the area of triangle is "+(0.5*l*b));
        }
    }
    class Circle{
        static void area(){
            int r=10;
            System.out.println("the area of circle is "+(pi*r*r));
        }
    }
    class Eclipse{
        static void area(){
            int ea=10,eb=20;
            System.out.println("the area of eclips is "+(pi*ea*eb));
        }
    }
    class sector{
        static void area(){
            int theta =20,r=10;
            System.out.println("the area of sector is "+ (pi*r*r*theta) );
        }
    }

}

class WithParameters{
    final static double pi=3.14;
    class Square {
        static void area(int a) {
            System.out.println("area of square "+(a * a));
        }
    }

    class Rectangle {
        static void area(int l,int b) {
            System.out.println("area of rectangle is : " + (l * b));
        }
    }

    class Parallelogram {
        static void area(int pl,int pb) {
            System.out.println("area of Parallelogram is : " + (pl * pb));
        }
    }

    class Trapizoidal {
        static void area(int l,int b,int h) {
            System.out.println("area of trapizoidal is : " + (0.5 * (l * b) * h));
        }
    }
    class Triangle{
        static void area(int l, int b){
            System.out.println("the area of triangle is "+(0.5*l*b));
        }
    }
    class Circle{
        static void area(int r){
            // int r=10;
            System.out.println("the area of circle is "+(pi*r*r));
        }
    }
    class Eclipse{
        static void area(int ea,int eb){
            //int ea=10,eb=20;
            System.out.println("the area of eclips is "+(pi*ea*eb));
        }
    }
    class sector{
        static void area(int r,int theta){
            //int theta =20,r=10;
            System.out.println("the area of sector is "+ (pi*r*r*theta) );
        }
    }
}



class WithReturnType{
    final static double pi=3.14;
    class Square {
        static int area(int a) {
            return ((a * a));
        }
    }

    class Rectangle {
        static int area(int l,int b) {
            return ( (l * b));
        }
    }

    class Parallelogram {
        static int area(int pl,int pb) {
            return ( (pl * pb));
        }
    }

    class Trapizoidal {
        static double area(int l,int b,int h) {
            return ( (0.5 * (l * b) * h));
        }
    }
    class Triangle{
        static double area(int l, int b){
            return ((0.5*l*b));
        }
    }
    class Circle{
        static double area(int r){
            // int r=10;
            return ((pi*r*r));
        }
    }
    class Eclipse{
        static double area(int ea,int eb){
            //int ea=10,eb=20;
            return ((pi*ea*eb));
        }
    }
    class sector{
        static double area(int r,int theta){
            //int theta =20,r=10;
            return ( (pi*r*r*theta) );
        }
    }
}

public class A9StaticAndNonStatic {
    public static void main(String[] args) {
        System.out.println("getting the elemetns using default methods");
        WithDefault.Square.area();
        WithDefault.Rectangle.area();
        WithDefault.Parallelogram.area();
        WithDefault.Trapizoidal.area();
        WithDefault.Triangle.area();
        WithDefault.Circle.area();
        WithDefault.Eclipse.area();
        WithDefault.sector.area();

        System.out.println("\n\n\ngetting the elemetns using parameter methods");
        WithParameters.Square.area(4);
        WithParameters.Rectangle.area(4,5);
        WithParameters.Parallelogram.area(4,9);
        WithParameters.Trapizoidal.area(8,3,9);
        WithParameters.Triangle.area(6,10);
        WithParameters.Circle.area(8);
        WithParameters.Eclipse.area(10,9);
        WithParameters.sector.area(9,7);


        System.out.println("\n\n\ngetting the elemetns using return type methods");
        System.out.println("the area of square is "+WithReturnType.Square.area(4));
        System.out.println("the area of rectangle is "+WithReturnType.Rectangle.area(4,5));
        System.out.println("the area of parallelogram is "+WithReturnType.Parallelogram.area(4,9));
        System.out.println("the area of trapizoidal is "+WithReturnType.Trapizoidal.area(8,3,9));
        System.out.println("the area of triangle is "+WithReturnType.Triangle.area(6,10));
        System.out.println("the area of circle is "+WithReturnType.Circle.area(8));
        System.out.println("the area of Eclips is "+WithReturnType.Eclipse.area(10,9));
        System.out.println("the area of sector is "+WithReturnType.sector.area(9,7));
    }
}
