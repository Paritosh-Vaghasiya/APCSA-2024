package Quadrilateral;
class Square extends Rectangle {
    public Square() {
        super(true);
    }

    public String toString() {
        return "Square: has four congruent sides, four angles 90 degrees and diagonals that are congruent: " + areDiaCon() + ", opposite sides parallel: " + isOppSidePar() + ", opposite angles congruent: " + isOppAngCon() + ", opposite sides congruent: " + isOppSideCon() + ", " + super.toString();
    }
}