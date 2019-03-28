package edu.touro.mco232;

public class Clown extends Person {

    boolean hasRedNose;

    public Clown() {
    }

    public Clown(String lastName, String firstName, boolean hasRedNose) {
        super(lastName, firstName);
        this.hasRedNose = hasRedNose;
    }

    @Override
    public void talk() {
        super.talk();
        System.out.println(" clown");
    }

}
