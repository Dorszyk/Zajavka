package lambda;

public class Main {
    public static void main(String[] args) {

        Jumpable jumpable = new Animal();
        System.out.println(jumpable.canJump("jumping", true));

        Jumpable jumpableLambda = (string, shouldPrint) -> {
            if(shouldPrint) {
                System.out.println("lambda CanJum invoked");
            }
            return string.contains("jump");
        };
        System.out.println(jumpableLambda.canJump("jumming",false));
        System.out.println(jumpableLambda.canJump("jumping",true));

    }
}
