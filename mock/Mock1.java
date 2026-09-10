class Mock1{
    static String car_name ="bmw"; 
    static String car_color = "green";
    static double pi =3.14;
    static double car_price = 3551.12; 
    static void area(){
        int r =5;
        double area = pi*r*r;
        System.out.println(area);
    }
    static void add(){
        int a =10;
        int b=20;
        int result =a+b;
        System.out.println(result);
    }
    public static void main(String [] args){
        // byte a =1;
        // short b=1;
        // int c=1;
        // long d=1;

        // float e = 1.1f;
        // double f = 1.2;
        // char ch = 'a';
        // boolean bool = true;
        // System.out.println(""+a+b+c+d+e+f+ch); 

        // String name = "RAvati";
        // int rupees = 500;
        // String Class = "indian singers";
        // System.out.println("name  : "+ name );
        // System.out.println("name  : "+ rupees );
        // System.out.println("name  : "+ Class);
        
        
        
        // System.out.println("car name  : "+ car_name);
        // System.out.println(car_color);
        // System.out.println(car_price);
        //add();
        area();
    }
    
}