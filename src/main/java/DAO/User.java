package DAO;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

/**
 * Created by linhtran on 20/04/2017.
 */
public class User implements HttpSessionBindingListener{
    private  String userName;
    private  String passWord;

    public User() {
    }

    public User(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void valueBound(HttpSessionBindingEvent event) {
        System.out.println("Add in session "+this.getUserName()+"  pass:"+this.passWord);
    }

    public void valueUnbound(HttpSessionBindingEvent event) {
        System.out.println("Removed session"+this.getUserName());
    }
}
