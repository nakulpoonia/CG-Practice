package StackQueueHashmap;

import java.util.HashSet;

class PairWithSum {

    static boolean hasPair(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();

        for (int x : arr) {
            int need = target - x;
            if (set.contains(need)) {
                return true;
            }
            set.add(x);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {8, 7, 2, 5, 3, 1};
        int target = 10;

        System.out.println(hasPair(arr, target));
    }
}

