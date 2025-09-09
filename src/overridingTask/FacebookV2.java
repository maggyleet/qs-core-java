package overridingTask;

public class FacebookV2 extends FacebookV1{
	
	public void reels() {
		System.out.println("90 secs of reels uploaded");
	}
	
    @Override
    public void like() {
        System.out.println("like/sad/anger");
    }
    
}
