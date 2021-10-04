package com.cy.controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameKeyListener implements KeyListener{

	public GameController gameController;
	
	public GameKeyListener (GameController gameController) {
		this.gameController= gameController;
	}
	
	
	
	@Override
	public void keyPressed(KeyEvent e) {
		 
		// 判断当key ==39
		
		if(e.getKeyChar() =='D' || e.getKeyChar()=='d') {
			gameController.mario.rightMove();
			
		}
		if(e.getKeyChar() =='A' || e.getKeyChar()=='a') {
			gameController.mario.leftMove();	 
		}
		if(e.getKeyChar() =='W' || e.getKeyChar()=='w') {
			gameController.mario.y -= 5;	 
		}
		
	}

	//放下来
	@Override
	public void keyReleased(KeyEvent e) {
		if(e.getKeyChar() =='D' || e.getKeyChar()=='d') {
			gameController.mario.rightStop();
			
		}
		if(e.getKeyChar() =='A' || e.getKeyChar()=='a') {
			gameController.mario.lefStop();	 
		}
		
	 
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
