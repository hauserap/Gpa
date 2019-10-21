public class Student{

    // data - properties
    private String name;
    private int gradeLevel;

    private String mathScore;
    private  String englishScore;
    private  String csScore;
    
    // constructor 
    public Student(String name, int gradeLevel) {
        this.name = name;
        this.gradeLevel = gradeLevel;

        this.mathScore ="F";
        this.englishScore = "F";
        this.csScore = "F";

    }

    // functions - abilities 

    // getters and setters
    public String getName(){
        return this.name;
    }

     public void setName(String name){
         this.name = name;
     }

     public void setGradeLevel(int gradeLevel){
         if(gradeLevel >=9 && gradeLevel <=12){
             this.gradeLevel = gradeLevel;
         }
     }

    // calculate GPA
    public double  calculateGPA(){
        return 0.0;
    }


}