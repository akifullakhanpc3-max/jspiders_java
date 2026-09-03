public class Area{
    public static void main(String[] args){
        //Area of all
        double l=10,h=20;
        System.out.println("Area program");

        //triangle
        double triangle =(l*h)/2;
        System.out.println("area of triangle : " +triangle);

        //square
        double a = 10;
        System.out.println("the area of square is : " +(a*a));

        //rectangle
        System.out.println("the area of rectangle is : " +(l*h));


        //parallelogram
        System.out.println("the area of rectangle is : " +(l*h));

        //trapizoidal
        double tl=10,tb=20,th=30;
        System.out.println("the area of tropizodal is : "+((tl+tb)*(th/2)));

        //circle
        int r=10;
        final float pi = 3.14f;
        System.out.println("the area of a circle is : "+ (pi*r*r));

        //eclips 

        int ea=10,eb=20;
        System.out.println("the area of eclipse is : " + (pi*ea*eb));

        //sector
        float theta = 35.0f/360;
        System.out.println("the area of sector is : "+ (pi*r*r*theta));

    }
}