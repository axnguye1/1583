public class Enemy {
//Enemy Data --> accessible by all enemy methods, scoped for as long as Game class runs.
	private static String image;
	private static int width;
	private static int height;
	private static double x;
	private static double y;
	public static boolean zombie;

	//draw enemy
	public static void draw() {
		StdDraw.picture(x+width/2, y+height/2, image);
	}

	public static void start() {
		image = "assetszombie/zombie.png";
		width = 32;
		height =32;
		x = Math.random() * Scene.getWidth() - width;
		y = Math.random() * Scene.getHeight() - height;
		time = System.currentTimeMillis();
	}

	public static void move() {
		int zombieChoice = (int) (Math.random()*4);
		if (zombieChoice == 0){
			x = (x + 32) % Scene.getWidth();
			}
			else if (zombieChoice == 1){
				x = --x >=0 ? x : (Scene.getWidth() - 32);
			}
			else if (zombieChoice == 2){
				y = --y >=0 ? y : (Scene.getHeight() - 32);
			}
			else if (zombieChoice ==3){
				y = (y + 32) % Scene.getHeight();
			}
		time = System.currentTimeMillis();
	}
	public static void update() {
		if(Enemy.isTouching() == true){
			zombie = true;
		}
		

		long now = System.currentTimeMillis();
		if (now - time > 1000){
			Enemy.move();
				}
				//if ( Enemy.isTouching() && Player.isAttacking() ) {
					//Enemy.move();
					
				//}

			}
	private static long time;

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
	public static boolean isTouchingX(){
		return Player.getLeft() <= Enemy.getRight() && Enemy.getLeft() <= Player.getRight();
	}
	public static boolean isTouchingY(){
		return Player.getTop() <= Enemy.getBottom() && Enemy.getTop() <= Player.getBottom();
	}
	public static boolean isTouching() {
		return Enemy.isTouchingX() && Enemy.isTouchingY();
	}
		
}