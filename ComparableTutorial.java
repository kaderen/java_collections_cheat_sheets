public class ComparableTutorial {
    public static void main(String[] args) {
        // ? lets compare some integers
        // ? conc = i1.compareTo(i2)
        // if(i1>i2) return 1;
        // else if(i1==i2) return 0;
        // else return -1;
        Integer i1 = 5;
        Integer i2 = 6;
        System.out.println(i1.compareTo(i2));

        // ? lets compare some Character
        // ? conc = c1.compareto(c2)
        // Difference of alphabetical order.
        Character c1 = 'k';
        Character c2 = 'e';

        System.out.println("\n" + c1.compareTo(c2));

        // ?lets compare some String
        // ? conc = k2.compareto(k1)
        // Difference of alphabetical order.
        String k1 = "Kader";
        String k2 = "Kadir";

        System.out.println("\n" + k2.compareTo(k1));

        // ? BOOLEAN
        // TRUE > FALSE
        /*
         * a = true
         * b = false
         * if a.compareto(b); return = 1
         * else if b.compareto(a); return = -1
         * else if a.compareto(a); return =0
         */


         // compareTo metodunu sınıflarda kullanabilmek için camparable interface'i implement edilir.

    }
}
