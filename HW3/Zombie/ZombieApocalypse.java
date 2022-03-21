
public class ZombieApocalypse{
	private static boolean gameOver = false;
		public static void main( String[] args ){
start();//Start Game
	 while (gameOver == false){//Game Loop
	 	update();//1. update game
	 	render();//2. render game
	 	if(Car.escaped == true){
	 		gameOver = true;
	 		StdDraw.text(136, 32, "You escaped with the police!");
		 }
		 if(Enemy.zombie == true){
		 	gameOver = true;
		 	StdDraw.text(136, 32, "You did not survive.");
		 }
	 	}
	}

	public static void render() {
		Scene.draw();//draw scene
		Enemy.draw();//draw enemy
		Player.draw(); //draw player
		StdDraw.show();
		Car.draw();
		StdDraw.pause(400);
		
		
		
	}

	public static void update() {
		Enemy.update();
		Player.update();
		//check for input
		//update player
		Enemy.update();//update enemy
		Car.update();
	}

	public static void start() {
		Scene.start();
		Enemy.start();
		Player.start();
		Car.start();
		//setup all game data
	}

}





	
