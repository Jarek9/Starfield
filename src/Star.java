import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Star {

	Random r = new Random();
	private int a;
	private int b;
	
	public void show(Graphics g) {
		
			int x = r.nextInt(Starfield.WIDTH);
			int y = r.nextInt(Starfield.HEIGHT);
			int z = 1;
			
					
			g.setColor(Color.white);
			g.fillOval(x, y, 7, 7);	
			
			a = x;
		 	b = y;
		 	
		 	
		}
	
	public void update(Graphics g)
	{
		g.fillOval(a+1, b, 5, 5);
	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	

	
	
}
	