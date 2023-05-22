
public class User {
    String username;
    private int age;
    String email;
    private String password;
    boolean isActive;
    double amountSpentMoney;

    public User () {
    }

    public User (String username) {
     this.username = username;
    }

    public User (String username, String password) {
        this.username = username;
        this.password = password;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age < 18 || age > 100){
            this.age = 18;
        } else {
            this.age = age;
        }
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
            this.password = password.replaceAll("[^\\w]", "");
    }

    public void printTotalAmountOfSpentMoney(double amountSpentMoney) {
        System.out.println("Money spent: " + amountSpentMoney);
    }

    public void makePurchase(double purchasePrice) {
        amountSpentMoney += purchasePrice;
    }

    public void PrintInfo () {
        System.out.println(this.username);
        System.out.println(this.age);
        System.out.println(this.email);
        System.out.println(this.password);
        System.out.println(isActive);
        System.out.println(this.amountSpentMoney);
    }

}
