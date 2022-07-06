import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class MyTv2 {

		private boolean isPowerOn;
		private int channel;
		private int volume;
		int PrevChannel; //이전채널 변수선언.
		
		final int MAX_VOLUME = 100;
		final int MIN_VOLUME = 0;
		final int MAX_CHANNEL = 100;
		final int MIN_CHANNEL = 1;
//		int i=-1;
//		int count=0;
//		int[] prevChannel = new int[100];
		
		void gotoPrevChannel() {
			setChannel(PrevChannel);
		}
		
		
//		void gotoPrevChannel() {
//			if(i == 0) {
//				this.channel = prevChannel[count-1];
//			} else {
//			--i;
//			this.channel = prevChannel[i];
//			}
//		}
		
		MyTv2() {}

		public int getChannel() {
			return channel;
		}

		public void setChannel(int channel) {
			PrevChannel = this.channel;
			this.channel = channel;
//			count++;  
//			this.count = count; 
//			i++;  
//			prevChannel[i]=channel; 
		}

	}
	
class Exercise7_10 {
	public static void main(String[] args) {
		MyTv2 t = new MyTv2();
		
		t.setChannel(10);
		System.out.println("CH:"+t.getChannel());
		t.setChannel(20);
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
		
		
	}
}