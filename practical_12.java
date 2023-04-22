public class practical_12 {
    public static void main(String[] args) {
        Person person1 = new Person(); 
        person1.printInfo();

        Person person2 = new Person("Divyan");
        person2.printInfo();

        Person person3 = new Person("Divyan", 16);
        person3.printInfo();
    }
}

class Person {
    String name;
    int age;

    Person() {
        name = "Divyan";
        age = 16;
    }

    Person(String name) {
        this.name = name;
        age = 16;
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

     void printInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
