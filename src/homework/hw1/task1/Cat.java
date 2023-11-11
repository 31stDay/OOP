package homework.hw1.task1;

public class Cat {
    private String name;
    private int age;
    private Owner ownerName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Owner getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(Owner ownerName) {
        this.ownerName = ownerName;
    }

    public void greet(){
        System.out.println("Мяу! Меня зовут" + name + ". Мне" + age + "года(лет). Мой владелец -" + ownerName.getName() +".");
    }
}
