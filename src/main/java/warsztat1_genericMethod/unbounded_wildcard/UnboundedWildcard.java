package warsztat1_genericMethod.unbounded_wildcard;

public class UnboundedWildcard {
    public static void main(String[] args) {

        Tuna <String> tuna = new Tuna<>();
        tuna.eat("trash");

        Tuna<?> newTuna = tuna;
        newTuna.getName();

    }

    static class Tuna<U>{
        private U element;
        void eat(U element){
            this.element = element;
        }

        String getName(){
            return "Roman";
        }
    }
}
