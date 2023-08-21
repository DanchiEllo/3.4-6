public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите имя первого user: ");
        String name1 = in.nextLine();

        System.out.println("Введите возраст первого user: ");
        Integer age1 = Integer.parseInt(in.nextLine());

        User user1 = new User(name1, age1);

        System.out.println("Введите имя второго user: ");
        String name2 = in.nextLine();

        System.out.println("Введите возраст второго user: ");
        Integer age2 = Integer.parseInt(in.nextLine());

        User user2 = new User(name2, age2);


        if (user1.getAge() < user2.getAge()) {
            System.out.println(user1.toString());
        } else if (user1.getAge() > user2.getAge()) {
            System.out.println(user2.toString());
        } else {
            System.out.println("Возраст пользователей " + user1.getName() + " и " + user2.getName() + " равен друг другу!");
        }

    }
}
