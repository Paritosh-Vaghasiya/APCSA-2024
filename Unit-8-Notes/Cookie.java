public class Cookie {
    static int[][] cookie = {{1,4,2,3,3},{1,3,2,3,4},{1,3,1,2,2},{1,3,2,3,1},{1,1,2,3,4},{1,2,3,2,2},{1,2,2,3,2},{1,4,3,2,4},{1,1,2,2,1},{1,2,3,3,3},{1,2,2,1,3},{1,2,2,3,4},{1,3,2,3,2},{1,1,2,1,3},{1,3,3,4,3},{2,5,1,5,5},{2,3,2,4,4},{2,4,1,4,4},{1,4,4,3,3},{2,4,1,4,3},{2,4,4,5,4},{2,4,2,5,5},{2,5,4,5,5},{2,4,2,4,4},{2,4,2,4,2},{2,3,1,5,3},{2,4,2,4,4},{2,3,3,3,4},{2,3,2,3,3},{2,3,1,4,3},{2,3,2,4,5},{2,3,2,4,5},{2,5,3,5,5},{1,5,5,5,1},{2,5,4,5,4},{2,4,2,3,3}};
    public static void main(String[] args) {
        System.out.println("Cookie"+"\t"+"Chocolatiness"+"\t"+"Size"+"\t"+"Taste"+"\t\t"+"Aroma");
        for(int[] row : cookie){
            for(int value : row)
                System.out.print(value + "\t\t\t");
            System.out.println();
        }
        //calculate the avg for each cookie
        for (int i = 1; i < 3; i++) {
            print("Chocolatiness", doCalc(i,1), i);
            print("Size", doCalc(i,2), i);
            print("Taste", doCalc(i,3), i);
            print("Aroma", doCalc(i,4), i);
        }
    }

    public static double doCalc(int cookieNum, int colNum){
        int sum = 0, count = 0;
        for (int r = 0; r < cookie.length; r++) {//loop over the rows
            if(cookie[r][0]==cookieNum) { //check to see if it's cookie 1 or 2
                sum += cookie[r][colNum]; //adding up each individual value for the column
                count++;//keep track of how many ppl submitted a ranking for the cookie
            }
        }
        return (double)sum/count;
    }

    public static void print(String cat, double value, int cookieNum){ //this will print out everything
        System.out.println("The "+cat+" of cookie "+cookieNum+" was: "+value);
    }
}
