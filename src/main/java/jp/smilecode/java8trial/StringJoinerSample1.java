/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jp.smilecode.java8trial;

import java.util.Objects;

public class StringJoinerSample1 {

    public static void main(String[] args) {
        String delimiter = "-";
        System.out.println(String.join(delimiter, "hello", "java", "8"));
    }
}
