/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment4;
import java.util.Random;
/**
 *
 * @author betty
 */
public class Coin {
    String sides;
    private int countHeads;
   private  int countTails;
    
     public Coin(){
        //random num generator has to be moved here and the if statement in sideup method needs to be 
        //moved here too
        Random random = new Random();
        int rand1 = random.nextInt(2);
        //String side;
        if (rand1 == 0){
            sides = "heads";
        }
        else{
            sides = "tails";
        }
        countTails =0;
        countHeads = 0;
    }
     
     public String getSide(){
         return this.sides;
     }
      public void toss(){
        //need to gather my thoughts on this first
        //this method tosses the coin to determine if heads and tails and populates the sideUp variable
        
        String sideUp;
        Random rand = new Random();
        int rand_int = rand.nextInt(2);
        if (rand_int == 0){
            sideUp = sideup(rand_int);
            countHeads++;
            System.out.println(sideUp);
            
            
        }
        else{
            sideUp = sideup(rand_int);
            countTails++;
            System.out.println(sideUp);
            
        }
        System.out.println("Number of heads: " + countHeads);
        System.out.println("Number of tails: " + countTails);
       //total(i, b);
      
}
      static String sideup(int randnum){
        String [] sideNeeded = {"heads", "tails"};
        return sideNeeded[randnum];
       
    }
      //do I need another method to be a counter?
      static int headCount(String side){
          int i = 0;
          String head = "heads";
          if(side.equals(head)){
              i = i+1;
          }
          return i;
      }
      static int tailsCount(String side){
          int i = 0;
          String head = "tails";
          if(side.equals(head)){
              i = i+1;
          }
          return i;
      }
      static void total(int a, int b){
          System.out.println(a);
          System.out.println(b);
      }
      
    
}
