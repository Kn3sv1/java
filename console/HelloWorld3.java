import java.util.function.Predicate;

//https://metanit.com/java/tutorial/9.3.php
public class HelloWorld3
{ 
    public static void main(String[] args) {
         
        Predicate<Integer> isPositive = x -> x > 0;
         
        System.out.println(isPositive.test(5)); // true
        System.out.println(isPositive.test(-7)); // false
    }
} 