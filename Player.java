
public class Player {
	
	public Player(int number) {
		if (number == 1) {
			x = 25;
			y = 250;
			up = 'q';
			down = 'a';
			red = 255;
			green = 0;
			blue = 0;
		}
		else {
			x = 775;
			y = 25;
			up = 'o';
			down = 'l';
			red = 0;
			green = 0;
			blue = 255;
		}
	}
	
	char up;
	char down;
	int red;
	int green;
	int blue;
	
	int player = 0;
	
	int score = 0;
	
	int x ;
	int y;
}
