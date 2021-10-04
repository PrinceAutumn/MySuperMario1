package com.cy.model;

import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class MyData {
//游戏背景
	public static Image img = new  ImageIcon("image/firststage.gif").getImage();		
//地板
	public static Image ob10 = new  ImageIcon("image/ob10.gif").getImage();
	//水管
	public static Image ob6 = new  ImageIcon("image/ob6.gif").getImage();
	public static Image ob7 = new  ImageIcon("image/ob7.gif").getImage();
	public static Image ob8 = new  ImageIcon("image/ob8.gif").getImage();
	public static Image ob9 = new  ImageIcon("image/ob9.gif").getImage();
	//玛丽
	public static ArrayList<Image> marioList =new ArrayList<Image>();	
	static {
		for(int i=1;i<=10;i++) {
			marioList.add(new  ImageIcon("image/"+i+".gif").getImage());
		}
	}
	 
	
}
