public class Enemy {
	private String image;
	private int width;
	private int height;
	private double x;
	private double y;

	public Enemy(double x, double y){
		this.x = x;
		this.y = y;
		this.width=32;
		this.height=32;
		this.image="assets/asteroid.png";

	} public static void draw() {
		StdDraw.picture(x, y, image, width, height);

	}

}