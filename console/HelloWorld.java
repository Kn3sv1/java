import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HelloWorld 
{ 
    // Your program begins with a call to main(). 
    // Prints "Hello, World" to the terminal window. 
    public static void main(String args[]) 
    { 
        Topic t = new Topic("1", "name1", "description1");
        
        System.out.println("Hello, World11"); 
        Integer a[] = new Integer[] { 10, 20, 30, 40 }; 
  
        // getting the list view of Array 
        List<Integer> list = Arrays.asList(a); 

        List<Topic> listTopic = Arrays.asList(
            new Topic("1", "name1", "description1"), 
            new Topic("2", "name2", "description2"),
            new Topic("3", "name3", "description3")
        );

        List<Topic> listTopic2 = listTopic.stream().filter(t2 -> t2.getId().equals("1")).collect(Collectors.toList());

        System.out.println(listTopic2); 
    } 
} 