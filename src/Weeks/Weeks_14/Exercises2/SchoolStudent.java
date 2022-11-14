package Weeks.Weeks_14.Exercises2;

public class SchoolStudent extends Student{

    private int classLevel;
    private double gradeMean;
    private int dayOfAbsance;
    private String discipline;
    final private int NUMBER_OF_STUDENTS=20;

    public SchoolStudent(){
        this(10,79.8,7,"Math");
    }
    public SchoolStudent(int classLevel,double gradeMean,int dayOfAbsance,String discipline){
        this.classLevel=classLevel;
        this.gradeMean=gradeMean;
        this.dayOfAbsance=dayOfAbsance;
        this.discipline=discipline;
    }
    public SchoolStudent(String name,int age,String gender,double height,double weight,boolean isTurk){
        super();
        super.name=name;

    }
    public int getClassLevel() {
        return classLevel;
    }

    public void setClassLevel(int classLevel) {
        this.classLevel = classLevel;
    }

    public double getGradeMean() {
        return gradeMean;
    }

    public void setGradeMean(double gradeMean) {
        this.gradeMean = gradeMean;
    }

    public int getDayOfAbsance() {
        return dayOfAbsance;
    }

    public void setDayOfAbsance(int dayOfAbsance) {
        this.dayOfAbsance = dayOfAbsance;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public int getNUMBER_OF_STUDENTS() {
        return NUMBER_OF_STUDENTS;
    }

    private String absenceCondition(){
        String output ="";
        if(getDayOfAbsance()>=25){
            output="Return Class";
        }else{
            output="Your right of absence day is "+(25-getDayOfAbsance());
        }
        return output;
    }

    public String toSring(){
        String output="Name: "+getName()+"\nGender : "+getGender()+"\nAge : "+getAge()+"\nClass Level : "+getClassLevel()+
                "\nGrade Mean : "+getGradeMean()+"\nDay of Absence : "+getDayOfAbsance()+"\nAbsence Conditions : "+absenceCondition()+"\nNumber Of Student : "+getNUMBER_OF_STUDENTS();
        return output;
    }


}
