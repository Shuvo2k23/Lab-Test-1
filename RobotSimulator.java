package LabTest1;

public class RobotSimulator {

    private char direction;
    public RobotSimulator(){

        direction = ' ';
    }
    Point point = new Point();
    public void turnLeft(){
        direction = 'W';
    }
    public void turnRight(){
        direction = 'E';
    }
    public void turnUp(){
        direction = 'N';
    }
    public void turnDown(){
        direction = 'S';
    }

    public void move(){
        if(direction==' '){
            System.out.println("Please select direction.");
        }
        else if(direction=='W'){
            point.setxCoOrdinate(point.getxCoOrdinate()-1) ;
        }
        else if(direction == 'E'){
            point.setxCoOrdinate(point.getxCoOrdinate()+1) ;
        }
        else if( direction == 'N'){
            point.setyCoOrdinate(point.getyCoOrdinate()+1);
        }
        else{
            point.setyCoOrdinate(point.getyCoOrdinate()-1);
        }
    }
    public Point getLocation(){
        return point;
    }
    public String getDirection(){
        String dir =  direction+"";
        return dir;
    }

}
