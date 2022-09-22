import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTutorial {
    public static void main(String[] args) {

        // *!SETS */
        // ?IT IS FASTER BECAUSE ALL THE ELEMENTS ARE UNIQUE
        //? SET CAN HAVE MAXIMUM ONE NULL VALUE
        // defining a hashset :
        // !every element of the set must be unique
        Set<String> hashSet = new HashSet<String>();

        // lets try it out
        // ? add for addition
        hashSet.add("kader");
        hashSet.add("ali");
        hashSet.add("robert");
        hashSet.add("zehra");
        hashSet.add("2");
        hashSet.add("lkasdjalskdj");
        // !because we already have an element named as "kader" it will not add again!
        hashSet.add("kader");
        // print the set
        hashSet.forEach((t) -> {
            System.out.println(t);
        });
        // ? can we add a set another set??
        Set<String> set2 = new HashSet<>();
        set2.add("kezban");
        set2.add("mehmet");
        // we will add set2 to the set
        hashSet.addAll(set2);
        // lets print the new set
        System.out.println("COMBINED SETS");
        System.out.println("\n");
        System.out.println(hashSet + "\n");
        for (String element : hashSet) {
            System.out.println(element);
        }

        // lets delete an element
        // ?some usages of set
        boolean isKaderThere = set2.contains("kader");
        System.out.println("isKaderThere:" + isKaderThere);
        // trying to delete what doesnt exist
        boolean succes = set2.remove("kader");
        System.out.println(succes ? "SİLME BAŞARILI" : "SİLME BAŞARISIZ");
        // delete if the element contains letter m
        boolean isMDeleted = hashSet.removeIf((x) -> x.equals("kezban"));
        System.out.println(isMDeleted ? "KEZBAN SİLME BAŞARILI" : "KEZBAM SİLME BAŞARISIZ");
        // print again
        for (String element : hashSet) {
            System.out.println(element);
        }
        System.out.println("\n\n ITERATOR DENEME");
        //? LETS TRY set iterator
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            String object = iterator.next();
            System.out.println(object);
        }

    }
}
