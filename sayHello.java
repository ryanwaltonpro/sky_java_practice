import java.sql.SQLOutput;

public class sayHello {
    public static void main(String[] args)
    {
        Employee employee = new Employee("Ryan");
        int x = 100;
        int y = 5;
        int z = -30;
        int mathResult = x * y * z;
        System.out.println(mathResult);

        String street = "1600 Pennsylvania";
        String city = "Washington";
        String state = "DC";
        int zip = 20500;
        String whitehousAddress = street + ", " + city + ", " + state + ", " + zip;
        System.out.println(whitehousAddress);


    }

}
