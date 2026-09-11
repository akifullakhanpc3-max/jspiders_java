package assignments;

public class A8Workflow {
    
    public static void main(String [] args){
        Amazon a = new Amazon();
        Flipcart f = new Flipcart();
        Zomato z= new Zomato();
        PubG p = new PubG();
        Insta i = new Insta();
        Facebook F = new Facebook();
        Gmail g = new Gmail();
        ZestMoney Z = new ZestMoney();
        System.out.println("Amazon");
        a.Signup();
        a.login();
        a.home();
        a.order();
        a.logout();

        System.out.println("   \n\nFlipkart\n");

        f.Signup();
        f.login();
        f.home();
        f.order();
        f.logout();

        System.out.println("\n\nZomato \n");

        z.Signup();
        z.login();
        z.home();
        z.order();
        z.logout();

        System.out.println("\n\nPubG\n");

        p.Signup();
        p.login();
        p.home();
        p.order();
        p.logout();

        System.out.println("\n\nInsta\n");

        i.Signup();
        i.login();
        i.home();
        //i.order();
        i.logout();

        System.out.println("\n\nFaceBook\n");

        F.Signup();
        F.login();
        F.home();
        //F.order();
        F.logout();

        System.out.println("\n\nGmail\n");

        g.Signup();
        g.login();
        g.home();
        //g.order();
        g.logout();

        System.out.println("\n\nZestmoney\n");

        Z.Signup();
        Z.login();
        Z.home();
        Z.apply_loan();
        Z.logout();
        
    }
}

class Amazon{
        void Signup(){
            System.out.println("Sign up please");
        }
        void login(){
            System.out.println("login complete");
        }
        void home(){
            System.out.println("home page");
        }
        void order(){
            System.out.println("order placed");
        }
        void logout(){
            System.out.println("logout sucessfully");
        }
    }
    class Flipcart{
        void Signup(){
            System.out.println("Sign up please");
        }
        void login(){
            System.out.println("login complete");
        }
        void home(){
            System.out.println("home page");
        }
        void order(){
            System.out.println("order placed");
        }
        void logout(){
            System.out.println("logout sucessfully");
        }
    }
    class Zomato{
        void Signup(){
            System.out.println("Sign up please");
        }
        void login(){
            System.out.println("login complete");
        }
        void home(){
            System.out.println("home page");
        }
        void order(){
            System.out.println("order placed");
        }
        void logout(){
            System.out.println("logout sucessfully");
        }
    }
    class PubG{
        void Signup(){
            System.out.println("Sign up please");
        }
        void login(){
            System.out.println("login complete");
        }
        void home(){
            System.out.println("home page");
        }
        void order(){
            System.out.println("order placed");
        }
        void logout(){
            System.out.println("logout sucessfully");
        }
    }
    class Insta{
        void Signup(){
            System.out.println("Sign up please");
        }
        void login(){
            System.out.println("login complete");
        }
        void home(){
            System.out.println("home page");
        }
        void logout(){
            System.out.println("logout sucessfully");
        }
    }
    class Facebook{
        void Signup(){
            System.out.println("Sign up please");
        }
        void login(){
            System.out.println("login complete");
        }
        void home(){
            System.out.println("home page");
        }
        void logout(){
            System.out.println("logout sucessfully");
        }
    }
    class Gmail{
        void Signup(){
            System.out.println("Sign up please");
        }
        void login(){
            System.out.println("login complete");
        }
        void home(){
            System.out.println("home page");
        }
        void logout(){
            System.out.println("logout sucessfully");
        }
    }
    class ZestMoney{
        void Signup(){
            System.out.println("Sign up please");
        }
        void login(){
            System.out.println("login complete");
        }
        void home(){
            System.out.println("home page");
        }
        void apply_loan(){
            System.out.println("applied for the loan\nthank u");
        }
        void logout(){
            System.out.println("logout sucessfully");
        }
    }
