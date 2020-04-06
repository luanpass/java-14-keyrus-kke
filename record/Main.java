package record;

public class Main {
    public static void main(String[] args) {
        Person person= new Person("Luan",15);
        Person person2= new Person("Luan",15);

        System.out.println(person.name());
        System.out.println(person.equals(person2));
    }
}
