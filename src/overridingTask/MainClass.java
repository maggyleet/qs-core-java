package overridingTask;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FacebookV1 fbv1 = new FacebookV1();
		System.out.println("Version 1 features are:");
		System.out.println("---------------------------------------------------------");
		fbv1.login();
		fbv1.like();
		fbv1.message();
		fbv1.logout();

		System.out.println();

		FacebookV2 fbv2 = new FacebookV2();
		System.out.println("Version 2 features are:");
		System.out.println("---------------------------------------------------------");
		fbv2.login();
		fbv2.reels();
		fbv2.message();
		fbv2.like();
		fbv2.logout();
	}

}
