package warsztat1_genericMethod.project;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CustomQueue<Person> queue = new CustomQueue<>(new ArrayDeque<>(), new ArrayDeque<>());
        PersonCommandProcessor personCommandProcessor = new PersonCommandProcessor(queue);
        //Scanner version

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String command = scanner.nextLine();

            if ("EXIT".equals(command)){
                System.out.println("Exiting program...");
                break;
            }
            personCommandProcessor.processCommand(command);
        }


        //Fixed version
        /*List<String> commandList = List.of(
                "ADD PERSON(Tomasz_Romański)",
                "ADD PERSON(Rafał_Adamczuk)",
                "ADD PERSON(Tomasz_Romański)",
                "ADD PERSON(Mariusz_Wilczek)",
                "ADD PERSON(Zbigniew_Ratownik,VIP)",
                "PROCESS",
                "LEAVE PERSON(Tomasz_Romański_2)",
                "LEAVE PERSON(Mariusz_Wilczek)",
                "LEAVE PERSON(Zbigniew_Ratownik_1,VIP)",
                "PROCESS",
                "PROCESS",
                "PROCESS"
        );

        for (String command : commandList) {
           personCommandProcessor.processCommand(command);
        }*/
    }
}
