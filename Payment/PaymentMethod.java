package Payment;
import java.util.Date;

public class PaymentMethod {
  private String holder_name;
  private Date expiration;
  private Type type;
  private int number;

    public PaymentMethod(String holder_name, Date expiration, Type type, int number) {
        this.holder_name = holder_name;
        this.expiration = expiration;
        this.type = type;
        this.number = number;
    }

    public String getHolder_name() {
        return holder_name;
    }

    public void setHolder_name(String holder_name) {
        this.holder_name = holder_name;
    }

    public Date getExpiration() {
        return expiration;
    }

    public void setExpiration(Date expiration) {
        this.expiration = expiration;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "PaymentMethod{" + "holder_name=" + holder_name + ", expiration=" + expiration + ", type=" + type + ", number=" + number + '}';
    }
  
  
}
