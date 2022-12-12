public class Student {
    private String name;
    private String classes;

    public Student(){
        this.name = "Nam";
        this.classes = "C09";
    }

    public void setName(String name){
        this.name = name;
    }

    public void setClasses(String classes){
        this.classes = classes;
    }

    public String display(){
        return "I'm " + this.name + " at " + this.classes;
    }

}
