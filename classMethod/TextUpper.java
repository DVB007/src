package classMethod;

public class TextUpper {
    public static void main(String[] args) {
        //create object that relate to class TextTool for
        // use method in those class
        TextTool tool = new TextTool();

        //create object . to Our method "toUpper" for uses convert to Uppercase
        String result1 = tool.toUpper("hello my student");
        String result2 = tool.toUpper("java is fun");

        //display object
        System.out.println("Uppercase : " + result1);
        System.out.println("Uppercase : " + result2);
    }
}
