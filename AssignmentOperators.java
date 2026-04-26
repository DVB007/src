public class AssignmentOperators {
    public static void main(String[] args) {
        int a = 10, b = 5;
        System.out.println(" Initial value : a ="+ a +" ,b = "+ b);//10

        //Simple assignment
        a = b;
        System.out.println(" After a = b , a = "+ a);//5

        //Add and assign
        a +=3;//Equivalent to : a = a + 3;
        System.out.println(" After a += 3, a = "+a);//8

        //Subtract and assign
        a -=2;//Equivalent to : a = a - 2;
        System.out.println(" After a -= 3, a = "+a);//6

        //Multiply and assign
        a *= 4; //Equivalent to : a = a * 4;
        System.out.println(" After a *=4, a = " + a);//24

        //Divide and assign
        a /= 2; //Equivalent to : a = a /2;
        System.out.println(" After a /= 2, a = "+ a); //12

        //Modulus and assign
        a %=3; //Equivalent to : a = 12 & 3;
        System.out.println(" After a %= 2, a = "+ a);//0

        //Bitwise AND assign
        a &=1; // Equivalent to : a = 0 & 1;
        System.out.println(" After a &= 1, a = "+ a);//0

        //Bitwise OR assign
        a |=2;// Equivalent to : a = 0 | 2;
        System.out.println(" After a |= 2, a = "+ a);//2

        //Bitwise XOR assign
        a ^=3;// Equivalent to : a = 2 ^ 3; 0010 ^ 0011 = 0001
        System.out.println(" After a ^= 3, a = "+ a);//1

        //Left shift and assign
        a <<=1;// Equivalent to : a = a << 1; 0010
        System.out.println(" After a <<= 3, a = "+ a);//2

        //Right shift and assign
        a >>=1;// Equivalent to : a = 2 >> 1; 0010 >> 0001
        System.out.println(" After a <<= 3, a = "+ a);//1
    }
}
