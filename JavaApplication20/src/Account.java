/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ethan Reeds
 */
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns={"/account"})
public class Account extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException{
        resp.setContentType("text/plain");
        var pw = resp.getWriter();
        var username = req.getParameter("username");
        var password = req.getParameter("password");
        var realName = req.getParameter("name");
        if( username == null || password == null || realName == null){
            pw.printf("Missing parameter");
            return;
        }
        pw.println("Username:"+username);
        pw.println("Password:"+password);
        pw.println("Real Name:"+realName);
    }
}
