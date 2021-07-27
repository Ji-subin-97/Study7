package com.subin.lib.string.ex1;

import java.util.Scanner;

public class WeatherController {
	
	//객체 생성 구역--------------
	private WeatherInfo weatherInfo;
	private WeatherView weatherView;
	
	public WeatherController() {
		weatherInfo = new WeatherInfo();
		weatherView = new WeatherView();
		
	}
	//-------------------------
	
	public void start() {
		System.out.println("Start");
	
		Scanner sc = new Scanner(System.in); // 스캐너
		boolean flag = true;
		
		//메서드 호출 구역-------------
		WeatherDTO [] weatherDTOs = weatherInfo.makeWeather();
		
		//-------------------------
		
		
		
		//작업 선택지-----------------------------------------
		while(flag) {
			System.out.println("1. 날씨정보 전체출력");
			System.out.println("2. 지역검색 정보출력");
			System.out.println("3. 지역정보 추가");
			System.out.println("4. 종     료");
			System.out.print("원하시는 작업을 선택해주세요 :");
			int select = sc.nextInt();
			// -------------------------------------------
			switch(select) {
			case 1:
				this.weatherView.view(weatherDTOs);
				break;
			case 2:
				WeatherDTO weatherDTO = this.weatherInfo.searchWeather(weatherDTOs);
				weatherView.oneView(weatherDTO);
				break;
			case 3:
				
			default:
				flag = false;
			}
		}
		//--------------------------------------------------
		
		
		
		sc.close();
		System.out.println("Finish");
	}
}
