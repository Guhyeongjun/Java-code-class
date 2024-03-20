package chapter01;

public class Tv {
	public boolean power;
	private int channel;
	
	public void power() {
		power =!power;
	}
	
	public void channelUp() {
		++channel;
	}
	
	public void channelDown() {
		--channel;
	}
}
