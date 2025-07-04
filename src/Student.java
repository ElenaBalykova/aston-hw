import java.util.*;

public class Student {
    private String name;
    private String group;
    private int course;
    private int[] grades;

    public Student(String name, String group, int course, int[] grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public double getAverageGrade() {
        if (grades.length == 0) {
            return 0.0;
        }
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    public void promoteToNextCourse() {
        if (getAverageGrade() >= 3.0) {
            this.course++;
            System.out.println(this.name + " переведен на " + this.course + " курс.");
        } else {
            System.out.println(this.name + " не может быть переведен из-за низкого среднего балла.");
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", averageGrade=" + String.format("%.2f", getAverageGrade()) +
                '}';
    }

    public static void removeFailingStudents(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getAverageGrade() < 3.0) {
                System.out.println("Удаляем студента: " + student.getName() + " (средний балл: " + String.format("%.2f", student.getAverageGrade()) + ")");
                iterator.remove();
            }
        }
    }


    public static void printStudents(Set<Student> students, int course) {
        System.out.println("\nСтуденты на " + course + " курсе:");
        boolean found = false;
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println("- " + student.getName());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Нет студентов на этом курсе.");
        }
    }


    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Ilya", "First", 1, new int[]{1, 2, 3}));
        studentList.add(new Student("Stepan", "First", 2, new int[]{3, 4, 5}));
        studentList.add(new Student("Helga", "First", 1, new int[]{4, 4, 4}));
        studentList.add(new Student("Meri", "Second", 3, new int[]{2, 2, 2}));
        studentList.add(new Student("Victor", "Third", 2, new int[]{3, 3, 3}));

        System.out.println("Изначальный список студентов:");
        for (Student s : studentList) {
            System.out.println(s);
        }


        System.out.println("\n--- Удаление студентов со средним баллом < 3 ---");
        removeFailingStudents(studentList);

        System.out.println("\nСписок студентов после удаления:");
        for (Student s : studentList) {
            System.out.println(s);
        }


        System.out.println("\n--- Перевод студентов на следующий курс ---");
        for (Student student : studentList) {
            student.promoteToNextCourse();
        }

        System.out.println("\nСписок студентов после перевода:");
        for (Student s : studentList) {
            System.out.println(s);
        }
        Set<Student> studentSet = new HashSet<>(studentList);
        printStudents(studentSet, 2);
        printStudents(studentSet, 3);
        printStudents(studentSet, 4);
    }
}