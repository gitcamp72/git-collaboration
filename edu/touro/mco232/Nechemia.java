package edu.touro.mco232;

public class Nechemia extends Person implements GitCamper{

    public Nechemia() {
        printGithubUsername();
        expressAttitudeTowardSout();        
    }
    
    @Override
    public void printGithubUsername() {
        System.out.println("nechemiaseif");
    }
    
    @Override
    public void expressAttitudeTowardSout() {
        System.out.println("Sout is pretty dope");
    }
}
