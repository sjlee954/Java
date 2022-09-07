package LGSamsung;

public class SamsungTv implements TV {

	@Override
	public void PowerOn() {
		// TODO Auto-generated method stub
		System.out.println("sam.....on");
	}

	@Override
	public void PowerOff() {
		// TODO Auto-generated method stub
		System.out.println("sam.....off");
	}

	@Override
	public void Volumeup() {
		// TODO Auto-generated method stub
		System.out.println("vol.....up");
	}

	@Override
	public void Volumedown() {
		// TODO Auto-generated method stub
		System.out.println("vol.....down");
	}
}
