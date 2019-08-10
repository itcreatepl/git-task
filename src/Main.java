import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Piotr",23,"Developer",true));
        personList.add(new Person("Marek",33,"Developer",true));
        personList.add(new Person("Michal",23,"Developer",true));
        personList.add(new Person("Zenek",33,"Driver",false));


    }
}
