package MatriceAddingSubtracting;
public class MatriceAddingSubtracting {
    public static void main(String[] args) {
        int [][] num1 = new int[3][3];
        int [][] num2 = new int[3][3];
        int rand = 0;

        for (int i = 0; i < num1.length; i++) {
            for (int j = 0; j < num1[0].length; j++) {
                rand = (int)(Math.random()*10)+1;
                num1[i][j] = rand;
            }
        }
        for (int i = 0; i < num2.length; i++) {
            for (int j = 0; j < num2[0].length; j++) {
                rand = (int)(Math.random()*10)+1;
                num2[i][j] = rand;
            }
        }

        System.out.println("List 1");
        for(int[] x : num1){
            for (int y : x){
                System.out.print(y+ ", ");
            }
            System.out.println();
        }
        System.out.println("\nList 2");
        for(int[] x : num2){
            for (int y : x){
                System.out.print(y+ ", ");
            }
            System.out.println();
        }

        int[][] total1 = addMatrix(num1, num2);
        System.out.println("\nTotal Combined");
        for(int[] x : total1){
            for (int y : x){
                System.out.print(y+ ", ");
            }
            System.out.println();
        }

        int[][] total2 = subMatrix(num1, num2);
        System.out.println("\nTotal Subtracted");
        for(int[] x : total2){
            for (int y : x){
                System.out.print(y+ ", ");
            }
            System.out.println();
        }
    }
    public static int [][] addMatrix(int[][] a, int[][] b){
        int[][] total = new int[0][];
        if (a.length == b.length){
            if (a[0].length == b[0].length){
                total = new int[a.length][a[0].length];
                for (int i = 0; i < total.length; i++) {
                    for (int j = 0; j < total[0].length; j++) {
                        total[i][j] = (a[i][j])+(b[i][j]);
                    }
                }
            }
            return total;
        } else {
            return null;
        }
    }
    public static int [][] subMatrix(int[][] a, int[][] b){
        int[][] total = new int[0][];
        if (a.length == b.length){
            if (a[0].length == b[0].length){
                total = new int[a.length][a[0].length];
                for (int i = 0; i < total.length; i++) {
                    for (int j = 0; j < total[0].length; j++) {
                        total[i][j] = (a[i][j])-(b[i][j]);
                    }
                }
            }
            return total;
        } else {
            return null;
        }
    }
}
