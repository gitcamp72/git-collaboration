package edu.touro.mco232;

public class Person {

    private String firstName, lastName;
    private Date birthday;

    public Person() {
    }
    
    public Person(String lastName, String firstName) {
        setLastName(lastName);
        setFirstName(firstName);
    }

    public Person(String firstName, String lastName, Date birthday) {
        this(firstName, lastName);
        setBirthday(birthday);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthday(Date birthday) {
        this.birthday = new Date(birthday);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getBirthday() {
        return new Date(birthday);
    }
    
    public void talk() {
        System.out.print("I am a");
    }

}
