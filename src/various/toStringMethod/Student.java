package various.toStringMethod;

public class Student {

    private int rollno;
    private String name;
    private String city;

    Student(int rollno, String name, String city) {
        this.rollno = rollno;
        this.name = name;
        this.city = city;
    }

    @Override
    public String toString() {
        return "\nrollno: " + rollno + "\nname " + name + "\ncity: " + city;
    }

    public static void main(String[] args) {
        Student student1 = new Student(1, "Wiktor", "Poznań");
        Student student2 = new Student(2, "Zdzichu", "Kraków");

        System.out.println(student1);
        System.out.println(student2);
    }
}
