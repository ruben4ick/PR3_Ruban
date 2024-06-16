package com.calculator;

import org.apache.commons.math3.stat.StatUtils;
import org.apache.commons.math3.util.CombinatoricsUtils;
import org.apache.commons.math3.util.Precision;

public class MathUtils {
    public static double mean(double[] values) {
        return StatUtils.mean(values);
    }

    public static long factorial(int n) {
        return CombinatoricsUtils.factorial(n);
    }

    public static boolean nearlyEqual(double a, double b, double epsilon) {
        return Precision.equals(a, b, epsilon);
    }
}
