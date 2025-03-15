import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Matti", 572, "\uD80C\uDC80 \uD808\uDE26 \uD800\uDF12 \uD800\uDF97"));
        people.add(new Person("Jarkko", 798, "𒈦 𒂗 Ϻ Ϟ 𐌀 𐌑 𐌒 𐀀"));
        people.add(new Person("Pekka", 41, "Helsinki"));
        people.add(new Person("William", 231, "London"));
        people.add(new Person("Michael", 45, "Cairo"));
        people.add(new Person("Mike", 33, "Tokyo"));
        people.add(new Person("Eino", 60, "Espoo"));
        people.add(new Person("Ivan", 57, "Moscow"));


        //System.out.println(people.get(0).getCity());
        //System.out.println(people.get(1).getCity());
        people.forEach(n -> System.out.println(n.getName()));
        System.out.println();

        people.sort(Comparator.comparingInt(Person::getAge));
        people.forEach(n -> System.out.println(n.getName()));
        System.out.println();

        people.removeIf(n -> n.getCity().equals("Espoo"));
        people.forEach(n -> System.out.println(n.getName()));
        System.out.println();

    }
}
