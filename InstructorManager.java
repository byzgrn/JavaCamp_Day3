public class InstructorManager extends UserManager{

    private int newSalary;

    public int getNewSalary() {
        return newSalary;
    }

    public void setNewSalary(int newSalary) {
        this.newSalary = newSalary;
    }

    public void changeSalary(Instructor instructor){
        System.out.println(instructor.getFullName()+"'s salary has changed from "+instructor.getSalary()+" to "+getNewSalary());
        instructor.setSalary(getNewSalary());
    }

}
