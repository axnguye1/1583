public class Car{
	private static String image;
	private static int width;
	private static int height;
	private static double x;
	private static double y;
	public static boolean escaped;

	public static void start(){
		image = "assetszombie/car.png";
		width = 32;
		height = 32;
		x = 400;
		y = 325;
	}
	public static void draw(){
		StdDraw.picture(x+width/2, y+height/2, image);
	}
	public static void update(){
		if(Car.isTouching() == true){
			escaped = true;
		}
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
	public static boolean isTouchingX(){
		return Player.getLeft() <= Car.getRight() && Car.getLeft() <= Player.getRight();
	}
	public static boolean isTouchingY(){
		return Player.getTop() <= Car.getBottom() && Car.getTop() <= Player.getBottom();

	}
	public static boolean isTouching(){
		return Car.isTouchingX() && Car.isTouchingY();
	}
}