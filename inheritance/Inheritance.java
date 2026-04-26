package inheritance;

// SuperClass
class Person {
    String name;
    int age;

    void displayPersonInfo() {
        System.out.println(" Name : " + name);
        System.out.println(" Age : " + age);
    }
}

class Student extends Person {
    String studentId;

    void displayStudentInfo() {
        //Inherited method
        displayPersonInfo();
        //Own property
        System.out.println(" Student ID : " + studentId);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        //Create a Student object
        /*ហេតុអ្វីត្រូវបង្កើត Object  Student s1 = new Student();?
        ការបង្កើត Object (ដូចជា s1) គឺជាការបង្កើត "និស្សិតម្នាក់" ពិតប្រាកដចេញពីប្លង់មេនោះ។
        បើគ្មាន Object ទេ យើងក៏គ្មានកន្លែង សម្រាប់ដាក់ឈ្មោះថា "Alice" ឬអាយុ "20" ដែរ។
         */
        Student s1 = new Student();

        //ទោះបីជា s1 ជា Student ក៏វានៅតែអាចកំណត់តម្លៃឱ្យ name និង age បានដែរ ព្រោះវាបានកេរ្តិ៍មរតកពី Person
        /*សញ្ញាចំណុច . ក្នុង Programming គេហៅថា Member Access Operator។ វាមានន័យថា "របស់"៖
        s1.name = ឈ្មោះ របស់
        s1.age = អាយុ របស់ s1        .displayStudentInfo() = ហៅមុខងារបង្ហាញព័ត៌មាន របស់ s1 មកប្រើ
         */
        s1.name = " Alice";
        s1.age = 20;
        s1.studentId = "S103";

        //Display student info using inherited and own methods
        s1.displayStudentInfo();
    }
}
