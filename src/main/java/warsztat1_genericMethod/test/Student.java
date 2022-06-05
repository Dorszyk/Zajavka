package warsztat1_genericMethod.test;

public class Student extends Person{

    public static <P extends Person> void printP(P p){
        System.out.println(p.getName());
    }

    public static void main(String[] args) {

        Student.printP(new Person());
        Student.printP(new Student());
        Student.<Person>printP(new Student());
        Student.<Student>printP(new Student());
    }

    private <T> T modify(T t){
        return t;
    }

}
