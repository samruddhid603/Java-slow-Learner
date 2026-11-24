
class Student {
    private int age = 20;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Student s = new Student();

        s.setAge(21);

        System.out.println("Age: " + s.getAge());
    }
}
