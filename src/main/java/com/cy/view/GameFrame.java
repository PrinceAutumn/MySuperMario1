package com.cy.view;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import com.cy.controller.GameController;
import com.cy.controller.GameKeyListener;
import com.cy.model.Mario;
import com.cy.model.MyData;
import com.cy.model.Obstruction;
 

   //����

public class GameFrame extends JFrame{
//extends �̳�
	
	GameController gamgeController = new GameController();	
	Mario mario =null;
	
	public GameFrame() {
		this.setSize(900, 600);		
		
		GamePanel gamePanel = new GamePanel(gamgeController );
		
		this.add(gamePanel);
		// 1. ���¼�����  
		this.addKeyListener(new GameKeyListener(gamgeController));
		// ����
	    this.setLocationRelativeTo(null);
	    this.setResizable(false);
		this.setVisible(false);  //�Ƿ�ɼ� //�������
	}
 
}
