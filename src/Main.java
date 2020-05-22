public class Main {

    public static  void main(String[] args) {
        Employee employee = new Employee ("Ivan", "Ivanov", "Ivanovich", "Diractor", "iv@mail.ru","89777770770", 200000, 48 );
           employee.getInformation();
        Collegues[] collegues = new Collegues[5];
        collegues[0] = new Collegues("Petr","89163455434","Manager", 54);
        collegues[1] = new Collegues("Artem","89776541232","Programmer",48 );
        collegues[2] = new Collegues("Sasha","89267689087","Doctor", 32);
        collegues[3] = new Collegues("Maria","89105678909", "Engeneur", 25);
        collegues[4] = new Collegues("Oleg","89763212123","Teacher", 72);
        for (int i = 0; i < 5; i++) {
            if (collegues[i].receivename() > 40) {
                collegues[i].getInformation();
            }
        }
    }
}

