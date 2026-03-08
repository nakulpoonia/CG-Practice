package M1PracticeQuestion;

import java.util.*;

public class DistanceSum {

    public static void main(String[] args) {

        int x1 = 1, y1 = 1;
        int x2 = 2, y2 = 4;
        int x3 = 3, y3 = 6;

        double d1 = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
        double d2 = Math.sqrt(Math.pow(x3-x2,2) + Math.pow(y3-y2,2));
        double d3 = Math.sqrt(Math.pow(x3-x1,2) + Math.pow(y3-y1,2));

        double sum = d1 + d2 + d3;

        System.out.println(sum);
    }
}
