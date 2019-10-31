import java.util.ArrayList;
import java.util.List;

class Plant2 {}
class Fruit2 extends Plant2 {}

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

//https://javatalks.ru/topics/21376?_ga=2.9456053.1421913468.1560954143-1158569908.1560954142
public class SuperGeneric { 
    public static void main(String args[]) 
    { 
  
        /**
         * ключевое слово super задает ограничение "снизу", 
         * т.е. в метод writeToList можем передавать любой список List<Класс> где Класс -- это любой класс базовый для Apple включительно.(ошибка 2).
         */
        List<Apple> apL = new ArrayList<Apple>();
        List<Fruit> frL = new ArrayList<Fruit>();
        List<Plant> plL = new ArrayList<Plant>();
        List<Golden> gdL = new ArrayList<Golden>();
        writeToList(apL);
        writeToList(frL);
        writeToList(plL);        
        //writeToList(gdL);

        System.out.println(plL); 

        for (Plant p : plL) {
            p.p1();
        }

        for (Apple a : apL) {
            a.a1();
        }


        List<Apple> apples2 = new ArrayList<Apple>();
                    apples2.add(new Apple());
                    apples2.add(new Jhonatan());
                    apples2.add(new Golden());

    } 

    public static void writeToList(List<? super Apple> apples) {
        apples.add(new Apple());
        apples.add(new Golden());
        //apples.add(new Plant());
        //apples.add(new Fruit());
    }
} 