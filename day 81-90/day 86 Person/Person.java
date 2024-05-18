import java.util.Scanner;

public class Person {
    private String name;
    private int age;
    private String gender;

    // Default constructor
    public Person() {
    }

    // Constructor with name, age, and gender
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    // toString method to display person details
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name: ");
        String name = scanner.nextLine();

        System.out.println("Enter age: ");
        int age = scanner.nextInt();

        // Consume newline left-over
        scanner.nextLine();

        System.out.println("Enter gender: ");
        String gender = scanner.nextLine();

        Person person = new Person(name, age, gender);

        System.out.println(person);
    }
}
