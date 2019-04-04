package com.yr.weather.ex;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class WeatherInit {
	private String info;
	private Scanner sc;

	public WeatherInit() {
		info="seoul ,맑음 ,10 ,20 , 0.3 ,daejon, 비,22 ,50,0.1,"
				+ "incheon-태풍 -56 -90 -22.2 -jeju ,흐림,15,10,1.2";
		sc=new Scanner(System.in);

	}


	public ArrayList<Weather> getWeather(){
		ArrayList<Weather> ar = new ArrayList<Weather>();
		info = info.replace("-", ",");
		StringTokenizer st = new StringTokenizer(info,",");
		while(st.hasMoreTokens()) {
			Weather weather = new Weather();
			weather.setCity(st.nextToken().trim());
			weather.setState(st.nextToken().trim());
			weather.setGion(Integer.parseInt(st.nextToken().trim()));
			weather.setHum(Integer.parseInt(st.nextToken().trim()));
			weather.setMise(Double.parseDouble(st.nextToken().trim()));
			ar.add(weather);
			
			// 인덱스 번호를 신경쓸 필요가 x
			
			
		}
		/*
		String [] arrayInfo = info.split(",");
		for(int i=0;i<arrayInfo.length;i++) {
			Weather weather = new Weather();

			weather.setCity(arrayInfo[i].trim());
			weather.setState(arrayInfo[++i].trim());
			weather.setGion(Integer.parseInt(arrayInfo[++i].trim()));
			weather.setHum(Integer.parseInt(arrayInfo[++i].trim()));
			weather.setMise(Double.parseDouble(arrayInfo[++i].trim()));
			ar.add(weather);
		}
		*/
		return ar;
	}

	public Weather setWeather() {
		Weather weather = new Weather();
		
		System.out.println("도시명을 입력하세요");
		weather.setCity(sc.next());
		System.out.println("상태를 입력하세요");
		weather.setState(sc.next());
		System.out.println("기온을 입력하세요");
		weather.setGion(sc.nextInt());
		System.out.println("습도를 입력하세요");
		weather.setHum(sc.nextInt());
		System.out.println("미세먼지 농도를 입력하세요");
		weather.setMise(sc.nextDouble());

		return weather;
	}

	public Weather findWeather(ArrayList<Weather> ar) {
		System.out.println("검색할 도시명을 입력하세요");
		String city = sc.next();
		
		Weather w = null;
		for(int i=0; i<ar.size();i++) {
			
			if(ar.get(i).getCity().equals(city)) {
				w = ar.get(i);
				
				break;
			} 
		}
		return w;
	}

	public String deleteWeather(ArrayList<Weather> ar) {
		System.out.println("삭제할 도시명 입력");
		String city = sc.next();
		String result = "없는 도시명 입니다";
		Weather w = null;
		for(int i=0; i<ar.size();i++) {
			w = ar.get(i); // 꺼내서
			if(city.equals(w.getCity())) {
				ar.remove(i);
				result = "삭제가 완료되었습니다";
			}
		}
		
		return result;
		



	}
}
