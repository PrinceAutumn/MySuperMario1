package com.cy.view;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class WelcomeFrame  extends JFrame{
   
	//初始化
	public WelcomeFrame() {
		
		this.setSize(900, 600);
		this.setTitle("Mario"); //标题		
	    this.setLocationRelativeTo(null);// 居中	  
	    this.setResizable(false); //不可改变大小
	    this.setLayout(null); //让窗口的默认布局失效	    
	    //1. 有按钮
	    Icon icon = new ImageIcon("image/start01.png");	    
	    JButton btn = new JButton("游戏开始",icon);
	    btn.setBounds(400, 400, 100, 30); //按钮的位置
	    // 2.按钮装上监听
	    btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 游戏窗口显示
				System.out.println("----OK---");
				// this.setVisible(false);
				GameMain.welcomeFrame.setVisible(false);
				
				GameMain.gameFrame.setVisible(true);
			}
		});
	    
	    //3. 把按钮加到窗口中
	    this.add(btn);	  
	    
	    
		this.setVisible(true);//是否可见
	    
		
	}
	
 
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		Image  img = new  ImageIcon("image/back.jpg").getImage();
		g.drawImage(img, 0, 0, 900, 600,null);
		//g.drawImage(img, dx1, dy1, dx2, dy2, sx1, sy1, sx2, sy2, observer);
		 
	}
	
	 
	
}
