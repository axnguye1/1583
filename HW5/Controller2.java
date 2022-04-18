public class Controller2 {
	private Dog dog;
	private static double x;
	private static double y;

	

	public Controller2( Dog dog){
		this.dog = dog;
	}

	
	public void moveDog() {
		if (StdDraw.hasNextKeyTyped() == true) {

			double dogX = dog.getX();
			double dogY = dog.getY();
			char key = StdDraw.nextKeyTyped();
			if (key == 'a'){
				x-=32;
				//if(x>=Scene.getWidth()){
				//x = Scene.getWidth() - 32;
				//}
			}
			if (key == 'd'){
				x += 32;
			//if(x >= Scene.getWidth()){
			//	x = Scene.getWidth() - 32;
			//	}
			}
		}
	}
	
	public void update(){
		
		moveDog();
	}
}