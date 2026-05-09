public class InstanceVariable {

    //Instance variables
    String name ;//Default value : null
    int age;//Default value : 0

    public InstanceVariable(String x, int y){
        this.name = x ;// "This" refers to the instance variable
        this.age = y;
    }

    public static void main(String[] args) {
        //Create an object of the InstanceVariable class
        InstanceVariable person1 = new InstanceVariable("Alice",30);
        InstanceVariable person2 = new InstanceVariable("David",19);

        //Access instance variables using ObjectReference. VariableName
        System.out.println("You Name : " + person1.name);
        System.out.println("You Age : " + person1.age);
        System.out.println("You Name : " + person2.name);
        System.out.println("You Age : " + person2.age);

        //Modify again instance variable
        person1.name = "Phin";
        person1.age = 32;
        System.out.println("\nYour Name : " + person1.name);
        System.out.println("\nYour Age : " + person1.age);
    }
}
