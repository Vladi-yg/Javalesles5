public class Collegues {

    private String name;
    private String phonenumber;
    private String position;
    private int age;

    public Collegues(String name, String phonenumber, String position, int age) {
        this.age = age;
        this.name = name;
        this.position = position;
        this.phonenumber = phonenumber;
}
    public int receivename() {
        return age;
    }
    public void getInformation() {
        System.out.println("Information about " + name);
        System.out.println("Age: " + age);
        System.out.println("Position: " + position);
        System.out.println("Phonenumber" + phonenumber);
    }
}
