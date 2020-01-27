import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
@WebServlet(urlPatterns={"/login"})
public class Login extends HttpServlet
{
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException{
        resp.setContentType("text/plain");
        var pw = resp.getWriter();
        //var name = req.getParameter("name");
        var username = req.getParameter("username");
        var password = req.getParameter("password");
        if( password == null || username == null ){
            pw.printf("Not all enteries are provided");
        } else {
            if (AccountManager.login(username,password)){
                var sess = req.getSession();
                sess.setAttribute("username", username );
                pw.printf("Logged in as "+username);
            }
            else{
                pw.println("incorrect username or password");
            }
        }
    }

}
