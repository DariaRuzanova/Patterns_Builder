import java.util.Objects;
import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected Integer age;
    protected String address;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public Person(String name, String surname, String address) {
        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    public boolean hasAge() {
        return this.age != null;
    }

    public boolean hasAddress() {
        return this.address != null;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public OptionalInt getAge() {
        if (hasAge()) {
            return OptionalInt.of(age);
        } else {
            System.out.println("Возраст не задан.");
            return OptionalInt.empty();
        }
    }

    public String getAddress() {
        if (hasAddress()) {
            return this.address;
        } else {
            System.out.println("Город не задан");
            return null;
        }
    }

    public void happyBirthday() {
        if (hasAge()) {
            age++;
        } else {
            System.out.println("Возраст не задан!");
        }
    }

    public String setAddress(String address) {
        return this.address = address;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setSurname(surname)
                .setAddress(address)
                .setAge(age);
    }

    @Override
    public String toString() {
        return "Person: " +
                "имя - " + name +
                ", фамилия - " + surname +
                ", возраст - " + age +
                ", адрес - " + address;
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, address);
    }
}
