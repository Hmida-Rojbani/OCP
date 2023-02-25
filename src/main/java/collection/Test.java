package collection;

import java.util.*;


public class Test {

    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder("test");
//        List<StringBuilder> list = List.of(sb);
//        List<StringBuilder> list2 = List.copyOf(Arrays.asList(sb));
//        System.out.println(list);
//       list.get(0).append("before");
//        sb.append("change");
//        System.out.println(list);
//        System.out.println(list2);
        //Collections.sort(List.of(new Person(32,"ali"),new Person(28,"salah")));
        TreeSet<Person> treeSet = new TreeSet<>(Comparator.comparing(Person::getAge).reversed());
        treeSet.addAll(List.of(new Person(32,"ali"),new Person(28,"salah"),new Person(28,"ghali")));
        System.out.println(treeSet);
        var list2 = new ArrayList<Person>(List.of(new Person(32,"ali"),new Person(28,"salah"),new Person(28,"ghali")));
        list2.sort(Comparator.comparingInt(Person::getAge).reversed().thenComparing(Comparator.comparing(Person::getName).reversed()));
        System.out.println(list2);
    }
}
