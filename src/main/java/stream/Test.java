package stream;

import collection.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        var list2 = new ArrayList<Person>(List.of(new Person(32,"ali"),new Person(28,"salah"),new Person(28,"ghali")));

        //list2.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
       /*var stat = list2.stream()
               .mapToInt(Person::getAge)
               //.filter(i-> i>50)
               .max()
               .orElse(0);
               //.summaryStatistics();*/
        /*var stat = list2.stream()
                .parallel()
                .mapToInt(Person::getAge)
                .filter(i-> i>25)

                //.mapToObj(i->i)
                .boxed()
                .sequential()
                .collect(Collectors.toList());*/
        var stat = list2.stream()
                //.collect(Collectors.groupingBy(Person::getAge,Collectors.counting()));
                  //      .map(Person::getName)
                 //       .collect(Collectors.joining(","));
            // .collect(Collectors.partitioningBy(person -> person.getAge()>40));
             .collect(Collectors.groupingBy(person -> person.getAge()>40));
        //.summaryStatistics();
        System.out.println(stat);

    }
}
