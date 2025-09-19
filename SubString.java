import java.util.ArrayList;

public class SubString {
    
    public void doCode(String str) {
        ArrayList<Character> arr = new ArrayList<>();
        int n = (int)Math.pow(2, str.length());
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (arr.isEmpty()) {
                arr.add(ch);

            }
            arr.add(ch);

        }
        System.out.println(arr);
    }

    public static void main(String[] args) {
        SubString s = new SubString();
        String str = "JOY";
        s.doCode(str);
    }
}
