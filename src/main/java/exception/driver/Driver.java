package exception.driver;

public class Driver {

    private int age;

    public Driver(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age <= 18){
            throw new DrivingException("You cannot drive below 18 yo. Provided " + age + " years");
        }
        System.out.println("Setting driver's age to " + age);
        this.age = age;
    }
}
