package innerClass;

public abstract class AbstractCat {

    abstract void abstractMeow();

    public static  class Cat{
        static int numberOfLegs = 4;
        String name;

        public Cat(String name) {
            this.name = name;
        }

        static void staticMeow(){
            System.out.println("Statically meowin");
        }

        void nonStaticMeow(){
            System.out.println("Nonstatically meowin");
        }

        public static int getNumberOfLegs() {
            return numberOfLegs;
        }

        public String getName() {
            return name;
        }
    }
}
