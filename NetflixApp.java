
import Credentials.Account;
import Credentials.Language;
import java.util.Scanner;
import Credentials.*;
import Show.*;
import java.util.Date;

public class NetflixApp {

    static void Register(Account acc) throws PasswordLengthException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your email.");
        String email = sc.next();
        System.out.println("Please enter your password.");
        String password = sc.next();

        Account act1 = new Account(email, password);
        System.out.println(act1);

        System.out.println("\nThanks for creating an account on Netflix!\n"
                + "");
    }

    static void Search(Show[] catalog) throws ShowNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nPlease enter the title of the show.\n");
        String title = sc.nextLine();

        for (Show catalog1 : catalog) {
            if (catalog1.getTitle().equals(title)) {
                System.out.println("Search result: " + catalog1);
                return;
            }
        }
        throw new ShowNotFoundException(title);
    }

    static void AddShow(Show SH) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nPlease enter the title of the show you want to add.\n");
        String show = sc.next();

        Show SH2 = new Show(show);
        System.out.println(SH2);

        System.out.println("\nThe show has been successfully added!\n");
    }

    static void Browse(Show[] catalog) {
        System.out.println("Here is the List of Available Shows to watch!\n");
        for (Show catalog1 : catalog) {
            System.out.println(catalog1);
        }
    }

    public static void main(String args[]) {

        Show[] catalog = new Show[4];
        Movies movie1 = new Movies("The Notebook", "2000, 11, 03", Quality.HD, Language.ENGLISH, 450000, 7.8, 124);
        catalog[0] = movie1;
        Movies movie2 = new Movies("Lucy", "2008, 04, 05", Quality.NORMAL, Language.ENGLISH, 144663, 9.5, 245);
        catalog[1] = movie2;

        Series series1 = new Series("The Vampire Diaries", "2018, 04, 01", Quality.HIGH, Language.ENGLISH, 120000, 10, 8, 21);
        catalog[2] = series1;
        Series series2 = new Series("Squid Game", "2007, 07, 25", Quality.HD, Language.KOREAN, 12442553, 9.8, 1, 9);
        catalog[3] = series2;

        String Option;
        Scanner sc = new Scanner(System.in);

        System.out.println("\nPlease register to access Netflix!\n");
        Account Acc = null;

        while (true) {
            try {
                Register(Acc);
                break;
            } catch (PasswordLengthException ex) {
                System.err.println(ex.getMessage());
            }
        }

        String c = "YES";

        while (c.equals("YES")) {
            System.out.println("\nPress 1 to Search or 2 to Add a show or 3 to Browse.\n");
            Option = sc.next();

            switch (Option) {
                case "1":
                    Show SH1 = null;
                    try {
                        Search(catalog);
                    } catch (ShowNotFoundException e) {
                        System.err.println(e.getMessage());
                        e.suggestShows(catalog);
                    }
                    break;
                case "2":
                    Show SH2 = null;
                    AddShow(SH2);
                    break;
                case "3":
                    Browse(catalog);
                    break;
            }
            System.out.println("Press YES to view the menu again.");
            c = sc.next();
        }
    }
}
