package com.yr.weather.ex;

import java.util.ArrayList;

public class WeatherView {
	
	public void view (Weather weather) {
		System.out.println("도시명 : " + weather.getCity());
		System.out.println("상태 : " + weather.getState());
		System.out.println("기온 : " + weather.getGion());
		System.out.println("습도 : " + weather.getHum());
		System.out.println("미세먼지 농도 : " + weather.getMise());
		System.out.println("---------------------------------------");
	}
	
	public void view (ArrayList<Weather> ar) {
		for(int i =0; i<ar.size();i++) {
			Weather weather = ar.get(i);
			this.view(weather);
		}
	}
	
	public void view(String str) {
		System.out.println(str);
	}
}

