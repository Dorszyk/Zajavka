package warsztat1_genericMethod.project;

public class PersonCommandProcessor {

    private  final CustomQueue<Person> customQueue;

    public PersonCommandProcessor(CustomQueue<Person> customQueue) {
        this.customQueue = customQueue;
    }

    public void processCommand(String command) {

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

    }

    private Person createIncomingPerson(String command, Boolean isVip){

        return null;
    }

    private void handleLeavePerson(String command) {

    }


    private void handleProcess(String command) {
    }
}
