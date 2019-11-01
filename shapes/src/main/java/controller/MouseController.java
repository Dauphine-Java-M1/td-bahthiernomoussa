package controller;

import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MouseController extends Frame implements MouseMotionListener{
	
	private int x;
	private int y;
	
	public MouseController() {
		// TODO Auto-generated constructor stub
		addMouseMotionListener(this);
		
		setSize(300,300);
		setLayout(null);
		setVisible(true);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		x = e.getX();
		y = e.getY();
	}
	
	public static void main(String[] args) {
		//Quelques tests.
		
		new MouseController();
	}

}
