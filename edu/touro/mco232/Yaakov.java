
package edu.touro.mco232;

public class Yaakov extends Person implements GitCamper{

    public Yaakov() {
        printGithubUsername();
        expressAttitudeTowardSout();        
    }
    
    @Override
    public void printGithubUsername() {
        System.out.println("ybrecher");
    }
    
    @Override
    public void expressAttitudeTowardSout() {
        System.out.println("Sout is neat");
    }
}