import java.util.Scanner;

public class Point {
    Double width;
    Double height;
    Scanner s = new Scanner(System.in);



    public Point(Double width, Double height){
            this.width = width;
            this.height = height;

    }
    public Point middle(Point p){

        Point y = new Point(4.0,15.0);
        Point x = new Point(s.nextDouble(),s.nextDouble());
        double width = (y.width + x.width) / 2;
        double height = (y.height + x.height) / 2;
        Point z = new Point(width,height);
        return z;
    }
    public Double distance(Point p){
        Point y = new Point(4.0,15.0);
        Point x = new Point(s.nextDouble(),s.nextDouble());
        return Math.sqrt(Math.pow((x.height - y.height),2) + Math.pow((x.width - y.width),2));


}

    public Double areaSize(Point x, Point y) {
        Point z = new Point(s.nextDouble(),s.nextDouble());
        return(x.width*(y.height - z.height) + y.width * (z.height - x.height) + z.width * (x.height - y.height))/2;

    }

    public Double slope(){
        Point x = new Point(s.nextDouble(),s.nextDouble());
        return (x.height / x.width);
    }

    }
