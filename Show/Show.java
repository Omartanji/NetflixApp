package Show;

import Maturity.*;
import Credentials.*;
import java.util.Date;
import java.util.List;

public class Show implements Comparable<Show> {

    private String title;
    private String releaseDate;
    private Quality quality;
    private Genres genres;
    private Language Language;
    private String names;
    private int numOfViews;
    private String synopsis;
    private double averageRating;
    private List<MaturityLevel> levels;
    private int total_watch;

    public Show(String title) {
        this.title = title;
    }

    public Show(String title, String release_date, Quality quality, Language lang, int num_views, double average_rating) {
        this.title = title;
        this.releaseDate = release_date;
        this.quality = quality;
        this.Language = lang;
        this.numOfViews = num_views;
        this.averageRating = average_rating;
    }
    

    public Show(String title, String release_date, Quality quality, Genres genres, Language lang, String names, int num_views, double average_rating,String synopsis) {
        this.title = title;
        this.releaseDate = release_date;
        this.quality = quality;
        this.genres = genres;
        this.Language = lang;
        this.names = names;
        this.numOfViews = num_views;
        this.synopsis = synopsis;
        this.averageRating = average_rating;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String release_date) {
        this.releaseDate = release_date;
    }

    public Quality getQuality() {
        return quality;
    }

    public void setQuality(Quality quality) {
        this.quality = quality;
    }

    public Genres getGenres() {
        return genres;
    }

    public void setGenres(Genres genres) {
        this.genres = genres;
    }

    public Language getLanguage() {
        return Language;
    }

    public void setLanguage(Language lang) {
        this.Language = lang;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public int getNumOfViews() {
        return numOfViews;
    }

    public void setNumOfViews(int num_views) {
        this.numOfViews = num_views;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(double average_rating) {
        this.averageRating = average_rating;
    }

    public List<MaturityLevel> getLevels() {
        return levels;
    }

    public void setLevels(List<MaturityLevel> levels) {
        this.levels = levels;
    }

    public int getTotal_watch() {
        return total_watch;
    }

    public void setTotal_watch(int total_watch) {
        this.total_watch = total_watch;
    }

    @Override
    public String toString() {
        
        return title + "";
    }

    @Override 
    public int compareTo(Show SH){
        return SH.getTitle().compareTo(this.getTitle());
    
    }
    
    }


