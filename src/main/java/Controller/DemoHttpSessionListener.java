package Controller;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Created by linhtran on 20/04/2017.
 */
public class DemoHttpSessionListener implements HttpSessionListener {
    private  static int numberSession=0;
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("number session: "+(++numberSession));
    }

    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("number session: "+(--numberSession));
    }

    public static int getNumberSession() {
        return numberSession;
    }
}
