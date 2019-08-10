public class Person extends Human{

    private String job;
    private boolean hasDog;

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

    @Override
    public String toString() {
        return "Personxxx{" +
                "job='" + job + '\'' +
                ", hasDog=" + hasDog +
                '}';
    }
}
