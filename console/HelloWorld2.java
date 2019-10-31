import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HelloWorld2
{ 
    // Your program begins with a call to main(). 
    // Prints "Hello, World" to the terminal window. 
    public static void main(String args[]) 
    { 
        String f = "6666666666";
        //https://www.baeldung.com/java-8-lambda-expressions-tips
        System.out.println("Hello, World11"); 
        Foo foo = parameter -> parameter + " from lambda" + f;
        String result = foo.method("Message ");

        System.out.println(result); 

         //Thread Example without lambda  
         Runnable r1=new Runnable(){  
            public void run(){  
                System.out.println("Thread1 is running...");  
            }  
        };  
        Thread t1=new Thread(r1);  
        t1.start();
    } 
} 