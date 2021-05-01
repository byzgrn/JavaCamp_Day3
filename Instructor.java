public class Instructor extends User {
    private int salary;
    private String givenCourse;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getGivenCourse() {
        return givenCourse;
    }

    public void setGivenCourse(String givenCourse) {
        this.givenCourse = givenCourse;
    }
}
