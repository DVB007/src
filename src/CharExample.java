public class CharExample {
    public static void main(String[] args) {
        char c1 = 'A';//A
        char c2 = 65;//ASCII value for 'A'
        char c3 = '\u0041';//Unicode representation of 'A'
        char c4 = '\n';//Newline character

        System.out.println(c1);//Output A
        System.out.println(c2);//Output A
        System.out.println(c3);//Output A
        System.out.println("Hello "+ c4 + "World!");//Output: Hello
                                                    //World!
    }
}
