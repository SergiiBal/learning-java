package codewars;

class YesOrNo
{
    public static String boolToWord(boolean b)  {
        if (b==false) {
            return "No";
        } else {
            return "Yes";
        }

    }

    public static void main(String[] args) {
       String b = boolToWord(false);
        System.out.println(b);
    }
}