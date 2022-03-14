package Credentials;

import java.util.List;
import Maturity.*;
import Show.*;
public class Profile {

    private String name;
    private MaturityLevel level_restriction;
    private String email;
    private boolean toNotify;
    private String language;
    private Playback playback;
    private boolean subtitles;
    private List<Show> favorites;
    private List<Show> blocked;
    private Language subtitle_lang;

    public Profile(String name, MaturityLevel level_restriction, String email, boolean toNotify, String language, Playback playback, boolean subtitles, List<Show> favorites, List<Show> blocked, Language subtitle_lang) {
        this.name = name;
        this.level_restriction = level_restriction;
        this.email = email;
        this.toNotify = toNotify;
        this.language = language;
        this.playback = playback;
        this.subtitles = subtitles;
        this.favorites = (List<Show>) favorites;
        this.blocked = (List<Show>) blocked;
        this.subtitle_lang = subtitle_lang;
    }

    public String getName() {
        return name;
    }

    public MaturityLevel getLevel_restriction() {
        return level_restriction;
    }

    public String getEmail() {
        return email;
    }

    public boolean isToNotify() {
        return toNotify;
    }

    public String getLanguage() {
        return language;
    }

    public Playback getPlayback() {
        return playback;
    }

    public boolean isSubtitles() {
        return subtitles;
    }

    public List<Show> getFavorites() {
        return favorites;
    }

    public List<Show> getBlocked() {
        return blocked;
    }

    public Language getSubtitle_lang() {
        return subtitle_lang;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel_restriction(MaturityLevel level_restriction) {
        this.level_restriction = level_restriction;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setToNotify(boolean toNotify) {
        this.toNotify = toNotify;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setPlayback(Playback playback) {
        this.playback = playback;
    }

    public void setSubtitles(boolean subtitles) {
        this.subtitles = subtitles;
    }

    public void setFavorites(List<Show> favorites) {
        this.favorites = favorites;
    }

    public void setBlocked(List<Show> blocked) {
        this.blocked = blocked;
    }

    public void setSubtitle_lang(Language subtitle_lang) {
        this.subtitle_lang = subtitle_lang;
    }

    @Override
    public String toString() {
        return "Profile{" + "name=" + name + ", level_restriction=" + level_restriction + ", email=" + email + ", toNotify=" + toNotify + ", language=" + language + ", playback=" + playback + ", subtitles=" + subtitles + ", favorites=" + favorites + ", blocked=" + blocked + ", subtitle_lang=" + subtitle_lang + '}';
    }

    public void modify_maturity() {
    }

    
    public void add_favorite(Show fav) {
    	favorites.add(fav);
    }

}
