package Quadrilateral;
class Quadrilateral {
    private int numSide;
    private int intAngSum;

    public Quadrilateral() {
        numSide = 4;
        intAngSum = 360;
    }

    public int getNumSide() {
        return numSide;
    }

    public int getIntAngSum() {
        return intAngSum;
    }

    public String toString() {
        return "Quadrilateral: has " + numSide + " sides and its interior angle sum is " + intAngSum + " degrees.";
    }
}
