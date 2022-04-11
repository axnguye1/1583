
public class DodgerGame {
	private Scene scene;
	private boolean isOver;

	public DodgerGame() {
		isOver = false;
		scene = new Scene();
	}
	public void update() {
		scene.addMonster();

	}
	public void render() {
		scene.Draw();
		StdDraw.show(100);

	}
	public static void main(String[] args) {
		DodgerGame game = new DodgerGame();
		while (game.isOver == false) {
			game.update();
			game.render();
		}
	}
}