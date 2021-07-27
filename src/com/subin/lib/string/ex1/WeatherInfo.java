package com.subin.lib.string.ex1;

import java.util.Scanner;

public class WeatherInfo{
	
	private String info;
	private StringBuffer sb;
	Scanner sc = new Scanner(System.in);
	
	public WeatherInfo() {
		sb = new StringBuffer();
		sb.append("seoul, 37, 80, 맑음,");
		sb.append("daegu, 43, 90, 지옥,");
		sb.append("busan, -32, 10, 눈,");
		sb.append("jeju, 3, 40, 비");
		info = sb.toString();
	}
	
	//searchWeather
	//도시명을 입력 받아서 일치하는 도시를 찾아서 리턴해주기
	public WeatherDTO searchWeather(WeatherDTO [] weatherDTOs) {
		System.out.println("검색할 도시명 입력");
		String cityname = sc.next();
		WeatherDTO weatherDTO = new WeatherDTO();
		
		for(int i=0;i<weatherDTOs.length;i++) {
			if(cityname.equals(weatherDTOs[i].getCityname())) {
				weatherDTO = weatherDTOs[i];
				break;
			}
		}
		
		return weatherDTO;
	}
	
	public WeatherDTO [] makeWeather() {
		
		info = sb.toString();
		
		//파싱(parsing, 하나의 문자열을 자르는 작업)
		String [] strings = info.split(",");
		WeatherDTO [] weatherDTOs = new WeatherDTO[strings.length/4];
		
		int j = -1;
		for(int i=0;i<weatherDTOs.length;i++) {
			WeatherDTO weatherDTO = new WeatherDTO();	
			weatherDTO.setCityname(strings[++j].trim());
			weatherDTO.setTemperature(strings[++j].trim());
			weatherDTO.setHumidity(strings[++j].trim());
			weatherDTO.setCondition(strings[++j].trim());
			weatherDTOs[i] = weatherDTO;
		}
		
		return weatherDTOs;
	}
}
