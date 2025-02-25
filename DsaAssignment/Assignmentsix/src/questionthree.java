import java.util.Arrays;

public class questionthree {
    public static void main(String[] args) {
       int[] question = {2,1};
       boolean ans = validMountainArray(question);
       System.out.println(ans);
   
    }

    public static boolean validMountainArray(int[] arr) {
        if (arr.length < 3) return false;
        int idx = -1;
        for (int i = 1; i < arr.length; i++) {
            int prev = arr[i - 1], curr = arr[i];
            if (curr == prev) return false;
            if (prev > curr) {
                idx = i - 1;
                break;
            }
        }
        if (idx == -1 || idx == 0) return false;
        for (int i = idx + 1; i < arr.length; i++) {
            int prev = arr[i - 1], curr = arr[i];
            if (curr >= prev) return false;
        }
        return idx != -1;
    }
}

