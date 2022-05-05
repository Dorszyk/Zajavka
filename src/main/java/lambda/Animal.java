package lambda;

public class Animal implements Jumpable {

    @Override
    public boolean canJump(String s, boolean b) {
        if(b){
            System.out.println("canJump invoked");
            System.out.println();
        }
        return s.contains("jump");
    }
}
