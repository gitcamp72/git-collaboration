package edu.touro.mco232;

public class Shalom extends Person implements GitCamper{

    public Shalom() {
        printGithubUsername();
        expressAttitudeTowardSout();
    }

    @Override
    public void printGithubUsername() {
        System.out.println("thesabermaniac");
    }

    @Override
    public void expressAttitudeTowardSout() {
        System.out.println("Who is sout?");
    }
}
