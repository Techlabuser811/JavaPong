
public class Paddle {
	double x;
	double y;
	Player me;
	Ball b;
	
	public Paddle(Player p, Ball ball) {
		me = p;
		b = ball;
		this.x = p.x;
		this.y = p.y;
	}
	
	public void setPosition( double newx, double newy) {
		x = newx;
		y = newy;
	}
	
	
	
	public void draw() {
		Zen.setColor(me.red, me.green, me.blue);
		Zen.fillRect((int) x - 2, (int) y- 50, 5, 100);
	}
	
	public void move () {
		if (Zen.isKeyPressed(me.up) && y>= 65) {
			y = y - 7;
		}
		if (Zen.isKeyPressed(me.down) && y <= 436) {
			y = y + 7;
		}
		if ( Math.abs(x- b.x) <= 10 && Math.abs(y- b.y) <= 50 ) {
			b.bounceHorizontally();
			b.xv = b.xv * 1.1;
			b.move();
			b.yv += (b.y - y) / 10;
		}
	}
}
