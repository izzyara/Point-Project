public class Line2D {
    
    private Point P1;
    private Point P2;

    public Line2D(Point p1, Point p2){
        P1 = p1;
        P2 = p2;
    }
    public Line2D(int x1, int y1, int x2, int y2){
        P1.setX(x1);
        P1.setY(y1);
        P2.setX(x2);
        P2.setY(y2);
    }
    public Point getP1(){
        return P1;
    }
    public Point getP2(){
        return P2;
    }
    public String toString(){
        return("[(" + P1.getX() + "," + P1.getY() + "), (" + P2.getX() + "," + P2.getY() + ")]");
    }
    public double getSlope(){
        if (P2.getX()-P1.getY()!=0){
            double m = ((double)P2.getY()-P1.getY())/((double)P2.getX()-P1.getX());
            return m;
        }else{
            throw new IllegalArgumentException("undefined slope");
        }
    }

    public boolean isCollinear(Point p1){
        if ((this.getSlope()!=0 || (P2.getX()-p1.getX())!=0)){
            double m = this.getSlope();
            double n = ((double)P2.getY()-p1.getY())/((double)P2.getX()-p1.getX());
            if (Math.abs(m-n)<0.01){
                return true;
            }else{
                return false;
            }
        }else{
            if (P2.getX()==P1.getX() && P1.getX()==p1.getX()){
                return true;
            }else{
                return false;
            }
            
        }
        
    }
}
