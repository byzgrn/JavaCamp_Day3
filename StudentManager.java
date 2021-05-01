public class StudentManager extends UserManager{

    private String  newCreditCart;

    public String getNewCreditCart() {
        return newCreditCart;
    }

    public void setNewCreditCart(String newCreditCart) {
        this.newCreditCart = newCreditCart;
    }

    public void addCreditCart(Student student){
        String[] creditCartList={getNewCreditCart(),student.getCreditCart()};
        System.out.println(student.getFullName()+"'s credit carts: ");
        for (String c:creditCartList) {
            System.out.println(c);
        }
    }


}
