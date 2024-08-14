package SumOf2s;
public class SumOf2s {
    public static void main(String[] args) {
        int[] num = new int[50];
        for (int i = 0; i < num.length; i++) {
            num[i] = (int)(Math.random()*100)+1;
        }
        int total = 0;
        for (int j = 0; j < num.length; j++) {
            if(num[j]==2){
                total += num[j];
            }
        }
        boolean flag = false;
        if(total==8){
            flag = true;
        }
        System.out.println(flag);
    }
}
