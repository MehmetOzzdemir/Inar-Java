package Weeks.Weeks_12;

public class Student {

    private String name;
    private String surname;
    private int id;
    private String email;
   // String defaultAccessModifier = "This is a variable with default access modifier";

    public String publicAccessModifier;//public All Area
    String defaultAccessModifier;   //package private -default
    private  String privateAccessModifier;//Private for just class
    protected  String protectedAccessModifier;
    public Student(){
        this("","",0,"");
    }
    public Student(String name,String surname, int id , String email){
        this.name=name;
        this.surname=surname;
        this.id=id;
        this.email=email;
    }



    public String getName(){
        return this.name;
    }
    public void setName(String name ){
        this.name=name;
    }


    public String getSurname(){
        return this.surname;
    }
    public void setSurname(String surname ){
        this.surname=surname;
    }


    public int getId(){
        return this.id;
    }
    public void setId(int id ){
        this.id=id;
    }


    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email ){
        this.email=email;
    }


    public void print(){
        System.out.println("Name : "+this.name);
        System.out.println("Surname : "+this.surname);
        System.out.println("Id : "+this.id);
        System.out.println("Email : "+this.email);
        System.out.println("--------------------------");
    }

}
