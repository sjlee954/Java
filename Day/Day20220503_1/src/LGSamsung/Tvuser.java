package LGSamsung;

public class Tvuser {

	public static void main(String[] args) {
//		TV tv = new LGTv();
//		tv.PowerOn();
//		tv.PowerOff();
//		tv.Volumeup();
//		tv.Volumedown();
		
		BeanFactory factory = new BeanFactory();
		TV tv = (TV)factory.getBean(args[0]); //run configurations -> argument에 입력.
		
		tv.PowerOn();
		tv.PowerOff();
		tv.Volumeup();
		tv.Volumedown();
	}

}
