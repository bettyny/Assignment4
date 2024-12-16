/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assignment4;
import java.util.Scanner;


/**
 *
 * @author betty
 * Assignment 4
 * 11/17/2024
 */
public class Assignment4 {
    
    
    static void question1(){
        int [][] survey = new int [5][10];
        int [] total = new int [5];
        String [] socialIssue = {"political", "global", "environmental", "economic", "religious" };
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int avg;
        
        //loop needed to print out issues to be rated to the console
        for(int a = 0; a <= 4; a++){
            System.out.println("These are the issues to be rated. Each issue has to be rated in the order given: "
                    + socialIssue[a]);
        }
        
        int i; //int needed for loop to populate the array
        //need variable for output right?
        // first loop populates rows. so first loop has to run 5 times
        // second loop populates columns. runs 10 times
        
        for (i = 0; i<= 4; i++){
            System.out.println("Thoughs on issues in order given: ");
            for (int j = 0; j<=9; j++)
                survey[i][j] = input.nextInt();
        }
        
        // print the populated array to the console in a tabulated format
        
        for (int b = 0; b <= 4; b++){
            //System.out.print(socialIssue[b] + " ");
            
            for(int c = 0; c <= 9; c++){
                System.out.print(survey[b][c] + " ");
                sum = survey[b][c] +sum;
            }
            total [b] = sum;
            avg = sum/10;
            System.out.print (" " + avg);
            System.out.println();
        }
        //System.out.print (" " + avg);
        // loop to find the lowest total and print it out with the social issue that it corresponds to
        int index = 0;
        int smallest = total[0];
        for(int f = 0; f <= 4; f++){
            if (smallest > total[f]){
                smallest = total[f];
                index = f;
            }
        }
        //finding out the issue that recieved the lowest rating
        // two loops to go through the 2 dimentsional array
        // the index for the row will be collected at the end
        int tots = 0;
        int small = survey[0][0];
        for (int o = 0; o<= 4; o++){
            for( int k = 0; k <= 9; k++){
                if(small > survey[o][k]){
                    small = survey[o][k];
                }
            }
            tots = o;
        }
        
        System.out.println("The issue that received the lowest rating is: " + socialIssue[tots] + " "+ small);
        
        // the issue that received the lowest point total
        System.out.println("issue that received the lowest total point is: "  + socialIssue[index] + " " + smallest);
        
       
        
    }
    
