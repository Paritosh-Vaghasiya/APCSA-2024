package OneVsFour;
public class OneVsFour {
    public static void main(String[] args) {
        int[] num = new int[100];
        for (int i = 0; i < 100; i++) {
            num[i] = (int)(Math.random()*35)+1;
        }
        int countOne = 0, countFour = 0;
        for (int j = 0; j < num.length; j++) {
            if(num[j]==1){
                countOne++;
            }
            if(num[j]==4){
                countFour++;
            }
        }
        boolean flag = false;
        if(countOne>countFour){
            flag = true;
        }
        System.out.println(flag);
    }
}
