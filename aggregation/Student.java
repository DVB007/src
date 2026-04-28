package aggregation;

public class Student {
    int id;
    String name;
    Address address;// Aggregation

    public Student(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;// Student "មាន" (Has-A) Address
    }

    public void display() {
        System.out.println("ID : " + id + ", Name : " + name);
        //because address is another class if you want to use it
        //you should access class then call variable
        System.out.println("City : " + address.city + ", country : " + address.country);
    }
}
