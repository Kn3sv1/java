import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Plant {
    public void p1() {}        
}
 
class Fruit extends Plant {}
 
class Apple extends Fruit  {
    public void a1() {}    
}
 
class Orange extends Fruit  {}
 
class Golden extends Apple  {}
 
class Jhonatan extends Apple  {}

public class SuperGenericSuper { 
    public static void main(String args[]) 
    { 
        List<Golden> g = new ArrayList<>(Arrays.asList(new Golden()));
        List<Apple> a = new ArrayList<>(Arrays.asList(new Apple()));
        List<Fruit> f = new ArrayList<>(Arrays.asList(new Fruit()));
        List<? super Apple> apples20 = g; //IMPOSIBLE
        List<Apple> apples30 = g; //IMPOSIBLE
        List<? extends Apple> apples201111 = g;

        List<Apple> apples4 = a;
        List<? super Apple> apples5 = a;
        List<? super Apple> apples6 = f;


        List<? super Apple> apples2 = new ArrayList<Apple>();
                    apples2.add(new Apple());
                    apples2.add(new Jhonatan());
                    apples2.add(new Golden());

    } 
} 