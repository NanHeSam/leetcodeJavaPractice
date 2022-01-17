import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

class Solution076 {
    public static String minWindow(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c: t.toCharArray()) {
            if (!map.containsKey(c)) {
                map.put(c, 0);
            }
            map.put(c, map.get(c)+1);
        }

        int size = map.size();
        int len = Integer.MAX_VALUE;
        Map<Character, Integer> curCount = new HashMap<>();
        String result = "";
        for (int i = 0, j = 0; j < s.length(); j++) {
            char curChar = s.charAt(j);
            if (map.containsKey(curChar)) {

                curCount.put(curChar, curCount.getOrDefault(curChar, 0)+1);
                // IMPORTANT: if you are using Map<Character, Integer>, be careful as i run into issue Integer comparison is not equal even if the number is the same;
                // https://stackoverflow.com/questions/70747403/java-map-with-integer-value-comparison#70747403
                if ((int)curCount.get(curChar) == (int)map.get(curChar)) {
                    size--;
                }
            }

            while (size == 0) {
                if (len > j - i + 1) {
                    len = j - i + 1;
                    result = s.substring(i, j+1);
                }
                
                char charToRemove = s.charAt(i);
                
                if (map.containsKey(charToRemove)) {
                    curCount.put(charToRemove, curCount.get(charToRemove)-1);
                    if (curCount.get(charToRemove) == (map.get(charToRemove)-1)) {
                        size++;
                    }
                }
                i++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("./076.Minimum-Window-Substring/input.txt"))) {

            String s = br.readLine();
            String t = br.readLine();
            String sol = br.readLine();
            String result = minWindow(s, t);

            System.out.println(sol.equals(result));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
