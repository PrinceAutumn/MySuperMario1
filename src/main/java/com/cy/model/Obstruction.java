package com.cy.model;

public class Obstruction {

	public int x,y,type,endType;  //x, y �ᣬ ͼƬ���ͣ� ����ʱͼƬ����
	
	// ���췽�� / -new ʱ����� , ��ʼ��
	public Obstruction(int x, int y, int type,int endType) {
		this.x = x;
		this.y = y;
		this.type =type;
		this.endType = endType;
	}
}
