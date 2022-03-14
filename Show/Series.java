package Show;

import Credentials.Language;
import java.util.Date;

public class Series extends Show {
    
    private int seasons;
    private int episodes_per_season;

    public Series(String title, String release_date, Quality quality, Language lang, int num_views, double average_rating, int seasons, int episodes_per_season) {
        super(title, release_date, quality, lang, num_views, average_rating);
        this.seasons = seasons;
        this.episodes_per_season = episodes_per_season;
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getEpisodes_per_season() {
        return episodes_per_season;
    }

    public void setEpisodes_per_season(int episodes_per_season) {
        this.episodes_per_season = episodes_per_season;
    }

    @Override
    public String toString() {
        return super.toString()+"\nSeasons:" + seasons + "\nWith " + episodes_per_season + " episodes per season.\n";
    }

  
}
