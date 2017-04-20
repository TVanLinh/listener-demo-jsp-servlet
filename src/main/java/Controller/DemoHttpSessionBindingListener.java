package Controller;

import DAO.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by linhtran on 20/04/2017.
 */
@WebServlet(name = "Servlet",urlPatterns = "/demo-session")
public class DemoHttpSessionBindingListener extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        action(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        action(request,response);
    }

    public void action(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
        request.setAttribute("hello", "Blah blah");
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}
