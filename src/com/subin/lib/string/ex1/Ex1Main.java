package com.subin.lib.string.ex1;

public class Ex1Main {

	public static void main(String[] args) {
		
		//날씨 정보를 받아서 조회 하는 프로그램
		//날씨 정보는 도시명, 기온, 습도, 상태
		
		//1. 날씨정보전체출력
		//2. 지역검색정보출력
		//3. 지역정보추가
		
		
		//실행
		WeatherController wct = new WeatherController();
		wct.start();
		
//		WeatherInfo weatherInfo = new WeatherInfo();
//		WeatherDTO [] weatherDTOs = weatherInfo.makeWeather();
//		
//		for(int i=0;i<weatherDTOs.length;i++) {
//			System.out.println(weatherDTOs[i].getCityname());
//			System.out.println(weatherDTOs[i].getTemperature());
//			System.out.println(weatherDTOs[i].getHumidity());
//			System.out.println(weatherDTOs[i].getCondition());
//			System.out.println("-------------------------------");
//		}
	}

}
