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



    /*public void changeSalary(Instructor instructor){
        instructor.setSalary(1500);
        int newSalary=7000;
        System.out.println("Salary has change from "+instructor.getSalary()+" to "+newSalary);
        instructor.setSalary(newSalary);
    }*/
}
