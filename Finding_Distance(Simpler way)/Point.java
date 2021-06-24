public class Point {
    
    int x;
    int y;

    double computeDistance(Point t1, Point t2)
    {
        int dx = t1.x - t2.x;
        int dy = t1.y - t2.y;

        int total = (dx * dx) + (dy * dy); 
        
        double dist = Math.sqrt(total);
        return dist;



    }




    public static void main(String args[]){

        Point p1 = new Point();
        p1.x = 3;
        p1.y = 4;

        Point p2 = new Point();
        p2.x = 6;
        p2.y = 8;



        System.out.println(p1.computeDistance(p1, p2));


    }
}
