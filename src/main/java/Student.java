import java.util.Objects;

public class Student {
    String name;
    String surname;
    int  grade;
    String className;

    public Student(String name, String surname, int grade, String className) {
        this.name = name;
        this.surname = surname;
        this.grade = grade;
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getGrade() {
        return grade;
    }

    public String getClassName() {
        return className;
    }


    @Override
    public String toString() {
        return "Student:" +
                "name= " + getName() + ", Surname=" + getSurname() + ", grade=" + getGrade() +
                ", className=" + getClassName() + "";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return grade == student.grade && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, grade);
    }
}
