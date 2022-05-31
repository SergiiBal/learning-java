package codewars;

public class Maskify {
    public static String maskify(String str) {
        int a = 0;
        char[] ch = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }
        char[] newCh = ch;
        for (int j = 0; j < str.length() - 4; j++) {
            newCh[j] = '#';
        }
//        for (int k=0; k< newCh.length; k++) {
//            System.out.print(newCh[k]);
//        }
        String newString = String.valueOf(newCh);
        return newString;
    }

    public static void main(String[] args) {
      String p = maskify("hghgt");
        System.out.println(p);
    }
}