package servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.User;

@WebServlet(urlPatterns= "/home")
public class Home extends HttpServlet{
	
	public Home () {}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		User user = new User("Toto", 4, "toto@support.com", false); // objet user
		
		HttpSession session = (HttpSession) req.getSession(); // objet session créée et récupéré 
		session.setAttribute("USER", user); 					// session prend comme attribut pour "USER"  : user
		req.getRequestDispatcher("/index.jsp").forward(req, resp); // envoie requête vers index.jsp
		
	}
	

}
