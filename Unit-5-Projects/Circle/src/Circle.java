public class Circle {
    private double radius;
    public Circle(){
        radius = 1.0;
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return (Math.PI*(Math.pow(radius,2)));
    }
    public String toString(){
        return "This circle has a radius of " + radius;
    }
}
