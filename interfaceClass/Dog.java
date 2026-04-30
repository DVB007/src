package interfaceClass;

//នៅពេល Class Dog ប្រើពាក្យ implements Animal វាមានន័យថា
// Dog សុខចិត្តចុះកិច្ចសន្យាជាមួយ Animal។ ដូច្នេះ Dog ដាច់ខាតត្រូវតែ
// សរសេរកូដសម្រាប់ makeSound() និង eat() បើមិនសរសេរទេ Java នឹង Error ភ្លាម
public class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog says : Woof!");
    }

    @Override
    public void eat() {
        System.out.println("Dog eats bones.");
    }
}
