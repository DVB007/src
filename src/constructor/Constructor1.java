package constructor;

public class Constructor1 {
    String name;

    // ១. Default Constructor1 (សម្រាប់ករណីមិនស្គាល់ឈ្មោះ)
    public Constructor1() {
        this.name = "Unknow";
    }

    // ២. Parameterized Constructor1 (សម្រាប់កំណត់ឈ្មោះភ្លាមៗពេលបង្កើត Object)
    // នេះទើបជាការប្រើប្រាស់ដែលមានប្រយោជន៍ខ្លាំង
    public Constructor1(String n) {
        this.name = n;
    }

    public void display() {
        System.out.println("Name : " + name);
    }

    public static void main(String[] args) {


        // បង្កើត Object ទី១ ដោយមិនដាក់ឈ្មោះ (វានឹងយក "Unknow")
        Constructor1 s1 = new Constructor1();

        // បង្កើត Object ទី២ ដោយដាក់ឈ្មោះឱ្យវាភ្លាមៗតាម Constructor1
        Constructor1 s2 = new Constructor1("Dara");


        s1.display(); // Output: Name : Unknow
        s2.display(); // Output: Name : Dara
    }
}


