import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] days = {
            "Monday",
            "Tuesday",
            "Wednesday",
            "Thursday",
            "Friday",
            "Saturday",
            "Sunday"
        };

        int[] numbers = {1,2,3,4,5,6,7};

        System.out.println("The days array is length: " + days.length);
        System.out.println("Numbers array is length: " + numbers.length);

        // [1,2,3,4,5,6,7] MUST BE TRANSFORMED TO String.
        System.out.println(Arrays.toString(numbers));
        for (int number : numbers) {
            System.out.println(number);
        }

        for(int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }

        List<String> UserList = new ArrayList<>();
        UserList.add("Carlos");
        UserList.add("Charlie");
        UserList.add("George");

        for(String name: UserList){
            System.out.println(name);
        }

        // [Carlos, Charlie, George]
        System.out.println(UserList);

        List<String> CharlieList = new LinkedList<>();
        CharlieList.add("Charlie");
        CharlieList.add("Carlos");

        for (String s : CharlieList) {
            System.out.println(s);
        }

        // Probably we will never use this way of doing stuff.
        for(int i=0; i<CharlieList.size(); i++){
            System.out.println(CharlieList.get(i));
        }

        System.out.println("======== Streaming? ========");

        List<Person> personas = Arrays.asList(
                new Person("Charlie", "123100", 20),
                new Person("Yordany", "402320", 21),
                new Person("Sharleston", "234242", 15)
        );

        // Ordena de menor a mayor.
        personas.stream().sorted((person1, person2) -> ((Integer)person1.getEdad()).compareTo(person2.getEdad()))
                .forEach(person -> System.out.println(person.getNombre()));



    }
}
