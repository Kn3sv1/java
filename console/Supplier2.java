import java.util.function.Supplier; 
  
interface D2 {
    int calculate();
}

interface D3<T> {
    int calculate();
}

interface D4<T> {
    T calculate();
}

//https://www.geeksforgeeks.org/supplier-interface-in-java-with-examples/
public class Supplier2 { 
    public static void main(String args[]) 
    { 
  
        // This function returns a random value. 
        Supplier<Double> randomValue = () -> Math.random(); 
        // Print the random value using get() 
        System.out.println(randomValue.get()); 


        D2 d2 = () -> 23;
        System.out.println(d2.calculate()); 

        D3 d3 = () -> 50;
        System.out.println(d3.calculate()); 

        D4<Integer> d4 = () -> 5000;
        System.out.println(d4.calculate()); 

        D4<Double> d5 = () -> Math.random();
        System.out.println(d5.calculate());  
        
    } 
} 