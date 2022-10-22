package warsztat2_lambda_progFunkcyjne.programowanie.methodReference.example1;

public class Main {
    public static void main(String[] args) {
        MilkProducer producer = () -> "someMilk";
        MilkConsumer consumer = arg1 -> {
            System.out.println("Calling consumer");
            return "someMilkConsumed :" + arg1;
        };

        MilkProducer producer1 = Main::someMilkReference1;
        MilkConsumer consumer1 = Main::someMilkReference2;

        System.out.println(producer1.produce());
        System.out.println(consumer1.consume("somethingToConsumeReference2"));

        System.out.println(producer.produce());
        System.out.println(consumer.consume("somethingToConsume"));
    }

    public static String someMilkReference1(){
        System.out.println("Calling someMilkReference1");
        return "someMilkFromMethod";
    }

    public static String someMilkReference2(String arg1){
        System.out.println("Calling someMilkReference2");
        return "someMilkFromMethod" + arg1;
    }



}
