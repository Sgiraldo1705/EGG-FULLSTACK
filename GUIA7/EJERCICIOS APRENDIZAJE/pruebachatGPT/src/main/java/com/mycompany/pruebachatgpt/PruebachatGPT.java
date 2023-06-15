/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pruebachatgpt;
public class PruebachatGPT {
    
    private static final int[] NUMS = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static final String[] ROMANS = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public static String convertToRoman(int number) {
        if (number < 1 || number > 3999) {
            throw new IllegalArgumentException("Number must be between 1 and 3999.");
        }
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (number > 0) {
            if (number >= NUMS[i]) {
                result.append(ROMANS[i]);
                number -= NUMS[i];
            } else {
                i++;
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(convertToRoman(1)); // I
        System.out.println(convertToRoman(10)); // X
        System.out.println(convertToRoman(49)); // XLIX
        System.out.println(convertToRoman(3999)); // MMMCMXCIX
    }
}
