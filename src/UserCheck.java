
public class UserCheck {

    public static void Check () {

        User anastasiia = new User();
        anastasiia.username = "Anastasiia";
        anastasiia.email = "aha@gmail.com";
        anastasiia.isActive = true;
        anastasiia.setAge(8);
        anastasiia.setPassword("pas+swo_r?d321");
        anastasiia.amountSpentMoney = 1000;

        anastasiia.makePurchase(500);
        anastasiia.PrintInfo();

        }

    }






