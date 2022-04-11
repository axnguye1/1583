import java.util.ArrayList;

public class Scene {
	/*Attributes: Instance Variables*/
	private String image;
	private int width;
	private int height;
	private ArrayList<Enemy> monsters;

public Scene() {
	width = 500;
	height = 350;
	image = "assets/space-background.png";
	monsters = new ArrayList<Enemy>();

	StdDraw.setCanvasSize(width, height);
	StdDraw.setXscale(0.0, height);
	StdDraw.setYscale(height, 0.0);
}

public void draw() {
	StdDraw.picture(width/2,height/2,image);
	for (Enemy monster : monsters) {
		monster.draw();
	}
}
public void addMonster() {
	double x = 32+ (Math.random() * (width - 64));
	double y = (Math.random() * height);
	Enemy star = new Enemy(x,y);
	monsters.add(star);
}


	}