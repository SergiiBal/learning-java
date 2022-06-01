package codewars;

public class Maskify {
    public static String maskify(String str) {
        char[] ch = str.toCharArray();
        for (int j = 0; j < str.length() - 4; j++) {
            ch[j] = '#';
        }
        return String.valueOf(ch);
    }

    public static void main(String[] args) {
      String p = maskify("hghgt");
        System.out.println(p);
    }
}