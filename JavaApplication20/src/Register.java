
import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ethan Reeds
 */
@WebServlet(urlPatterns={"/register"})
public class Register extends HttpServlet{
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException{
        req.getSession().removeAttribute("name");
        resp.setContentType("text/plain");
        var pw = resp.getWriter();
        var name = req.getParameter("name");
        var username = req.getParameter("username");
        var password = req.getParameter("password");
        if (name == null || username == null || password == null) {
            pw.println("All entries not provided");
        } else {
            AccountManager.register(username, name, password); 
            pw.println("Username:"+username);
            pw.println("Name:"+name);
            pw.println("Password:"+password);
            pw.println("Registered!!!!!"); 
        }
    }

}

