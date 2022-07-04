package codewars;

public class RemoveSpaces {

    public static String noSpace(final String x) {
//           System.out.println(x);
//        return x.trim();
  //      System.out.println(x.substring(indexOf("")));
        System.out.println(x.strip());
return x.replace(" ", "");
    }

    public static void main(String[] args) {
        String result = noSpace("    gfgd dfg  gfdg fd fd fdgf   ");
        System.out.println(result);
    }
}
