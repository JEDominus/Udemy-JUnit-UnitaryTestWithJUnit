package org.udemy.junit.utility;

public class UtilitiesParameterized {

    public String concatStrings(String a, String b, String c){
        if(a != null && b != null && c != null){
            return a+", "+b+", "+c+".";
        }
        return null;
    }

    public int numbersAddition(int a, int b){
        return a + b;
    }

}