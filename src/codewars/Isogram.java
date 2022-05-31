package codewars;


public class Isogram {
    public static boolean isIsogram(String str) {
        str = str.toLowerCase();
        boolean a = true;
        char[] ch = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }
        for (int j = 0; j < ch.length; j++) {

            for (int t = j + 1; t < ch.length; t++) {
                if (ch[j] == ch[t]) {
                    a = false;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        boolean d = isIsogram("moOse");
        if (d == false) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }
}
