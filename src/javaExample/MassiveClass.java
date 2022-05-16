package javaExample;

import java.util.ArrayList;
import java.util.stream.Stream;

public class MassiveClass {
    public static void main(String[] args) {
        int[] nums;
        nums = new int[7];
        nums[0] = 1;
        nums[1] = 6;
        nums[2] = 7;
        nums[3] = 2;
        nums[4] = 3;
        nums[5] = 88;
        nums[6] = 34;
        System.out.println(nums);

        for (int num : nums) {
            System.out.print(num + ",");
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ",");
        }


        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(6);
        list.add(7);
        list.add(2);
        list.add(3);
        list.add(88);
        list.add(32);
        System.out.println(list);
    }

}



