package com.cy.view;

public class GameMain {
	//全局变量   static 静态
	
	public static WelcomeFrame welcomeFrame;   
	public static GameFrame gameFrame ;
	
	 
	
	public static void main(String[] args) {		
		 
		
		 welcomeFrame = new WelcomeFrame();   //对象
		 gameFrame = new GameFrame();
	}
}
