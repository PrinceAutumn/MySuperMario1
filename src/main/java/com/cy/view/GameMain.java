package com.cy.view;

public class GameMain {
	//ȫ�ֱ���   static ��̬
	
	public static WelcomeFrame welcomeFrame;   
	public static GameFrame gameFrame ;
	
	 
	
	public static void main(String[] args) {		
		 
		
		 welcomeFrame = new WelcomeFrame();   //����
		 gameFrame = new GameFrame();
	}
}
