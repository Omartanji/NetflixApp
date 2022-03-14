package Show;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.io.Serializable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class ShowCollection implements Serializable {

    
    public static List<Show> shows = new ArrayList<>();
    
    public ShowCollection(){
        shows = new ArrayList<>();
    }
    
    public static final String path = System.getProperty("user.dir") + File.separator + "data";
    public static final String file = path + File.separator + "netflix.ser";
    
    

    public static void addShow(Show show) {
        shows.add(show);
    }

    public static List<Show> searchShow(String title) {
        List<Show> find = new ArrayList<>();
        Iterator it = shows.iterator();

        while (it.hasNext()) {
            Show sh = (Show) it.next();
            if (sh.getTitle().equals(title)) {
                find.add(sh);
            }
        }
        return find;
    }

    public void save() throws IOException {

        File file = new File(ShowCollection.path);
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }

        FileOutputStream out = new FileOutputStream(ShowCollection.path);
        ObjectOutputStream obj = new ObjectOutputStream(out);
        obj.writeObject(this.shows);
        obj.close();
        out.close();
        System.out.println("The Serialized Shows are saved in: "+ ShowCollection.path);

    }

    public void load() throws ClassNotFoundException, IOException {

        FileInputStream input = new FileInputStream(ShowCollection.file);
        ObjectInputStream obj = new ObjectInputStream(input);
        shows = (ArrayList<Show>) obj.readObject();
        obj.close();
        input.close();

    }

    public static List<Show> searchShow(Genres genre) {
        List<Show> find = new ArrayList<>();
        Iterator it = shows.iterator();

        while (it.hasNext()) {
            Show sh = (Show) it.next();
            if (sh.getGenres().name().equals(genre.name())) {
                find.add(sh);
            }
        }
        return find;
    }

    public static void removeShow(Show show) {
        if (shows.contains(show)) {
            shows.remove(show);
        }
    }

    public static void editShow(Show show, Show newShow) {
        if (shows.contains(show)) {
            shows.set(shows.indexOf(show), newShow);
        }
    }

}
