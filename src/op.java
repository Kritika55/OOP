import java.sql.SQLOutput;

public class op {
    public static void main(String[] args){
        // create variables
        int a = 9, b=12;
        // value of a and b
        System.out.println("a is " +a +"and b is"+b);
        //== operator
        System.out.println(a == b); //false
        //!= operator
        System.out.println(a !=b); //true
        //> operator
        System.out.println(a>b); //false
        //< operator
        System.out.println(a<b); //true
        //>= operator
        System.out.println(a>=b); //false
        //<= operator
        System.out.println(a<=b); //true



    }
}
class Logical{
    public static void main(String[] args){
        // && operator
        System.out.println((5>3) &&(8>5)); //true
        System.out.println((5>3)&&(8<5)); //false
        //
        System.out.println();
    }
}



class Ternary{
    public static void main(String[] args){
        int age = 18;
        String eligibility;
        eligibility=(age>18)?"You can vote. ":"You cannot vote.";
        System.out.println(eligibility);


    }
}
