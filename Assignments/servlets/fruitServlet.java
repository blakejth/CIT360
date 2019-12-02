package fruitViewer; 
import java.io.*; 
import javax.servlet.*; 
import javax.servlet.annotation.WebServlet; 
import javax.servlet.http.*; 
@WebServlet("/FruitServlet")
 
public class FruitServlet extends HttpServlet { 
  
    public void doGet(HttpServletRequest request, HttpServletResponse response) 
    { 
        try { 
            response.setContentType("text/html"); 
           
            PrintWriter out = response.getWriter(); 
  
            String n = request.getParameter("userFruit"); 
            
            out.print("You selected " + n); 
  
            out.print("<a href='https://www.halfyourplate.ca/fruits/" + n + "/'>visit</a>"); 
  
            out.close(); 
        } 
        catch (Exception e) { 
            System.out.println(e); 
        } 
    } 
} 