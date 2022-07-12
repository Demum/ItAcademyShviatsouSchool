import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        RandomizerNameSurNameGrade randomizerNameSurNameGrade = new RandomizerNameSurNameGrade();
        Student student1 = new Student(randomizerNameSurNameGrade.randomName(), randomizerNameSurNameGrade.randomSurname(), randomizerNameSurNameGrade.randomGrade(), "1");
        Student student2 = new Student(randomizerNameSurNameGrade.randomName(), randomizerNameSurNameGrade.randomSurname(), randomizerNameSurNameGrade.randomGrade(), "2");
        Student student3 = new Student(randomizerNameSurNameGrade.randomName(), randomizerNameSurNameGrade.randomSurname(), randomizerNameSurNameGrade.randomGrade(), "1");
        Student student4 = new Student(randomizerNameSurNameGrade.randomName(), randomizerNameSurNameGrade.randomSurname(), randomizerNameSurNameGrade.randomGrade(), "1");

        List<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        ArrayList<Student> list2 = new ArrayList<>();

         for( Student student:list)
            if (student.getClassName().equals("1")) {
                list2.add(student);
            }

        int classGrade = 0;

        for( Student student:list2){
            classGrade +=student.getGrade();
        }
        classGrade = Math.round(classGrade / list2.size());
        System.out.println(list2);
        System.out.println("classGrade is: " + classGrade);
    }
}
