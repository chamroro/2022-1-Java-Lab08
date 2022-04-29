package edu.handong.csee.java.hw2.math;

/** 
 * Class that contains various math functions
 * 
 * @author  Haeun Kim
 */ 

public class MathCalculator{
    private String name;


    
    /** 
     * name setter method
     */
    public void setName(String name){
        this.name=name;
    }

    
    /** 
     * name getter method
     */
    public String getName(){
        return name;
    }
    
    /** 
     * 
     * Method to return the maximum value
     */
    public int getMax(int n1, int n2){
        if(n1>n2) return n1;
        else return n2;
    }

    
    /** 
     * Method to return the minimum value
     */
    public int getMin(int n1, int n2){
        if(n1<n2) return n1;
        else return n2;
    }

    
    /** 
     * Method to return absolute value
     */
    public int getAbs(int m){
        if(m>0) return m;
        else return -m;
    }
    
    /** 
     * Method for calculating addition
     */
    public int getSum(int n1, int n2){
        return n1+n2;
    }
    
    /** 
     * Method for calculating difference between two integers
     */
    public int getDiff(int n1, int n2){
        return n1-n2;
    }
    
    /** 
     * Method for calculating multiplication
     */
    public int getProduct(int n1, int n2){
        return n1*n2;
    }
    
    /** 
     * Method for calculating Quotient
     */
    public int getQuotient(int n1, int n2){
        return n1/n2;
        // else return n2/n1;
    }
    
    /** 
     * * Method for calculating Remainder
     */
    public int getRemainder(int n1, int n2){
        
        return n1 % n2;
        // else return n2%n1;
    }
    
    /** 
     * Method for calculating Power
     */
    public int getPower(int n1, int n2){
        int pow=1;
        for(int i=0;i<n2;i++){
            pow*=n1;
        }
        return pow;
    }
    
    /** 
     * Method for calculating Factorial
     */
    public int getFactorial(int m){
        if (m==1 || m==0) return 1;
        return getFactorial(m-1)*m;
    }
    
    /** 
     * Method for calculating the greatest common denominator
     */
    public int getGcd(int n1, int n2){ //최대공약수
        if (n1 % n2 == 0) {
            return n2;
        }
        return getGcd(n2, n1%n2);
    }
    
    /** 
     * Method for calculating the least common multiple
     */

    public int getLcm(int n1, int n2){ //최소공배수
        return (n1 / getGcd(n1, n2)) * n2;
    }
    
    /** 
     * Method for calculating squares
     */

    public int getSquare(int m){
        return getPower(m, 2);
    }
}