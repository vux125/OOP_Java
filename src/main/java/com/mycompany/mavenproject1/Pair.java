/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Vu
 */
import java.util.*;
import java.text.*;

public class Pair<K, V> {
   private K so1;
   private V so2;
   public Pair(K so1, V so2){
       this.so1 = so1;
       this.so2 = so2;
   }
  
   public static boolean prime(Integer x){
        if(x<2) return false;
        if(x==2) return true;
        if(x%2==0) return false;
        Integer can = (int)Math.sqrt(x.doubleValue());
        for(Integer i=3; i<=can; i+=2){
            if(x%i==0) return false;
        }
        return true;
    }
   
   public boolean isPrime(){
       return prime((Integer)this.so1) && prime((Integer)this.so2); 
   }
   
   @Override
   public String toString(){
       return this.so1+" "+this.so2;
   }
}
