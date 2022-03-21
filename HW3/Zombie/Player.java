import java.util.Scanner;
//ImageIcon icon;
public class Player {
	//player data.
	private static String image;
	private static int width;
	private static int height;
	private static double x;
	private static double y;

Scanner input = new Scanner(System.in);
//Get Player Input
//public void KeyTyped(KeyEvent e){
	//switch(e.getKeyChar()){
	//case 'a': label.setLocation(label.getX()-1, label.getY());
	//case 'd': label.setLocation(label.getX()+1, label.getY());
	//case 'w': label.setLocation(label.getX(), label.getY()+1);
	//case 's': label.setLocation(label.getX(), label.getY()-1);
	//}
//}
			


public static void start() {
	image = "assetszombie/player.png";
	width = 32;
	height = 32;
	x = 16;
	y = 16;
	
}
public static void draw() {
	StdDraw.picture(x+width/2, y+height/2, image);


	}
public static void move() {
	if(StdDraw.hasNextKeyTyped()){
		char move = StdDraw.nextKeyTyped();
		if(move =='w'){
			y-=32;
			if(y<0){
				y = 0;
			}
		}
		else if(move =='a'){
			x -=32;
			if(x>=Scene.getWidth()){
				x = Scene.getWidth() - 64;
			}
		}
		else if(move =='d'){
			x += 32;
			if(x >= Scene.getWidth()){
				x = Scene.getWidth() - 32;
			}
		}
		else if(move == 's'){
			y += 32;
			if(y >=Scene.getHeight()){
				y = Scene.getHeight() - 32;
			}
		}

	}	
}

	public static void update() {
		move(); //update player
		
	}

	public static double getLeft() {
	return x;
	}
	public static double getTop() {
	return y;
	}
	public static double getBottom() {
	return y + height;
	}
	public static double getRight() {
	return x + width;
	}
}