package dz11;

public class dz11_1 extends employee{

    public dz11_1(String FullName, String Position, String Email, String Phone, String Salary, int age) {
        super(FullName, Position, Email, Phone, Salary, age);
    }

    public static void main(String[] args) {
        employee[] abc = new employee[5];
        abc[0] = new employee(
                "John Smith",
                "director",
                "johnsmith@gmail.com",
                "+1234567890",
                "10000$",
                51);
        abc[1] = new employee(
                "Ivan Kovalenko",
                "SMM",
                "ivankovalenko@gmail.com",
                "+2345678910",
                "5000$",
                43);
        abc[2] = new employee(
                "Jan Kowalski",
                "Programmer",
                "jankowalski@gmail.com",
                "+2344578910",
                "5000$",
                31);
        abc[3] = new employee(
                "Joann Schmidt",
                "Programmer",
                "joannschmied@gmail.com",
                "+2343778910",
                "5000$",
                28);
        abc[4] = new employee(
                "Ivan Kuznetsov",
                "Cleaner",
                "ivankuznetsov@gmail.com",
                "+2124578910",
                "100 rubles + 1kg of sugar",
                41);

        for (int i = 0; i < 5; i++) {
            if (abc[i].age > 40) {
                getFullInfo(abc[i]);
            }

        }
    }
}



