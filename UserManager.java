public class UserManager {
    private String newPassword;

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public void changePassword(User user){
        System.out.println(user.getFullName()+"'s password has changed from "+user.getPassword()+" to "+getNewPassword());
        user.setPassword(getNewPassword());
    }

}
