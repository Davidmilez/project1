//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Implement a generic class Pair<T, U> that represents a pair of
//        elements of types T and U. Include methods to get and set both elements.
//        Test it with different combinations of data types.
        Pair <String,Integer> pair = new Pair<>("David", 207);
        Pair <Float,Boolean> pair2 = new Pair<>(89f, true);
        System.out.println(pair.getField1());
        System.out.println(pair2.getField2());
        System.out.println(pair.getField2());
        System.out.println(pair2.getField1());
    }


}