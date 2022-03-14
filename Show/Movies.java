package Show;

import Credentials.Language;
import Maturity.MaturityLevel;
import java.util.Date;
import java.util.List;

public class Movies extends Show {

    private int duration;

    public Movies(String title, String release_date, Quality quality, Language lang, int num_views, double average_rating, int duration) {
        super(title, release_date, quality, lang, num_views, average_rating);
        
        set_duration(duration);
    }

    
    private void set_duration(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return super.toString() + "\nWith the duration of " + duration + " minutes.\n";
    }

}
