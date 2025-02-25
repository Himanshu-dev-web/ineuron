public class Questionthree {
    public static void main(String[] args) {
        int n = 5;
        int firstBadVersion = findFirstBadVersion(n);
        System.out.println("First bad version: " + firstBadVersion);
    }

    public static int findFirstBadVersion(int n) {
        int left = 1;
        int right = n;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    public static boolean isBadVersion(int version) {
         return version >= 4; 
    }
}
