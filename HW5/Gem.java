public class Gem {
	private String image;
	private int width;
	private int height;
	private double x;
	private double y;
	private int speed;

	public Gem(double x, double y){
		this.x = x;
		this.y = y;
		this.width=32;
		this.height=32;
		this.image="assets/Ruby_Pixel.png";
		this.speed = (int) (5 + Math.random() * 10);

	} public void draw() {
		StdDraw.picture(x, y, image, width, height);

	} public void move() {
		this.y += this.speed;

	}public double getX() {
		return this.x;

	}public double getY() {
		return this.y;
		
	}

}