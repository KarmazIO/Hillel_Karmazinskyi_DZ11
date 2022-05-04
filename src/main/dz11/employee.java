package dz11;

public class employee {
    String FullName;
    String Position;
    String Email;
    String Phone;
    String Salary;
    int age;

    public employee(String FullName, String Position, String Email, String Phone, String Salary, int age) {
        this.FullName = FullName;
        this.Position = Position;
        this.Email = Email;
        this.Phone = Phone;
        this.Salary = Salary;
        this.age = age;
    }

    public static void getFullInfo(employee employee) {
        System.out.println("Full name: " + employee.FullName);
        System.out.println("Position: " + employee.Position);
        System.out.println("Email: " + employee.Email);
        System.out.println("Phone: " + employee.Phone);
        System.out.println("Salary: " + employee.Salary);
        System.out.println("Age: " + employee.age);
        System.out.println();
    }
}
