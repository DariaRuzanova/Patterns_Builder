public class Main {
    public static void main(String[] args) {
        Person petya = new PersonBuilder()
                .setName("Петр")
                .setSurname("Иванов")
                .setAge(33)
                .setAddress("Москва")
                .build();
        System.out.println(petya);


        Person egor = petya.newChildBuilder()
                .setName("Егор")
                .setAge(3)
                .build();
        System.out.println(egor);

        egor.happyBirthday();
        System.out.println("После дня рождения: " + egor);

        Person ivan = new PersonBuilder()
                .setName("Иван")
                .setSurname("Петров")
                .setAge(18)
                .build();
        System.out.println(ivan);

        ivan.getAddress();


        try {
            Person olya = new PersonBuilder()
                    .setName("Оля")
                    .setSurname("Сидорова")
                    .setAge(-12)
                    .setAddress("Саратов")
                    .build();

        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }


    }
}
