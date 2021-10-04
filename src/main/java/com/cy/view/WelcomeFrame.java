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
   
	//��ʼ��
	public WelcomeFrame() {
		
		this.setSize(900, 600);
		this.setTitle("Mario"); //����		
	    this.setLocationRelativeTo(null);// ����	  
	    this.setResizable(false); //���ɸı��С
	    this.setLayout(null); //�ô��ڵ�Ĭ�ϲ���ʧЧ	    
	    //1. �а�ť
	    Icon icon = new ImageIcon("image/start01.png");	    
	    JButton btn = new JButton("��Ϸ��ʼ",icon);
	    btn.setBounds(400, 400, 100, 30); //��ť��λ��
	    // 2.��ťװ�ϼ���
	    btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// ��Ϸ������ʾ
				System.out.println("----OK---");
				// this.setVisible(false);
				GameMain.welcomeFrame.setVisible(false);
				
				GameMain.gameFrame.setVisible(true);
			}
		});
	    
	    //3. �Ѱ�ť�ӵ�������
	    this.add(btn);	  
	    
	    
		this.setVisible(true);//�Ƿ�ɼ�
	    
		
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
