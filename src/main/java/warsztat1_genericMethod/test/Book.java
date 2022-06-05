package warsztat1_genericMethod.test;

public class Book<AUTHOR> {

    AUTHOR author;

    public Book(AUTHOR author) {
        this.author = author;
    }

    public String get() {
        return author.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Book("Prus").get());
        System.out.println(new Book<String>("Mickiewcz").get());
        System.out.println(new Book<>("Sienkiewicz").get());
        System.out.println();
    }
}
