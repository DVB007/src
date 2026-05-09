public class BitwiseOperators {
    public static void main(String[] args) {
        int a = 5, b = 3;//a = 0101; b = 0011;
        System.out.println("a & b : "+ (a & b));//AND
        System.out.println("a | b : "+ (a | b));//OR
        System.out.println("a ^ b : "+ (a ^ b));//XOR
        System.out.println("˜a : "+ (~a));//NOT
        System.out.println("a << b : "+ (a << b));//0101<<1010
        System.out.println("a >> b : "+ (a >> 1));//0101>>0010
        System.out.println("a >>> b : "+ (a >>> 1));//0101>>0010

    }
}
