package programowanieObkietowe.ex1;

import java.util.Arrays;

public class Books {


    public static void books() {

        Book book1 = new Book(987L, "Jolka", "Piotr");
        Book book2 = new Book(123L, "Mariolka", "Aiotr");
        Book book3 = new Book(654L, "Wiolka", "Aiotr");
        Book book4 = new Book(753L, "Alka", "Biotr");
        Book book5 = new Book(951L, "Majka", "Biotr");

        Book[] books = new Book[5];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        books[4] = book5;


        int counter = 0;
        for (Book book : books) {
            if (book.getTitle().startsWith("M")) {
                counter++;
            }
        }

        Book[] onlyAContaining = new Book[counter];
        for (int i = 0, j = 0 ; i < books.length; i++) {
            if (books[i].getTitle().startsWith("M")) {
                onlyAContaining[j] = books[i];
                j++;
            }
        }

        System.out.println(Arrays.toString(books));
        System.out.println(Arrays.toString(onlyAContaining));

    }

}
