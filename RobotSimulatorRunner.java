package LabTest1;

public class RobotSimulatorRunner {
    public static void main(String[] args) {
        RobotSimulator robot1 = new RobotSimulator();
        robot1.turnLeft();
        robot1.turnDown();
        robot1.move();
        robot1.turnUp();
        robot1.move();
        robot1.move();
        robot1.move();
        robot1.turnRight();
        robot1.move();

        System.out.println("Direction: "+robot1.getDirection());
        int x =robot1.point.getxCoOrdinate();
        int y = robot1.point.getyCoOrdinate();
        System.out.println("Positon : x-axis: "+x+" ,y-axis: "+y);
    }
}
