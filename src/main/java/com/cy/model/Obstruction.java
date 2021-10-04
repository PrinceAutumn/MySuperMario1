package com.cy.model;

public class Obstruction {

	public int x,y,type,endType;  //x, y 轴， 图片类型， 结束时图片类型
	
	// 构造方法 / -new 时会调用 , 初始化
	public Obstruction(int x, int y, int type,int endType) {
		this.x = x;
		this.y = y;
		this.type =type;
		this.endType = endType;
	}
}
