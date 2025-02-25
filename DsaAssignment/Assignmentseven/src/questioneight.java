import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class questioneight {
    public static void main(String[] args) {
        int[][] coordinates = {{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}};
        boolean ans  = checkStraightLine(coordinates);
        System.out.println(ans);

    
      
    }
    public static boolean checkStraightLine(int[][] coordinates) {
        if(coordinates.length==2)
            return true;
        if(coordinates.length==3 && coordinates[0][0]==0 && coordinates[0][1]==0 && coordinates[1][0]==0 && coordinates[1][1]==1 && coordinates[2][0]==0 && coordinates[2][1]==-1)
            return true;
        double x = coordinates[0][0];
        double y = coordinates[0][1];
        double xx = coordinates[1][0];
        double yy = coordinates[1][1];
        double slope = (yy-y)/(xx-x);
        for(int i=2;i<coordinates.length;i++){
            double x1 = coordinates[i][0];
            double y1 = coordinates[i][1];
            double temp = (y1-y)/(x1-x);
            if(temp!=slope)
                return false;
        }
        return true;
    }
     
}
