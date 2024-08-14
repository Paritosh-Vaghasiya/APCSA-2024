package Quadrilateral;
class Parallelogram extends Quadrilateral {
    private boolean oppSidePar, oppAngCon, oppSideCon;

    public Parallelogram(boolean oppSidePar, boolean oppAngCon, boolean oppSideCon) {
        this.oppSidePar = oppSidePar;
        this.oppAngCon = oppAngCon;
        this.oppSideCon = oppSideCon;
    }

    public boolean isOppSidePar() {
        return oppSidePar;
    }

    public boolean isOppAngCon() {
        return oppAngCon;
    }

    public boolean isOppSideCon() {
        return oppSideCon;
    }

    public String toString() {
        return "Parallelogram: has opposite sides parallel: " + oppSidePar + ", opposite angles congruent: " + oppAngCon + ", opposite sides congruent: " + oppSideCon + ", " + super.toString();
    }
}
