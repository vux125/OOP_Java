/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Vu
 */
public class J07029 {
    public static boolean isPrime(Integer num){
        if(num < 2)return false;
        else{
            for(int i = 2; i <= Math.sqrt(num); i++){
                if(num % i  == 0)return false;
            }
            return true;
        }
    }
}
