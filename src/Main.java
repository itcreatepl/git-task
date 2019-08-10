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
    }

    public void dogGuard(Human human) {
        System.out.println("Złodziej zamierza okraść każdego mieszkańca: ");
        if (human.hasDog == true) {
            System.out.println("Nie zrobie skoku");
        } else {
            System.out.println("Skok udany");
        }
    }


}
