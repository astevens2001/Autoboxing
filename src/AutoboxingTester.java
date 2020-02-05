import java.util.ArrayList;

public class AutoboxingTester {
    public static void main(String[] args) {

        Integer number;

        int x = 5;

        number = x; //Autoboxing

        //Integer n = new Integer(6);

        int totallynewNumber = number; //unboxing

        ArrayList<Integer> myList = new ArrayList<Integer>();

        myList.add(6);
        myList.add(5);
    }
}
