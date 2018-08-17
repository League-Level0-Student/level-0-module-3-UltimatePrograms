import org.jointheleague.graphical.robot.Robot;

public class obi {
public static void main(String[] args) {
	Robot ob = new Robot("batman");
	for (int i = 0;i<4; i++) {
		ob.penDown();
		ob.move(100);
		ob.turn(90);
	}
}
}
