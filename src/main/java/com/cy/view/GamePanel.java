package com.cy.view;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

import com.cy.controller.GameController;
import com.cy.model.Mario;
import com.cy.model.MyData;
import com.cy.model.Obstruction;

public class GamePanel extends JPanel{
	
	 public Mario mario;
	 
	 public GameController gamgeController;

	 public GamePanel(GameController gameC ) {
		this.gamgeController = gameC;
		
		this.setPreferredSize(new Dimension(900, 600));
		this.setLayout(null);
		
		this.setVisible(true);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		
		// ±³¾°		
		g.drawImage(MyData.img, 0, 0, 900, 600, null);			
		//»­µØ°å
	
		// 1. È¡ÈÝÆ÷Å¶£¬
		for(int i=0;i< gamgeController.ObsAll.size()  ;i++) {
			Obstruction obstruction = gamgeController.ObsAll.get(i);				
			g.drawImage(gamgeController.getObsImage(obstruction.type), obstruction.x,obstruction.y, null); 
		}
		
		// 
		mario= gamgeController.mario;
		g.drawImage(mario.mimage,mario.x,mario.y,null);
		repaint();   // Ë¢ÐÂ
	}
	
}
