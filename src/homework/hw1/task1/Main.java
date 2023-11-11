package homework.hw1.task1;
import homework.hw1.task1.Cat;
public class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        Owner owner = new Owner("Maxim");
        myCat.setName("Richard");
        myCat.setAge(4);
        myCat.setOwnerName(owner);
        myCat.greet();
    }

}
