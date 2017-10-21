import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;

public class Starfield extends Canvas implements Runnable{
	Random r = new Random();
	public static final int WIDTH = 1280;
	public static final int HEIGHT = 720;
	public static final String TITLE = "Starfield";
	Star[] stars = new Star[200];
	Star star = new Star();
	Thread thread = new Thread();

	
	public void paint(Graphics g) {
		int s = 0;
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, WIDTH, HEIGHT);
		
		for (int i = 0; i < stars.length; i++) {
			stars[i] = new Star();
			stars[i].show(getGraphics());
			s++;
//			System.out.println("Star no " + s + " X= " + stars[i].getA() + " Y= " + stars[i].getB());
		}
		
		star.update(g);
	}
	


	public static void main(String[] args) {
		Starfield starfield = new Starfield();
		JFrame frame = new JFrame();
	 	frame.add(starfield);
		frame.setResizable(false);
		frame.pack();
		frame.setTitle(TITLE);
		frame.setSize(WIDTH, HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.requestFocus();

	}



	@Override
	public void run() {
		
	}
}
