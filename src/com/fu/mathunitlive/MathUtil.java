/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathunitlive;

/**
 *
 * @author ADMIN
 */
public class MathUtil {

    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid argument n must be bettwen 0 - 20");
        }
        
        if (n == 0 || n == 1) {
            return 1;
        }

        long product = 1;
        for (int i = 2; i <= n; i++) {
            product *= i;
        }

        return product;
    }
}
