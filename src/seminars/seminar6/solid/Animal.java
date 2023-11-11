package seminars.seminar6.solid;

//public class Animal {
//    public String name;
//
//    public Animal(String name) {
//        this.name = name;
//    }
//
//    public void makeSound() {
//        if ("Dog".equals(name)) {
//            System.out.println("гав-гав");
//        } else if ("Cat".equals(name)) {
//            System.out.println("мяу-мяу");
//        }
//    }
//
//    public void saveToDatabase() {
//        // Логика сохранения в базу данных...
//    }
//}

public class Animal {
    public String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        if ("Dog".equals(name)) {
            System.out.println("гав-гав");
        } else if ("Cat".equals(name)) {
            System.out.println("мяу-мяу");
        }
    }
}

public class AnimalDatabase {
    public void save(Animal animal) {
        // Логика сохранения в базу данных...
    }
}