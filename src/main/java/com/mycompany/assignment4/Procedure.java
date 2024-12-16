/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment4;

/**
 *
 * @author betty
 */
public class Procedure {
    private String procedureName;
    private long dateOfProcedure;
    private String practionerName;
    private double cost;
    public Procedure(){
        
    }
    
    public String getProcedureName(){
        return this.procedureName;
    }
    public long getDateOfProcedure(){
        return this.dateOfProcedure;
    }
    public String getPractioner(){
        return this.practionerName;
    }
    public double getCost(){
        return this.cost;
    }
    
    //setters
    public void setProcedureName(String procedurename){
        this.procedureName = procedurename;
    }
    public void setDateOfProcedure(long dateofprocedure){
        this.dateOfProcedure = dateofprocedure;
    }
    public void setPractioner(String practioner){
        this.practionerName = practioner;
    }
    public void setCost(double charges){
        this.cost = charges;
    }
    
}
