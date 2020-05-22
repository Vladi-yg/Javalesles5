import javax.xml.namespace.QName;

public class Employee {
    // Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
   private String name;
   private String secondName;
   private String middleName;
   private String position;
   private String email;
   private String phoneNumber;
   private int payCheck;
   private int age;
    // Конструктор класса должен заполнять эти поля при создании объекта;

    public Employee (String name, String secondName,String middleName,String position,String email,String phoneNumber,int payCheck,int age) {
        this.name = name;
        this.secondName = secondName;
        this.middleName = middleName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.payCheck = payCheck;
        this.age = age;
    }

   public void getInformation() {
        System.out.println("Information about: " + name + " " + secondName + " " + middleName);
        System.out.println("Position: " + position);
        System.out.println("Email: " + email);
        System.out.println("Phonenumber: " + phoneNumber);
        System.out.println("Paycheck: " + payCheck);
        System.out.println("Age: " + age);
    }



}
