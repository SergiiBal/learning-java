package codewars;

class Solution {
    public static String whoLikesIt(String[] names) {
        String[] inputNames = names;
        String resultString = "";
        String sum = "0";
        // String inputName = names;
        // char[] arrayLetter = new char[inputName.length()];
        if (inputNames.length == 0) {
            resultString = "no one likes this";
            System.out.println(resultString);
        } else if (inputNames.length == 1) {
            for (int i = 0; i < inputNames.length; i++) {
                resultString = (inputNames[0] + " likes this");

            }
            System.out.println(resultString);
        } else if (inputNames.length == 2) {
            for (int i = 0; i < inputNames.length; i++) {
                resultString = (inputNames[0] + " and " + inputNames[1] + " like this");
            }
            System.out.println(resultString);
        } else if (inputNames.length == 3) {
            for (int i = 0; i < inputNames.length; i++) {
                resultString = (inputNames[0] + ", " + inputNames[1] + " and " + inputNames[2] + " like this");
            }
            System.out.println(resultString);
        } else if (inputNames.length > 3) {
        for (int i = 0; i < inputNames.length; i++) {
            resultString = (inputNames[0] + ", " + inputNames[1] + " and " + (inputNames.length-2) + " others like this");
        }
        System.out.println(resultString);
    }
            return resultString;
        }


        public static void main (String[]args){

            String[] names = new String[]{"Alex", "Jacob", "Mark", "Max"};
            // String[] names = new String[]{};
             //String[] names = new String[]{"Alex"};
            //String[] names = new String[]{"Alex", "Jacob"};
            // String[] names = new String[]{"Alex", "Jacob", "Mark"};
            whoLikesIt(names);
        }
    }
// String[] words = new String[]{"C++", "Java", "C", "Python"};
//  int[] myIntArray = new int[3];
//   int[] myIntArray = {1, 2, 3};
//   int[] myIntArray = new int[]{1, 2, 3};