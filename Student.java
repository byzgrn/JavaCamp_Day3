public class Student extends User {
    private String takenCourse;
    private String creditCart;

    public String getTakenCourse() {
        return takenCourse;
    }

    public void setTakenCourse(String takenCourse) {
        this.takenCourse = takenCourse;
    }

    public String getCreditCart() {
        return creditCart;
    }

    public void setCreditCart(String creditCart) {
        this.creditCart = creditCart;
    }
}
