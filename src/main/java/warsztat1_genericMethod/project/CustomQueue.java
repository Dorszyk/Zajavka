package warsztat1_genericMethod.project;

import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class CustomQueue<T> {
    private  final Deque<T> queue;
    private final Map<String,Integer> counterMap = new HashMap<>();

    public CustomQueue(Deque<T> queue) {
        this.queue = queue;
    }

    public void processCommand(String command) {
        //"ADD PERSON(Tomasz_Romański)"
        // "LEAVE PERSON(Tomasz_Romański_2)"
        //  "PROCESS"

        if(command.contains("ADD PERSON")){
            handleAddPerson(command);
        } else if (command.contains("LEAVE PERSON")) {
            handleLeavePerson(command);
        } else if (command.contains("PROCESS")) {
            handleProcess(command);
        }else {
            throw new RuntimeException("O co Ci chodzi z komendą" + command);
        }
    }

    private void handleAddPerson(String command) {

        String personKey = command
                .replace("ADD PERSON(", "")
                .replace(")", "");

        String[] split = personKey
         .split("_");

        if(split.length == 2){
            String name = split [0];
            String surname = split [1];
            Integer counter = getAndIncrementCounter(personKey);
            System.out.println(name + " " + surname + " " + counter);
        }
    }
    private Integer getAndIncrementCounter(String personKey) {

        Integer tempCounter = counterMap.getOrDefault(personKey,0);
        counterMap.put(personKey,++tempCounter);
        return tempCounter;
    }

    private void handleLeavePerson(String command) {

    }

    private void handleProcess(String command) {
    }
}
