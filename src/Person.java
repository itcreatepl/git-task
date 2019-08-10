public class Person extends Human{

    String job;
    boolean hasDog;

    public Person(String name, int age, String job, Boolean hasDog) {
        super(name, age);
        this.job = job;
        this.hasDog = hasDog;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Boolean getHasDog() {
        return hasDog;
    }

    public void setHasDog(Boolean hasDog) {
        this.hasDog = hasDog;
    }
}
