package edu.touro.mco232;

public class Nechemia extends Person implements GitCamper{

    public Nechemia() {
        expressAttitudeTowardSout();
        printGithubUsername();
    }
    
    @Override
    public void expressAttitudeTowardSout() {
        System.out.println("Sout is pretty dope");
    }

    @Override
    public void printGithubUsername() {
        System.out.println("nechemiaseif");
    }
    
}
