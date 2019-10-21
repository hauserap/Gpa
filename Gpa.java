public class Gpa{
    public static void main (String [] args){
        Student student = new Student("tayler",9);

        double gpa = student.calculateGPA();
        System.out.println(gpa);

        String name = student.getName();
        System.out.println(name);

        int gradeLevel = student.getGradeLevel();
        System.out.println(gradeLevel);
    }
}