package GPSDistance;

public class GPSDistance {
    public static void main(String[] args) {
        int[][] cord = new int[8][2];
        int pt1 = 0, pt2 = 0;

        for (int i = 0; i < cord.length; i++) {
            for (int j = 0; j < cord[0].length; j++) {
                cord[i][j] = (int) (Math.random() * 21) - 10;
            }
        }

        double dist = getDist(cord[1][0], cord[0][0], cord[0][1], cord[0][0]);
        for (int i = 0; i < cord.length - 1; i++) {
            for (int j = i + 1; j < cord.length; j++) {
                double dist2 = getDist(cord[j][0], cord[i][0], cord[j][1], cord[i][1]);
                if (dist2 < dist) {
                    dist = dist2;
                    pt1 = i;
                    pt2 = j;
                }
            }
        }

        System.out.println("The closest two point are (" + cord[pt2][0] + "," + cord[pt2][1]
                + ") and (" + cord[pt1][0] + "," + cord[pt1][1] + ")");
    }

    public static double getDist(int x1, int x2, int y1, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
