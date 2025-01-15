public class Line2DTest {
    
    public static void main (String[]args){

        Point p1 = new Point(0,0);
        Point p2 = new Point(3,4);
        Point p3 = new Point(4,9);
        Point p4 = new Point(6,8);
 
        Line2D l1 = new Line2D(p1, p2);
        Line2D l2 = new Line2D(p3, p4);

        System.out.println("Testing getP1 and getP2 methods:\n" + "Line 1, getP1: x=" + l1.getP1().getX() + ", y=" + l1.getP1().getY());
        System.out.println("Line 1, get P2: x=" + l1.getP2().getX() + ", y=" + l1.getP2().getY());
        System.out.println("Line 2, get P1: x=" + l2.getP1().getX() + ", y=" + l2.getP1().getY());
        System.out.println("Line 2, get P2: x=" + l2.getP2().getX() + ", y=" + l2.getP2().getY());

        System.out.println("Line 1 slope: " + l1.getSlope());
        System.out.println("Line 2 slope: " + l2.getSlope());

        System.out.println("Testing isCollinear: \n" + "Line1 and p3: " + l1.isCollinear(p3));
        System.out.println("Line1 and p4: " + l1.isCollinear(p4));

    }
}
