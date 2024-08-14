package BeforeTheFour;
public class BeforeTheFour {
    public static void main(String []args){
        int[] nums = new int[25];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int)(Math.random()*50)+1;
        }
        int index = 0;
        boolean flag = true;
        for (int j = 0; j < nums.length; j++) {
            if(nums[j]==4) {
                if (flag) {
                    index = j;
                    flag = false;
                }
            }
        }
        int[] newNums = new int[index];
        for (int k = 0; k < index; k++){
            newNums[k] = nums[k];
        }
        if(newNums.length > 0){
            for (int i = 0; i < newNums.length; i++) {
                System.out.print(nums[i]+ ", ");
            }
        }else{
            System.out.println("error");
        }
    }
}
