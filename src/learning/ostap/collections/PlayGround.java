package learning.ostap.collections;

import java.util.*;

public class PlayGround {
    public static void main(String[] args) {
        int[] intArray = {2, 4, 3};
        // playWithArrayList(intArray);
        //  playWithLinkedList(intArray);
        // playWithSet(intArray);
        playWithMap(intArray);
    }

    private static void playWithMap(int[] intArray) {
        Map<Integer, String> integerStringMap = new HashMap<>();
        integerStringMap.put(2, "February");
        integerStringMap.put(4, "April");
        integerStringMap.put(3, "March");
        integerStringMap.put(1, "January");
        System.out.println(integerStringMap);
        for (int i : intArray) {
            System.out.println(integerStringMap.get(i).toUpperCase());
        }
        if (integerStringMap.containsKey(6)) {
            System.out.println(integerStringMap.get(6).toUpperCase());

        }
        integerStringMap.put(4,"Koza");
        System.out.println(integerStringMap );
    }

    private static void playWithSet(int[] intArray) {
        HashSet<Integer> integers = new HashSet<>();
        for (int i : intArray) {
            integers.add(i);
            System.out.println(integers);
        }
        integers.add(4);
        System.out.println(integers);
        System.out.println(integers.contains(3)); // constant time (very fast)
    }

    private static void playWithLinkedList(int[] intArray) {
        LinkedList<Integer> integers = new LinkedList<>();
        for (int i : intArray) {
            integers.add(i);
            System.out.println(integers);
        }
        integers.addFirst(6);
        System.out.println(integers);
        System.out.println(integers.getLast());
        System.out.println(integers.pop());
        System.out.println(integers);
        System.out.println(integers.poll());
        System.out.println(integers);

    }

    private static void playWithArrayList(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
        for (int i : intArray) {
            System.out.println(i);
        }

        List<Integer> integerArrayList = new ArrayList<>(3);
        for (int i : intArray) {
            integerArrayList.add(i);
            //      System.out.println(integerArrayList);
        }
        System.out.println(integerArrayList);
        System.out.println(integerArrayList.contains(2)); //linear time, depends on the size of array
        System.out.println(integerArrayList.indexOf(4));
        integerArrayList.add(4);
        System.out.println(integerArrayList);
        System.out.println(integerArrayList.indexOf(4));
    }
}