    static void question2(){
        // parameters passed into the void method to do the counter
        Coin tossing = new Coin();
        System.out.println(tossing.getSide());
        //loop to toss coin class and count
        int i;
        
        for(i = 0; i<20; i++){
            //toss the coun 20 times. only display when heads
            tossing.toss();
        }
    }
    static void question3(){
        Patient myPatient = new Patient();
        String firstName = "Adam";
        String lastName = "Snyder";
        String middleName = " ";
        String streetName = "Church St";
        String cityName = "Lanswone";
        String state = "PA";
        int zipCode = 19050;
        int address = 10;
        String emergFirst = "Nancy";
        String emergLast = "Georges";
        // change phone number to string not int or long
        String phoneNum;
        phoneNum = "3333333333l";
        String emergPhone = "4444444444l";
        
        
        double cost1 = 450.00;
        double cost2 = 775.00;
        double cost3 = 600.00;
        
        double total = cost1+cost2+cost3;
        
        Procedure myProcedure = new Procedure();
        Procedure myProcedure2 = new Procedure();
        Procedure myProcedure3 = new Procedure();
     
        //populating patient information
        myPatient.setName(firstName, middleName, lastName);
        myPatient.setaddress(address, streetName, cityName, state, zipCode );
        myPatient.setPhoneNum(phoneNum);
        myPatient.setEmergencyName(emergFirst, emergLast);
        myPatient.setEmergencyPhone(emergPhone);
        
        //procedure information
        myProcedure.setProcedureName("Physical Exam");
        myProcedure.setDateOfProcedure(0);
        myProcedure.setPractioner("Dr Smith");
        myProcedure.setCost(cost1);
        
        
        //procedure2
        myProcedure2.setProcedureName("Xray");
        myProcedure2.setDateOfProcedure(11162024l);
        myProcedure.setPractioner("Dr Mahindra");
        myProcedure.setCost(cost2);
        
        //procedure3
        myProcedure3.setProcedureName("Blood Test");
        myProcedure3.setDateOfProcedure(11162024l);
        myProcedure3.setPractioner("Dr. Erica");
        myProcedure3.setCost(cost3);
        
        //Setters has been completed. Getters now
        
        System.out.println(myPatient.getFirstName()+ " " + myPatient.getLastName() + " " + myPatient.getMiddleName());
        System.out.println(myPatient.getAddressNum() + " "+ myPatient.getStreetName() + " " +
                myPatient.getCityName() + " " + myPatient.getStateName() + " " + myPatient.getZipCode());
        System.out.println(myPatient.getPhoneNum());
        System.out.println(myPatient.getEmergencyFirstName() + " " + myPatient.getEmergencyLastName() + "\n" + 
                myPatient.getEmergencyPhoneNum());
        System.out.println();
        
        System.out.println("Procedure #1");
        System.out.println("Procedure Name: " + myProcedure.getProcedureName() + "\n" +
                "Date: " + myProcedure.getDateOfProcedure() + "\n" +
                "Practioner: " + myProcedure.getPractioner() + "\n" +
                "Charges: " + myProcedure.getCost());
        System.out.println();
        
        System.out.println("Procedure #2");
        System.out.println("Procedure Name: " + myProcedure2.getProcedureName() + "\n" +
                "Date: " + myProcedure2.getDateOfProcedure() + "\n" +
                "Practioner: " + myProcedure2.getPractioner() + "\n" +
                "Charges: " + myProcedure2.getCost());
        System.out.println();
        
        System.out.println("Procedure #3");
        System.out.println("Procedure Name: " + myProcedure3.getProcedureName() + "\n" +
                "Date: " + myProcedure3.getDateOfProcedure() + "\n" +
                "Practioner: " + myProcedure3.getPractioner() + "\n" +
                "Charges: " + myProcedure3.getCost());
        System.out.println();
        
        System.out.println("Total charges are: $" + total);
    }
    
    static void question4(){
        double [][] parking = new double [3][3];
        int i;
        int b;
        double cost = 2.00;
        Scanner input = new Scanner(System.in);
        for(i = 0; i<3; i++){
            for(int c = 0; c<1; c++){
            System.out.println("\n Car number: ");
            parking[i][c] = input.nextDouble();
            //System.out.print(parking[i][c]);
            }
            System.out.println("\n How many hours were you parked: ");
            for(b = 1; b<2; b++){
                parking[i][b] = input.nextDouble();
                //System.out.print(" " + parking[i][b]);
                //math
                if (parking[i][b] <= 3.0){
                    parking[i][b+1] = cost;
                    //System.out.print(" " + parking[i][b+1]);
                }
                else if (parking[i][b] >= 24.00){
                    parking[i][b+1] = 10.00;
                    //System.out.print(" " + parking[i][b+1]);
                }
                else{
                    for(int a = 3; a<parking[i][b]; a++){
                        cost = cost + 0.50;
                    }
                    parking[i][b+1] = cost;
                }
                
            }
        }
        for(int a = 0; a<3; a++){
            for(int c= 0; c<3; c++){
                System.out.print(parking[a][c] + " ");
            }
            System.out.println();
        }
        
        double totHours = 0;
        double totCharge = 0;
        for(int c = 1; c<2; c++){
            for(int a = 0; a<3; a++){
               totHours = totHours + parking[a][c]; 
            }
        }
        for(int c = 2; c< 3; c++){
            for (int a = 0; a<3; a++){
                totCharge = totCharge + parking[a][c];
            }
        }
        System.out.println("TOTAL: "+ totHours + " " + totCharge);
    }
      

    

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        question1(); 
        question2(); 
       
        question3(); 
        question4();
    }
}
