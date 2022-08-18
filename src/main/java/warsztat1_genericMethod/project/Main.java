package warsztat1_genericMethod.project;

import java.util.ArrayDeque;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        CustomQueue<Person> queue = new CustomQueue<>(new ArrayDeque<>(), new ArrayDeque<>());
        PersonCommandProcessor personCommandProcessor = new PersonCommandProcessor(queue);
        List<String> commandList = List.of(
                "ADD PERSON(Tomasz_Romański)",
                "ADD PERSON(Rafał_Adamczuk)",
                "ADD PERSON(Tomasz_Romański)",
                "ADD PERSON(Mariusz_Wilczek)",
                "ADD PERSON(Zbigniew_Ratownik)",
                "PROCESS",
                "LEAVE PERSON(Tomasz_Romański_2)",
                "LEAVE PERSON(Mariusz_Wilczek)",
                "PROCESS",
                "PROCESS",
                "PROCESS"
        );

        for (String command : commandList) {
           personCommandProcessor.processCommand(command);
        }
    }
}
