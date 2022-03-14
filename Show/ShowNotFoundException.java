package Show;

public class ShowNotFoundException extends Exception {

    public ShowNotFoundException(String Show) {
        super("Your show (" + Show + ") does not exist.");
    }
    
    public void suggestShows(Show[] catalog) {
        System.out.println("Here is the List of Available Shows to watch!\n");
        for (Show c : catalog) {
            System.out.println("- " + c.getTitle());
        }
    }
}
