import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Shape {
    public boolean isPretty()
    {
        return true;
    }
    
}
class Circle extends Shape {}
class Square extends Shape {}

class Thing {
    public void t0() {}
}
class Thing1 extends Thing {
    public void t1() {}
}
class Thing2 extends Thing {
    public void t2() {}
}

//http://qaru.site/questions/102036/java-bounded-wildcards-or-bounded-type-parameter
public class ShapeGeneric {
 
    public static void main(String[] args) {
         
        List<Square> shapes = new ArrayList<Square>();
        //addIfPretty(shapes, new Shape());

        List<Circle> circles = new ArrayList<Circle>();
        addIfPretty(circles, new Circle());

        System.out.println(circles);


        List<? extends Thing> t = new ArrayList<Thing>();
        //t.add(new Thing());

        List<Thing1> t1 = new ArrayList<Thing1>();
        t1.add(new Thing1());

        List<Thing2> t2 = new ArrayList<Thing2>();
        t2.add(new Thing2());

        t = t1;
        t = t2;

        //http://qaru.site/questions/38/what-is-pecs-producer-extends-consumer-super
        List<Thing> t5 = new ArrayList<Thing>();
        addThing1(t5, new Thing());
        addThing1(t5, new Thing1());
        addThing1(t5, new Thing2());

        addThing2(t5, new Thing2());
        
        System.out.println(t5);


        List<? extends Thing> t6 = new ArrayList<Thing>();
        //t6.add(new Thing());
        
        List<? extends Thing> t7 = Arrays.<Thing>asList(new Thing(), new Thing1(), new Thing2(), new Thing2());
        System.out.println(t7);

        List<? extends Thing> t8 = new ArrayList<Thing1>();

        List<? extends Thing> t9 = Arrays.<Thing2>asList(new Thing2(), new Thing2());
        //t9.add(new Thing2());// We dont know the type

        List<? super Thing> t10 = new ArrayList<Thing>();
        t10.add(new Thing1());
        t10.add(new Thing2());
        t10.add(new Thing());

        
        
        //(new Thing()).t0();

    }
    public static void addThing0(List<? super Thing> things, Thing2 t) {
        things.add(t);
        //things.get(0).
    }

    public static void addThing2(List<? super Thing> things, Thing t) {
        things.add(t);
    }

    public static <T extends Thing> void addThing1(List<T> things, T t) {
        things.add(t);
    }

    public static <T extends Shape> void addIfPretty(List<T> shapes, T shape) {
        if (shape.isPretty()) {
           shapes.add(shape);
        }
    }
}