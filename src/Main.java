import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Piotr",23,"Developer",true));
        personList.add(new Person("Marek",33,"Developer",true));
        personList.add(new Person("Michal",55,"Developer",true));
        personList.add(new Person("Zenek",55,"Driver",false));


        for (Person p: personList) {
            System.out.println(p);
        }
        System.out.println("Hello!!");
        System.out.println(reverseList(personList));

    }
    public static List<Person> reverseList(List<Person> personList){

        List<Person> invertedList = new ArrayList<>(personList.size());
        for(int i = personList.size()-1; i >= 0;i--){
            invertedList.add(personList.get(i));
        }
        return invertedList;


    }
}
