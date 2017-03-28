import org.jointheleague.graphical.robot.Robot;

public class DrawSquare {
public static void main(String[] args) {
	Robot potatotron1000;
	potatotron1000=new Robot("mini");
	potatotron1000.penDown();
	potatotron1000.setSpeed(10);
	for (int i = 0; i < 4; i++) {
		potatotron1000.setRandomPenColor();
		potatotron1000.move(400);
		potatotron1000.turn(-90);
	}
	
}
}
