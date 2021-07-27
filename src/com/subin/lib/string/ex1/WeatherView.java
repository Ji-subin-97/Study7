package com.subin.lib.string.ex1;

public class WeatherView {
	
	//view
	//모든 지역의 날씨정볼르 출력하는 메서드
	public void view(WeatherDTO [] weatherDTOs){
		
		WeatherInfo weatherInfo = new WeatherInfo();
		weatherDTOs =  weatherInfo.makeWeather();
		
		System.out.println("도시명 \t 기온 \t 습도 \t 날씨");
		System.out.println("=================================");
		for(int i=0;i<weatherDTOs.length;i++) {
			System.out.print(weatherDTOs[i].getCityname() + " \t ");
			System.out.print(weatherDTOs[i].getTemperature() + " \t ");
			System.out.print(weatherDTOs[i].getHumidity() + " \t ");
			System.out.println(weatherDTOs[i].getCondition() + " \t ");
			System.out.println("-------------------------------");
		}
	}
	
	//oneView
	//검색한 지역의 날씨정보를 출력하는 메서드
	public void oneView(WeatherDTO weatherDTO) {
		System.out.println("도시명 \t 기온 \t 습도 \t 날씨");
		System.out.println("=================================");
		System.out.print(weatherDTO.getCityname() + " \t ");
		System.out.print(weatherDTO.getTemperature() + " \t ");
		System.out.print(weatherDTO.getHumidity() + " \t ");
		System.out.println(weatherDTO.getCondition() + " \t ");
		System.out.println("-------------------------------");
	}
}
