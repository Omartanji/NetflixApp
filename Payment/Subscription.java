package Payment;

import java.util.Date;
import java.util.Map;

public class Subscription {

    private Date subscribed;
    private Plan current_plan;
    private Date canceled;
    private String cancel_reason;
    private Map billing_by_month;

    public Subscription(Date subscribed, Plan current_plan, Date canceled, String cancel_reason, Map billing_by_month) {
        this.subscribed = subscribed;
        this.current_plan = current_plan;
        this.canceled = canceled;
        this.cancel_reason = cancel_reason;
        this.billing_by_month = billing_by_month;
    }

    public Date getSubscribed() {
        return subscribed;
    }

    public void setSubscribed(Date subscribed) {
        this.subscribed = subscribed;
    }

    public Plan getCurrent_plan() {
        return current_plan;
    }

    public void setCurrent_plan(Plan current_plan) {
        this.current_plan = current_plan;
    }

    public Date getCanceled() {
        return canceled;
    }

    public void setCanceled(Date canceled) {
        this.canceled = canceled;
    }

    public String getCancel_reason() {
        return cancel_reason;
    }

    public void setCancel_reason(String cancel_reason) {
        this.cancel_reason = cancel_reason;
    }

    public Map getBilling_by_month() {
        return billing_by_month;
    }

    public void setBilling_by_month(Map billing_by_month) {
        this.billing_by_month = billing_by_month;
    }

    public void change_plan() {
  
    
} 

    @Override
    public String toString() {
        return "Subscription{" + "subscribed=" + subscribed + ", current_plan=" + current_plan + ", canceled=" + canceled + ", cancel_reason=" + cancel_reason + ", billing_by_month=" + billing_by_month + '}';
    }
}
   
