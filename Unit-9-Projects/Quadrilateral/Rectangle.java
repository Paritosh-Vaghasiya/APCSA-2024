package Quadrilateral;
class Rectangle extends Parallelogram {
    private boolean diaCon;

    public Rectangle(boolean diaCon) {
        super(true, true, true);
        this.diaCon = diaCon;
    }

    public boolean areDiaCon() {
        return diaCon;
    }

    public String toString() {
        return "Rectangle: has four angles 90 degrees and diagonals that are congruent: " + diaCon + ", opposite sides parallel: " + isOppSidePar() + ", opposite angles congruent: " + isOppAngCon() + ", opposite sides congruent: " + isOppSideCon() + ", " + super.toString();
    }
}
