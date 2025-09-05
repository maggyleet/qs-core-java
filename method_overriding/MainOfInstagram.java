package method_overriding;

class InstagramV1 {
    public void login() {
        System.out.println("login done...");
    }

    public void reels() {
        System.out.println("30 sec reels uploaded");
    }

    public void sharePost() {
        System.out.println("share post via instagram");
    }

    public void message() {
        System.out.println("message sent/received");
    }

    public void like() {
        System.out.println("like done");
    }

    public void logout() {
        System.out.println("logout done...");
    }
}

class InstagramV2 extends InstagramV1 {
    @Override
    public void reels() {
        System.out.println("90 secs of reels uploaded");
    }

    @Override
    public void sharePost() {
        System.out.println("share post via instagram/whatsapp/gmail/twitter");
    }
}

public class MainOfInstagram {
    public static void main(String[] args) {
        InstagramV1 igv1 = new InstagramV1();
        System.out.println("Version 1 features are:");
        System.out.println("---------------------------------------------------------");
        igv1.login();
        igv1.reels();
        igv1.sharePost();
        igv1.message();
        igv1.like();
        igv1.logout();

        System.out.println();

        InstagramV2 igv2 = new InstagramV2();
        System.out.println("Version 2 features are:");
        System.out.println("---------------------------------------------------------");
        igv2.login();
        igv2.reels();
        igv2.sharePost();
        igv2.message();
        igv2.like();
        igv2.logout();
    }
}
