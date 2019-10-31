import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//https://metanit.com/java/tutorial/10.6.php
public class HelloWorld4
{ 
    public static void main(String[] args) {
         
        Stream<Phone> phoneStream = Stream.of(new Phone("iPhone 8", 54000), 
            new Phone("Nokia 9", 45000),
            new Phone("Samsung Galaxy S9", 40000),
            new Phone("LG G6", 32000));
          
          
        Map<String, Integer> phones = phoneStream
            .collect(Collectors.toMap(p->p.getName(), t->t.getPrice()));
      
        phones.forEach((k,v)->System.out.println(k + " " + v));
    }
} 


class Phone{
      
    private String name;
    private int price;
      
    public Phone(String name, int price){
        this.name=name;
        this.price=price;
    }
      
    public String getName() { return name; }
    public int getPrice() { return price; }
}