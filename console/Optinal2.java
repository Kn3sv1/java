import java.util.Optional;

public class Array123
{ 
    public static void mainOptional() {
        String john = null;
        Optional<String> name = Optional.ofNullable(john);
        System.out.println(name); //output Optional.empty
        System.out.println(123111); 
    }

    public static void mainArray() {
        int[] myFirstArray;
        myFirstArray = new int[15];
        
    }

    public static void main(String[] args) {
        mainArray();
    }
}