public class Cylinder {
    private double height;
    private Circle base;
    public Cylinder(double h, Circle b){
        height=h;
        base=b;
    }
    public double vol(){
        return base.getArea()*height;

    }
    public double sa(){
        return (base.getCrc()*height)+(2*base.getArea());

    }

}
