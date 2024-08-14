package MultipleChoiceGrading;
public class MultipleChoiceGrading {
    public static void main(String[] args) {
        String[][] students = new String[8][10];
        String[] key = {"D","B","D","C","C","D","A","E","A","D"};
        int count = 0;
        int count1 = 0;

        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students[0].length; j++) {
                students[i][j] = getRandLetter();
            }
        }

        for (String[] student : students) {
            for (int j = 0; j < students[0].length; j++) {
                count = 0;
                if (key[j].equals(student[j])) {
                    count++;
                }
            }
            System.out.println("Student " + (++count1) + " got " + count + " out of 10 correct.");
        }
    }

    public static String getRandLetter(){
        int rand = (int)(Math.random()*5)+1;
        if(rand == 1){
            return "A";
        } else if (rand == 2) {
            return "B";
        } else if (rand == 3) {
            return "C";
        } else if (rand == 4) {
            return "D";
        } else {
            return "E";
        }
    }
}
