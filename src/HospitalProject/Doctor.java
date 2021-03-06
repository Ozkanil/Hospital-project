package HospitalProject;

public class Doctor {

    private String name;
    private String lastName;
    private String title;


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Doctor [name=" + name + ", lastName=" + lastName + ", title=" + title + "]";
    }

}
