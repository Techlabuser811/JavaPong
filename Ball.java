
public class Ball {
	
	double x;
	double y;
	double xv;
	double yv;
	
	public Ball( int newx, int newy ) {
		x = newx;
		y = newy;
	}
	
	public void setPosition(double newx, double newy) {
		x = newx;
		y = newy;
	}
	
	public void setVelocity(double newxv, double newyv) {
		xv = newxv;
		yv = newyv;
	}
	
	public void bounceHorizontally() {
		xv = -1 * xv;
	}
	
	public void bounceVertically() {
		yv = -1 * yv;
	}
	
	public void move() {
		x = x + xv;
		if (x + 5 >= 800 || x - 5 <= 0) {
			bounceHorizontally();
		}
		y = y + yv;
		if (y+ 5 >= 500 || y - 5 <= 0) {
			bounceVertically();
		}
	}
	
	public void draw() {
		Zen.setColor(255, 255, 255);
		Zen.fillOval((int) x-5, (int) y-5, 10, 10);
	}
}
