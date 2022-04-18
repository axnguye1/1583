import java.util.ArrayList;

public class Scene {
	/*Attributes: Instance Variables*/
	private String image;
	private int width;
	private int height;
	private ArrayList<Enemy> monsters;
	private ArrayList<Oxygen> tanks;
	private ArrayList<Gem> crystals;
	private Player player;
	private Dog dog;
	



public Scene() {
	width = 500;
	height = 350;
	image = "assets/space-background.png";
	monsters = new ArrayList<Enemy>();
	tanks = new ArrayList<Oxygen>();
	crystals = new ArrayList<Gem>();

	StdDraw.setCanvasSize(width, height);
	StdDraw.setXscale(0.0, height);
	StdDraw.setYscale(height, 0.0);
}

public void draw() {
	StdDraw.picture(width/2,height/2,image);
	for (Enemy monster : monsters) {
		monster.draw();
	}
	for (Oxygen tank : tanks) {
		tank.draw();
	}
	for (Gem crystal : crystals){
		crystal.draw();
	}
	player.draw();
	dog.draw();
}
public void addMonster() {
	double x = 32+ (Math.random() * (width - 64));
	double y = -32;
	Enemy star = new Enemy(x,y);
	monsters.add(star);
}
public void addTank() {
	double x = 128+ (Math.random() * (width - 64));
	double y = -128;
	Oxygen gas = new Oxygen(x,y);
	tanks.add(gas);
}
public void addCrystal() {
	double x = 128+ (Math.random() * (width - 64));
	double y = -128;
	Gem ruby = new Gem(x,y);
	crystals.add(ruby);
}
public void update() {
	for (Enemy monster : monsters){
		monster.move();
	}
	for(Oxygen tank : tanks){
		tank.move();

	}
	for(Gem crystal : crystals){
		crystal.move();
	}
}
public Player getPlayer() {
	return this.player;
	}

public void setPlayer( Player player){
	this.player = player;
}

public Dog getDog() {
	return this.dog;
	}

public void setDog( Dog dog){
	this.dog = dog;
}

public ArrayList<Enemy> getMonsters() {
	return this.monsters;
}
public ArrayList<Oxygen> getTanks() {
	return this.tanks;
}
public ArrayList<Gem> getCrystals() {
	return this.crystals;
}


	
}