package JavaMethods.level3;

import java.util.Arrays;

public class RandomHeights {


    public static int[] generateHeights(int size) {
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = 150 + (int)(Math.random() * 101); // 150 to 250 inclusive
        }
        return heights;
    }


    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int h : arr) {
            sum += h;
        }
        return sum;
    }


    public static double calculateMean(int[] arr) {
        int sum = calculateSum(arr);
        return (double) sum / arr.length;
    }


    public static int findShortest(int[] arr) {
        int min = arr[0];
        for (int h : arr) {
            min = Math.min(min, h);
        }
        return min;
    }


    public static int findTallest(int[] arr) {
        int max = arr[0];
        for (int h : arr) {
            max = Math.max(max, h);
        }
        return max;
    }

    public static void main(String[] args) {

        int[] heights = generateHeights(11);

        System.out.println("Heights of football players (in cm): " + Arrays.toString(heights));

        int sum = calculateSum(heights);
        double mean = calculateMean(heights);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        System.out.println("Sum of heights: " + sum + " cm");
        System.out.println("Mean height: " + mean + " cm");
        System.out.println("Shortest player height: " + shortest + " cm");
        System.out.println("Tallest player height: " + tallest + " cm");
    }
}

