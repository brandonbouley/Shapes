
public class Circle {
    private double radius;

    public Circle(double r){
        radius= r;


        }
    public double getCrc(){
        return 2*radius*Math.PI;

    }
    public double getArea(){
        double area=Math.pow(radius, 2)*Math.PI;
        return area;

    }
}
