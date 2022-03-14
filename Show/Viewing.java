package Show;

import java.util.Date;
import Show.*;

public class Viewing {
    private Date date;
    private Show show;
    private Rating rate;

    public Viewing(Date date, Show show, Rating rate) {
    this.date = date;
    this.show = show;
    this.rate = rate;
    }
    
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public Rating getRate() {
        return rate;
    }

    public void setRate(Rating rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Viewing{" + "date=" + date + ", show=" + show + ", rate=" + rate + '}';
    }
    
  
    
    public void rate() {
    
}
    
}


