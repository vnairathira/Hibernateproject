package com.app;

public class Android extends Mobile{
	public void android() {
		System.out.println("from android..");
	}
public static void main(String[] args) {
	Android ad= new Android();
	ad.android();
	ad.mobile();
}
}
