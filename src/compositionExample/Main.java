package compositionExample;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("312 Herbert Macualey", "Lagos", "3312");

        Person person = new Person("Joy Joseph", 20, address);

        System.out.println(person);
    }
}
