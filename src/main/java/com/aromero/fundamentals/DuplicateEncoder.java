package com.aromero.fundamentals;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DuplicateEncoder {

    /*
    The goal of this exercise is to convert a string to a new string where each character
    in the new string is '(' if that character appears only once in the original string, or ')'
    if that character appears more than once in the original string. Ignore capitalization when
    determining if a character is a duplicate.

    Examples:

    "din" => "((("

    "recede" => "()()()"

    "Success" => ")())())"

    "(( @" => "))(("
     */

    public static void main(String[] args) {
        encode("Prespecialized");
    }

    static String encode(String word){
        word = word.toLowerCase();
        char [] charArray = word.toCharArray();
        String result = "";
        for (int i = 0; i < charArray.length; i++) {
            if ( appearsOnlyOnce(charArray, charArray[i])){
                result += "(";
            } else {
                result += ")";
            }
        }
        return result;
    }

    static boolean appearsOnlyOnce(char[] charArray, char c) {
        boolean flag = true;
        int i = 0;
        for (int j = 0 ; j < charArray.length; j++) {
            if (charArray[j] == c) {
                i++;
                if (i >= 2) {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }
}
