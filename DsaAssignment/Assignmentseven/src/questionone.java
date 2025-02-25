import java.util.Arrays;
import java.util.HashMap;

public class questionone{
    public static void main(String[] args) {

     String s = "egg";
     String t = "add";

     boolean ans  = isIsomorphic(s, t);
     System.out.println(ans);
    }
    public static boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character,Character> map = new HashMap<>();
        for(int i=0;i<s.length();i++) 
        {
            // if contains key but with different value
            if(map.containsKey(s.charAt(i))) {
                if(!map.get(s.charAt(i)).equals(t.charAt(i))) {
                    return false;
                }
            }else{
                // contains value with different key
                if(map.containsValue(t.charAt(i))) {
                    return false;
                }
                map.put(s.charAt(i),t.charAt(i));
            }
        }
        return true;
    }
}
