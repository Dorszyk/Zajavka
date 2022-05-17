package innerClass;

public class Person {
    private String name;

    public class Smartphone{
        private int size;

        private class Screen {
            public  int getSize(){
                return size;
            }
        }
    }
}
