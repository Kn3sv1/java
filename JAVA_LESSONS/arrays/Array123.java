import java.util.Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.function;

public class Array123
{ 

    public static void p(int[] a) {
        System.out.println(Arrays.toString(a));
    }

    public static void changeArr(int[] a) {
        a[0] = 600;

        a = new int[] {22,3};

        //int[] a2 = {22, 3};

        //not allowed
        //int[] a3; a3 = {22, 3};
    }

    public static void mainArray() {
        int[] myFirstArray;
        myFirstArray = new int[15];

        myFirstArray[0] = 1;

        myFirstArray[10] = 10000;
        
        p(myFirstArray);
    }

   public static void mainArray2() {
        int[] a  = {1,2,45,6};
        changeArr(a);
        p(a);
    }

    public static void setInt(Integer i) {
        i = 5;
    }

    public static void mainInt() {
        //mainArray2();
        Integer s = 6;
        setInt(s);
        System.out.println(s);
    }

    public static void mainFilter() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "linode.com");
        map.put(2, "heroku.com");
        map.put(3, "something");
            
        String result = "";
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if("something".equals(entry.getValue())){
                result = entry.getValue();
            }
        }

        System.out.println(111);
        System.out.println(result);
    }

    public static void printSSS(sss s) {
        s.ddd();
    }

    public static void printSSS2(sss2 s) {
        s.ddd2();
    }

    public static void main(String[] args) {
        //mainArray2();
        //mainInt();
        //mainFilter();

        sss2 s = () -> System.out.println(7777);
        printSSS2(s); 

        sss s3 = () -> System.out.println(88888);
        printSSS(s3); 
    }
}

@FunctionalInterface
interface sss2 {
    public abstract void ddd2();
}
@FunctionalInterface
interface sss {
    void ddd();
}