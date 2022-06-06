package codewars;

public class Maskify {
    public static String maskify(String str) {
        char[] ch = str.toCharArray();
        for (int j = 0; j < str.length() - 4; j++) {
            ch[j] = '#';
        }
        return String.valueOf(ch);
    }

     static String maskifyNew(String str) {
        if (str.length()<=4) {
            return str;
        } else {
            return "#".repeat(str.length()-4)
                    .concat(str.substring(str.length()-4));
        }
    }

    public static void main(String[] args) {
      String p = maskifyNew("12354356436546456");
        System.out.println(p);
    }
}