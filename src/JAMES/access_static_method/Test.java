package exercise_james.access_static_method;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Truong");
        student.setClasses("Codegym");
        System.out.println(student.getName());
        System.out.println(student.getClasses());
    }

}
