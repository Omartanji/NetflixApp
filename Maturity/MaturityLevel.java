package Maturity;

public class MaturityLevel {

    private int min_age;
    private String description;

    public MaturityLevel(int min_age, String description) {
        this.min_age = min_age;
        this.description = description;
    }

    public int getMin_age() {
        return min_age;
    }

    public String getDescription() {
        return description;
    }

    public void setMin_age(int min_age) {
        this.min_age = min_age;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Maturity_level{" + "min_age=" + min_age + ", description=" + description + '}';
    }
}
