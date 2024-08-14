public class Complex {
    private double  realPart, imaginaryPart;
    public Complex(){
        realPart = 0;
        imaginaryPart = 0;
    }
    public Complex(double  realPart, double imaginaryPart){
        this.realPart =  realPart;
        this.imaginaryPart = imaginaryPart;
    }
    public double getRealPart() {
        return realPart;
    }
    public String getImaginaryPart() {
        return imaginaryPart + "i";
    }
    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }
    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }
    public void addComplex(double realPart, double imaginaryPart){
        this.realPart = this.realPart+realPart;
        this.imaginaryPart = this.imaginaryPart+imaginaryPart;
    }
    public void subtractComplex(double realPart, double imaginaryPart){
        this.realPart = this.realPart-realPart;
        this.imaginaryPart = this.imaginaryPart-imaginaryPart;
    }
    public String toString(){
        return "(" + realPart + " + " + imaginaryPart + "i)";
    }
}
