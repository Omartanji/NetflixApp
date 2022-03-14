package Show;
import Credentials.*;
import java.util.Date;

public class Request {
    private Account requester;
    private Date request_made;
    private String title_suggestion;

    public Request(Account requester, Date request_made, String title_suggestion) {
        this.requester = requester;
        this.request_made = request_made;
        this.title_suggestion = title_suggestion;
    }

    public Account getRequester() {
        return requester;
    }

    public void setRequester(Account requester) {
        this.requester = requester;
    }

    public Date getRequest_made() {
        return request_made;
    }

    public void setRequest_made(Date request_made) {
        this.request_made = request_made;
    }

    public String getTitle_suggestion() {
        return title_suggestion;
    }

    public void setTitle_suggestion(String title_suggestion) {
        this.title_suggestion = title_suggestion;
    }

    @Override
    public String toString() {
        return "Request{" + "requester=" + requester + ", request_made=" + request_made + ", title_suggestion=" + title_suggestion + '}';
    }

    
}
