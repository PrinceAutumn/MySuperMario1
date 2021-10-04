package com.cy.model;

import java.awt.Image;

public class Mario implements Runnable {

	// ����
	public int x, y;
	public Image mimage;// ��ǰͼƬ������
	public String status;// ״̬,right-moving
	public int moving = 0, lmoving = 5; // ͼƬ������

	public Mario(int x, int y) {
		this.x = x;
		this.y = y;
		this.mimage = MyData.marioList.get(0);
		this.status = "standing";

		Thread t = new Thread(this);
		t.start();

	}

	@Override
	public void run() {

		while (true) {
			int index = 0;
			int lindex = 0;
			// System.out.println(this.status.equals("rm"));
			if (this.status.equals("right-moving")) {
				
				// �ƶ��иı�ͼƬ
				index += moving;
				moving++;
				if (moving == 4) {
					moving = 0;
				}
				this.mimage = MyData.marioList.get(index);
			} else if (this.status.equals("left-moving")) {

				lindex += lmoving;
				lmoving++;
				System.out.println(lmoving);
				if (lmoving == 9) {
					lmoving = 5;
				}
				this.mimage = MyData.marioList.get(lindex);
			}

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	// ��Ϊ//����
	public void rightMove() {
		this.status = "right-moving";
		if(this.x < 600) {
			this.x += 5;
		}
	}

	public void rightStop() {
		this.status = "right-standing";

	}

	public void leftMove() {
		this.status = "left-moving";
		if(this.x > 60) {
			this.x -= 5;
		}else {
			this.x=0;
		}
		

	}

	public void lefStop() {
		this.status = "left-standing";
	}

}
