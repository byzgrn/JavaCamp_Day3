public class Main {
    public static void main(String[] args){
        Instructor instructor1=new Instructor();
        Student student1=new Student();
        InstructorManager instructorManager=new InstructorManager();
        StudentManager studentManager=new StudentManager();

        instructor1.setFullName("Engin Demirog");
        instructor1.setSalary(5000);
        instructor1.setGivenCourse(instructor1.getCourse1());
        instructor1.setMail("***@mail.com");
        instructor1.setPassword("12345");

        student1.setTakenCourse(student1.getCourse2());
        student1.setFullName("Beyza Nur Gören");
        student1.setMail("xxx@mail.com");
        student1.setPassword("23456");
        student1.setCreditCart("X Cart");

        instructorManager.setNewSalary(7000);
        instructorManager.setNewPassword("abcde");
        instructorManager.changeSalary(instructor1);
        instructorManager.changePassword(instructor1);

        studentManager.setNewPassword("bcdef");
        studentManager.setNewCreditCart("Y Cart");
        studentManager.addCreditCart(student1);
        studentManager.changePassword(student1);
    }
}
