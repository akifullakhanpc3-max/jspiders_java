//package class;
class Amazon{
    static void signup(){
        System.out.println("signup");
    }
    static void home(){
        System.out.println("home page");
    }
    static void cart(){
        System.out.println("product added to cart ");
    }
    static void login(){
        System.out.println("successdully log in");
    }

    static void logout(){
        System.out.println("successfully log out");
    }
    static void call(){
        signup();
        login();
        home();
        cart();
        logout();
    }
}

class Whatsapp{
    static void send(String a){
        System.out.println("sending the message "+ a);
    }
    static void send(int a){
        System.out.println("sending to the number "+ a);
    }
    static void call(){
        send(135);
    }
}

class Sample12{
    static public int _abc =10;
    public int $bc = 20;
    public int Sample12 =30;
    static void call(){
        System.out.println("_abc "+ _abc);
    }
}

class Hellojava{
    static void call(){
        System.out.println("\"hello java\"");
    }
    void hellojava(){
        call();
    }
}
public class Sample {
    public static void main(String[] args) {
        Amazon a = new Amazon();
        Whatsapp w = new Whatsapp();
        Sample12 s = new Sample12();
        Hellojava h = new Hellojava();

        a.call();
        w.call();
        s.call();
        h.call();
    }
}
