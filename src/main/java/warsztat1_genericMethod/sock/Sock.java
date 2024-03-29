package warsztat1_genericMethod.sock;

public class Sock <T> {
    private T item;

    public boolean put(T element){
        if(this.item == null || !this.item.equals(element)){
            this.item = element;
            return true;
        }
        return false;
    }

    public T getItem() {
        return item;
    }
}
