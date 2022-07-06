package com.ezen;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Tv {
	private boolean power;
	private int channel;
	
	void power() {power = !power; }
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
	
	Tv() {
		this(0,false);
	}
	Tv(int channel) {
		this(channel,false);
	}
	Tv(int channel,boolean power) {
		this.power = power;
		this.channel = channel;
	}
}
	
class CaptionTv extends Tv {
	private boolean caption; 
	
	CaptionTv() {
		this(false,0,false);
	}
	CaptionTv(boolean power) {
		this(power,10,false);
	}
	CaptionTv(boolean power,int channel) {
		this(power,channel,false);
	}
	CaptionTv(boolean power, int channel,boolean caption) {
		super(channel,true);
		this.caption = caption;
	}
	void displayCaption(String text) {
		if (caption) {
			System.out.println(text);
		}
	}
}

class CaptionTvTest {
	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv(true,10,true);
		
//		ctv.setChannel(10);
		ctv.channelUp();
		System.out.println(ctv.getChannel());
//		ctv.displayCaption("Hello World");
		ctv.displayCaption("Hello,World");
	}

}
