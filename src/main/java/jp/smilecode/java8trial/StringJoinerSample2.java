/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jp.smilecode.java8trial;

import java.util.Arrays;
import java.util.StringJoiner;

public class StringJoinerSample2 {

    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner("/");
        Arrays.asList("a", "b", "c", "d").stream()
                .forEach(str->joiner.add(str));
        System.out.println(joiner.toString());
    }
}
