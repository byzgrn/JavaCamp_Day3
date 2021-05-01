public class User {
    private String fullName;
    private String mail;
    private String password;

    private String course1="Java";
    private String course2="Python";
    private String course3="C#";
    private String[] courses={getCourse1(), getCourse2(), getCourse3()};


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String[] getCourses() {
        return courses;
    }

    public String getCourse1() {
        return course1;
    }

    public String getCourse2() {
        return course2;
    }

    public String getCourse3() {
        return course3;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
