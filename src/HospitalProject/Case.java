package HospitalProject;

public class Case {

    private String actualCase;
    private boolean emergency;


    public String getActualCase() {
        return actualCase;
    }
    public void setActualCase(String actualCase) {
        this.actualCase = actualCase;
    }
    public boolean isEmergency() {
        return emergency;
    }
    public void setEmergency(boolean emergency) {
        this.emergency = emergency;
    }

    @Override
    public String toString() {
        return "Case [actualCase=" + actualCase + ", emergency=" + emergency + "]";
    }

}
