package aggregation;

public class Student {
    int id;
    String name;
    Address address;// Aggregation : type address to create variable

    public Student(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;// Student "មាន" (Has-A) Address
    }

    public void display() {
        System.out.println("ID : " + id + ", Name : " + name);
        //city and country is another variable if you want to use it
        //you should use address then call variable
        System.out.println("City : " + address.city + ", country : " + address.country);
    }
}
