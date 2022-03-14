package Credentials;

import java.util.List;
import Show.*;
import Payment.*;

public class User {

    private String phone;
    private List<Profile> profile;
    private List<Request> requests;
    private PaymentMethod pay_method;

    public User(String phone, List<Profile> profile, List<Request> requests, PaymentMethod pay_method) {
        this.phone = phone;
        this.profile = profile;
        this.requests = requests;
        this.pay_method = pay_method;
    }

    public String getPhone() {
        return phone;
    }

    public List<Profile> getProfile() {
        return profile;
    }

    public List<Request> getRequests() {
        return requests;
    }

    public PaymentMethod getPay_method() {
        return pay_method;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setProfile(List<Profile> profile) {
        this.profile = profile;
    }

    public void setRequests(List<Request> requests) {
        this.requests = requests;
    }

    public void setPay_method(PaymentMethod pay_method) {
        this.pay_method = pay_method;
    }

    @Override
    public String toString() {
        return "User{" + "phone=" + phone + ", profile=" + profile + ", requests=" + requests + ", pay_method=" + pay_method + '}';
    }

    public void view_prof_history() {
    }

    ;
public void download_list() {
    }
;
}
