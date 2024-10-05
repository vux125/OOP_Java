/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Vu
 */

public class J07021 {
    public static String formatName(String name){
        name = name.toLowerCase();
        String[] words = name.trim().split("\\s+");
        
        StringBuilder formated = new StringBuilder();
        for(String word:words){
            formated.append(Character.toUpperCase(word.charAt(0)))
                    .append(word.substring(1))
                    .append(" ");
        }
        return formated.toString().trim();
    }
}
