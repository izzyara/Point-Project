public class Point{

    private int x;
    private int y;
    
    public Point(){
        x = 0;
        y = 0;
    }
    public Point(int initX, int initY){
        x = initX;
        y = initY;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setX(int initX){
        x = initX;
    }

    public void setY(int initY){
        y = initY;
    }

    public int manhattanDistance(Point other){
        int distance = Math.abs(x-other.getX())+Math.abs(y-other.getY());
        return distance;
    }

    public boolean isCollinear(Point p1, Point p2){
        if ((p2.getX()-p1.getX())==0 || (p1.getX()-x)==0){
            throw new IllegalArgumentException("undefined slope");
        }
        double m = (p2.getY()-p1.getY())/(p2.getX()-p1.getX());
        double n = (p1.getY()-y)/(p1.getX()-x);
        if (m==n){
            return true;
        }else{
            return false;
        }
    }
}
