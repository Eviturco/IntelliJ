public class Student extends Person{
//holi:)
    private String idStudent;

    public Student(){

    }
    public Student(String name, String mail, String idStudent, int age) {
        super(name, mail, age);
        this.idStudent = idStudent;
    }

    public void doExam(){
        System.out.println("Doing an Exam...\nBlessings my friend :)");
    }

    public void unsubscribe(String reason){
        System.out.println("I wand unsubscribe because: " + reason);
    }

    @Override
    public String toString() {
        String s = super.toString();
        return s;
    }

    // Pequeño cambio para ver si todo sale bien :)

}
