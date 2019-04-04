package edu.touro.mco232;

public class Yakov extends Person implements GitCamper {
    public Yakov() {
        printGithubUsername();
        expressAttitudeTowardSout();
    }

    @Override
    public void printGithubUsername() {
        System.out.println("Yakovepstein");
    }

    @Override
    public void expressAttitudeTowardSout() {
        System.out.println("Sout is sauerkraut");
    }
}


