package com.cy.controller;

import java.awt.Image;
import java.util.ArrayList;

import com.cy.model.Mario;
import com.cy.model.MyData;
import com.cy.model.Obstruction;

//控制类，导演类 
public class GameController {
	//放在容器 -->  大小可变 --> 集合
	public ArrayList<Obstruction> ObsAll = new ArrayList<Obstruction>();
	public Mario mario;
	
	public GameController() {		
		// 格式对齐 ctrl+shift+F
		// new 出7 砖头   水管，
		//15个地板
		for(int i=0;i<15;i++) {
			//Obstruction a = new Obstruction(i*60,600-60,10,0);
			ObsAll.add( new Obstruction(i*60,600-60,10,0));
		}
		 //水管
		ObsAll.add(new Obstruction(11*60,600-2*60,9,0));
		ObsAll.add(new Obstruction(11*60,600-60,7,0));
		ObsAll.add(new Obstruction(12*60,600-2*60,8,0));
		ObsAll.add(new Obstruction(12*60,600-60,6,0));
		
		
		//玛丽
		mario = new Mario(0,600-2*60);
		
		
	}
	
	//根据类型得到障碍物的图片
	
	public Image getObsImage(int type) {
		Image image = null;
		
		switch(type) {
		case 10:
			image = MyData.ob10;
			break;
		case 6:
			image = MyData.ob6;
			break;
		case 7:
			image = MyData.ob7;
			break;
		case 8:
			image = MyData.ob8;
			break;
		case 9:
			image = MyData.ob9;
			break;		
		}			
		return image;
	}
	
	
}
