import java.util.ArrayList;
import java.util.List;

public class Citizen extends Human {

        private String name2;
        private String address;

    public Citizen(String name, int age, String name2, String address) {
        super(name, age);
        this.name2 = name2;
        this.address = address;

    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }
}
