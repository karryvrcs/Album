import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // java.lang.Integer
        // Each wrapper has a static overloaded factory method, valueOf()
        // which takes a primitive, and returns an instance of the wrapper class.

        // returns an instance of java.lang.Integer class, which is assigned to boxedInt variable with the value 15 in int.

        // this code manually (手动地，人工地) boxes a primitive integer.
        // This static factory valueOf(int) Yield significantly better space and time performance than below code.
        Integer boxedInt = Integer.valueOf(15);


        // Deprecated code!
//        Integer boxedAnotherInt = new Integer(15);

        // Autoboxing:
        // We don't have to manually box the primitives using valueOf() static method.
        // Instead, we can simply assign a primitive to a wrapper variable:
        Integer boxInt = 15;


        // Unboxing:

        // Every wrapper class supports a method to return the primitive value it contains.
        // manually unboxing
        int unboxedInt = boxedInt.intValue();
        System.out.println(unboxedInt);

        // Automatic unboxing:
        // Int wrapper is assigned directly to the primitive variable, the unboxing occur automatically.
        int unboxedInt2 = boxInt;

        Double boxDouble = getDoubleObject();
        System.out.println(boxDouble);
        double primitiveDouble = getLiteralDoublePrimitive();
        System.out.println(primitiveDouble);


        Integer[] wrapperArray = new Integer[5];
        wrapperArray[0] = 50; //primitive integer literal

        System.out.println(Arrays.toString(wrapperArray));
        // The first element is actually an Integer object.
        System.out.println(wrapperArray[0].getClass().getSimpleName());
        System.out.println("The JVM autoboxed the literal number 50 before assigning it to an element in the array");

        Character[] characterArray = {'a', 'b', 'c', 'd'};
        // JVM autoboxed each of the value.
        System.out.println(Arrays.toString(characterArray));

        System.out.println(returnAnInt(wrapperArray[0]));

        System.out.println(getList(1,2,3,4));
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
    }


    // We can only add the reference type into the ArrayList.
    // The int have to be converted to Integer before adding.
    private static ArrayList<Integer> getList(int... varargs){ // variable Argument
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (Integer element : varargs){
            arrayList.add(element);
        }
        return arrayList;
    }

    // Autoboxing!
    private static ArrayList<Integer> getList2(int... varargs){ // variable Argument
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int element : varargs){
            arrayList.add(element);
        }
        return arrayList;
    }


    private static int returnAnInt (Integer i){
        return i;
    }

    private static Double getDoubleObject(){
        return 200.53;
    }

    private static double getLiteralDoublePrimitive(){
        return 200.53;
    }
}