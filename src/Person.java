public class Person {

    protected String name, mail;
    protected int age;

    public Person() {
    }

    public Person(String name, String mail, int age) {
        this.name = name;
        this.mail = mail;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return  "\nname: " + name +
                "\nmail: " + mail +
                "\nage: " + age;
    }

    public void move(){
        System.out.println("One step forward");
    }
}
