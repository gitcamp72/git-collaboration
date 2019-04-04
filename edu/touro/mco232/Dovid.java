package edu.touro.mco232;
    public class Dovid extends Person implements GitCamper{

        public Dovid() {
            printGithubUsername();
            expressAttitudeTowardSout();
        }

        @Override
        public void printGithubUsername() {
            System.out.println("homelessdave");
        }

        @Override
        public void expressAttitudeTowardSout() {
            System.out.println("Sout is da best");
        }
}
