class GlobalVariable {
    static double mcost = 25000.0;
    static String mname = "IQOO neo 10R", mcolor = "White";
    static double ccost = 1500000.0;
    static String cname = "BMW", ccolor = "White";
    static int strength = 60;
    static String sname = "Jspiders";
    static char grade = 'A';
    static double tv_cost = 2500.0;
    static String tv_brand = "Sony", tv_type = "LED";
    static double bike_cost = 250000.0;
    static String bike_name = "KTM", bike_color = "White";
    static double exam_cost = 31000.0;
    static String course_name = "ISE", unvi_name = "VTU";
    static double lapi_cost = 55000.0;
    static String lapi_name = "predator helios neo 16", lapi_brand = "ACER";
    static double home_cost = 350000.0;
    static String home_name = "2BHK", home_color = "Green";
    static int emp_id = 191;
    static double emp_sal = 3500242.65;
    static char emp_grade = 'B';
    static String cloth_color = "blue";
    static char cloth_size = 'L';
    static double cloth_cost = 2500.62;

    public static void main(String[] args) {

        // for other seperate programs create diff .java file to execute
        // 1.program mobile

        System.out.println("Mobile cost:" + mcost);
        System.out.println("Mobile name:" + mname);
        System.out.println("Mobile color:" + mcolor);

        System.out.println();

        // 2.program car

        System.out.println("\ncar cost:" + ccost);
        System.out.println("car name:" + cname);
        System.out.println("car color:" + ccolor);

        // 3.school

        System.out.println("\n\nSchool Strength:" + strength);
        System.out.println("School name:" + sname);
        System.out.println("School grade:" + grade);

        // 4.program tv

        System.out.println("\n\nTV cost:" + tv_cost);
        System.out.println("TV brand:" + tv_brand);
        System.out.println("TV type: " + tv_type);

        // 5.program bike

        System.out.println("\n\nbike cost:" + bike_cost);
        System.out.println("bike name:" + bike_name);
        System.out.println("bike color:" + bike_color);

        // 6.program course

        System.out.println("\n\ncourse cost:" + exam_cost);
        System.out.println("university name:" + unvi_name);
        System.out.println("course name:" + course_name);

        // 7.program laptop

        System.out.println("\n\nLaptop cost:" + lapi_cost);
        System.out.println("Laptop name:" + lapi_name);
        System.out.println("Laptop brand:" + lapi_brand);

        // 8.program home

        System.out.println("\n\nHome cost:" + home_cost + " rupees");
        System.out.println("Home name:" + home_name);
        System.out.println("Home color:" + home_color);

        // 9.progrma emp

        System.out.println("\n\nemployee id:" + emp_id);
        System.out.println("employee salary" + emp_sal);
        System.out.println("employee grade" + emp_grade);

        // 10.program cloth
        System.out.println("\n\ncloth color :" + cloth_color);
        System.out.println("cloth size :" + cloth_size);
        System.out.println("Cloth cost :" + cloth_cost);
    }
}