public class PersonBuilder implements IPersonBuilder {

    protected String name;
    protected String surname;
    protected Integer age;
    protected String address;

    @Override
    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    @Override
    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    @Override
    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    @Override
    public Person build() throws IllegalStateException, IllegalArgumentException {
        Person person = new Person(name, surname, age, address);
        if (name == null || surname == null) {
            throw new IllegalStateException("Заполните обязательные поля!");
        }
        if (age < 0 || age > 100) {
            throw new IllegalArgumentException("Указаны не верные данные!");
        }
        return person;
    }
}
