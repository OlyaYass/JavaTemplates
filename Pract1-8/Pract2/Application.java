package Pract2;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Application {
    static List<Human> human = List.of(
            new Human(12,"Ivan", "Ivanov", LocalDate.of(2011,4,2), 45),
            new Human(20,"Petr", "Petrov", LocalDate.of(2000,7,11), 88),
            new Human(16,"Stas", "Sidorov", LocalDate.of(2007,10,22), 90),
            new Human(40,"Olya", "Denisova", LocalDate.of(1980,11,16), 48),
            new Human(30,"Irina", "Antonova", LocalDate.of(1990,2,28), 70)
    );

    public static void main(String[] args) {
        System.out.println("Сортировка по сумме возраста и веса:");
        human.stream().sorted(Comparator.comparing(Human::getSum)).forEach(System.out::println);

        System.out.println();
        System.out.println("Фильтрация по весу, кратному 5:");
        human.stream().filter(human1 -> human1.getWeight() % 5 == 0).forEach(System.out::println);

        System.out.println();
        System.out.println("Выбор первых четырёх элементов:");
        human.stream().limit(4).forEach(System.out::println);

        System.out.println();
        System.out.println("Конкатенация имён через пробел:");
        System.out.println(human.stream().map(Human::getFirstName).collect(Collectors.joining(" ")));
    }

}
