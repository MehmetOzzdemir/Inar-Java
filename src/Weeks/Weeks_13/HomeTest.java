package Weeks.Weeks_13;

public class HomeTest {
    public static void main(String[] args) {
        Home house1 =new Home();
        house1.print();
        Home house2 = new Home(120,2,3,true,100000,2500,"South",2014);
        house2.print();
        house2.renovation();
        house2.print();
    }
}
