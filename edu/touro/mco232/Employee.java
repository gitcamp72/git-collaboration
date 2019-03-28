package edu.touro.mco232;

public class Employee extends Person {

    private double annualSalary;
    private String jobTitle;

    public Employee() {
    }

    public Employee(String lastName, String firstName, Date birthday,
            double annualSalary, String jobTitle) {
        super(lastName, firstName, birthday);
        setAnnualSalary(annualSalary);
        setJobTitle(jobTitle);
    }

    public Employee(String firstName, String lastName, double annualSalary) {
        super(firstName, lastName);
        setAnnualSalary(annualSalary);
    }

    public Employee(String firstName, String lastName, Date birthday) {
        super(firstName, lastName);
        setBirthday(birthday);
    }

    public void setAnnualSalary(double annualSalary) {
        if (annualSalary < 0) {
            throw new RuntimeException(String.format("Annual salary cannot be "
                    + "a negative number. It was [%f].", annualSalary));
        }
        this.annualSalary = annualSalary;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    @Override
    public void talk() {
        super.talk();
        System.out.println("n employee");
    }

    @Override
    public String toString() {
        return super.toString()
                + String.format(", annualSalary = [%.2f], jobTitle = [%s]",
                        annualSalary, jobTitle);
    }
}
