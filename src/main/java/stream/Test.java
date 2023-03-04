package stream;

import collection.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

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

        double result = LongStream.of(6L, 8L, 10L)
                .mapToInt(x -> (int) x)
                .boxed()
                .collect(Collectors.groupingBy(x -> x))
                .keySet()
                .stream()
                .collect(Collectors.averagingInt(x -> x));

        System.out.println(Stream.iterate(1, x ->++x)
                .limit(5)
                .mapToInt(x -> x)
                        .mapToObj(x->x*10)
                .count());
        // x -> new String(x);
        UnaryOperator<String> opt = String::new;
        // () -> new String();
        Supplier<String> sup = String::new;
        // i -> new StringBuilder(i)
        Function<String,StringBuilder> fn = StringBuilder::new;
        UnaryOperator<StringBuilder> opt1 = StringBuilder::new;

    }
}
