import java.util.*;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Антон", "Антонов", 30));
        people.add(new Person("Яков", "Смирнов Паустовский", 40));
        people.add(new Person("Элеонора", "Патусская Патуснова Пятая", 80));
        people.add(new Person("Наталья", "Светова Масанова", 50));
        people.add(new Person("Иван", "Иванов", 60));
        people.add(new Person("Сава", "Смирнов", 50));
        people.add(new Person("Борис", "Борисов", 15));
        people.add(new Person("Альберт", "Мусин Пушкин Второй", 60));
        people.add(new Person("Арон", "Гориловский Буряков", 16));

        Comparator<Person> comparator = (Person o1, Person o2) -> {
            if (Person.parts(o1) != Person.parts(o2)) {
                return Integer.compare(Person.parts(o2), Person.parts(o1));
            } else {
                return Integer.compare(o2.getAge(), o1.getAge());
            }
        };

        Collections.sort(people, comparator);
        System.out.println(people);

       people.removeIf(a -> a.getAge() < 18); // удаление из списка людей, возраст кот. меньше 18 лет
       System.out.println(people);

    }
}
