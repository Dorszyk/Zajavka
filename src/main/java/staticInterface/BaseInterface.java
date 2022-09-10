package staticInterface;

public interface BaseInterface {

    static void print(){
        System.out.println("Interface printing");
        otherPrint();
    }

    static void otherPrint() {
        System.out.println(" other print");
    }
    void toOverride();


}
