package Maturity;

import java.util.List;

public class MaturityRating {

    private List<String> rating_reason;

    public MaturityRating(List<String> rating_reason) {
        this.rating_reason = rating_reason;
    }

    public List<String> getRating_reason() {
        return rating_reason;
    }

    public void setRating_reason(List<String> rating_reason) {
        this.rating_reason = rating_reason;
    }

    @Override
    public String toString() {
        return "MaturityRating{" + "rating_reason=" + rating_reason + '}';
    }
}
