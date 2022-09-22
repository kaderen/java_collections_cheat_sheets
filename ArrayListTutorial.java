import java.util.ArrayList;
import java.util.List;

public class ArrayListTutorial {
    public static void main(String[] args) {
        // ?lets define a list
        // ? elements doesnt have to be unique,
        List<Integer> list = new ArrayList<Integer>();
        // lets add some values
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);
        System.out.println(list);
        // ?some usages
        //change from index to new object
        list.set(2, 10);
        System.out.println(list);
        //find an object's index
        int index = list.indexOf(20);
        System.out.println(index);
        //lets delete an object with an index
        list.remove(2);
        //lets sort
        list.sort((o1, o2) -> o1.compareTo(o2));
        System.out.println(list);
    }
}
