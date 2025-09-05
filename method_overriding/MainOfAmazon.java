package method_overloading;

class AmazonVersion1 {

    public void login() {
        System.out.println("login done...");
    }

    public void pay() {
        System.out.println("you can pay phone bill...");
    }

    public void shop() {
        System.out.println("you can do shopping...");
    }

    public void logout() {
        System.out.println("logout done...");
    }
}

class AmazonVersion2 extends AmazonVersion1 {

    @Override
    public void pay() {
        System.out.println("you can pay phone/gas/water bill...");
    }

    public void music() {
        System.out.println("you can listen to music...");
    }

    public void prime() {
        System.out.println("you can watch movies and series...");
    }
}

public class MainOfAmazon {

    public static void main(String[] args) {
        AmazonVersion1 amv1 = new AmazonVersion1();
        System.out.println("Version 1 features are:");
        System.out.println("---------------------------------------------------------");
        amv1.login();
        amv1.pay();
        amv1.shop();
        amv1.logout();

        System.out.println();

        AmazonVersion2 amv2 = new AmazonVersion2();
        System.out.println("Version 2 features are:");
        System.out.println("---------------------------------------------------------");
        amv2.login();
        amv2.pay();
        amv2.shop();
        amv2.music();
        amv2.prime();
        amv2.logout();
    }
}
