import java.util.Arrays;

class Questionsix {
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) {
            return 0;
        }

        Arrays.sort(points, (a, b) -> a[1] - b[1]);

        int end = points[0][1];
        int arrows = 1;

        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > end) {
                end = points[i][1];
                arrows++;
            } else {
                end = Math.min(end, points[i][1]);
            }
        }

        return arrows;
    }
     public static void main(String[] args) {
        int[][] points = {{10, 16}, {2, 8}, {1, 6}, {7, 12}};

        Questionsix solution = new Questionsix();
        int minArrows = solution.findMinArrowShots(points);

        System.out.println("Minimum number of arrows: " + minArrows);
    }

}

   
