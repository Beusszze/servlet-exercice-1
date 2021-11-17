package servlet;

import java.io.IOException;
import java.util.Enumeration;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.Article;
import model.User;

@WebServlet(urlPatterns ="/second-article") // declarer mon servlet via annotations
public class ArticleTwo extends HttpServlet {
	
	public ArticleTwo () {
		
	}
	@Override 
	protected void doGet(HttpServletRequest req, 
						HttpServletResponse resp) 
						throws ServletException, IOException{ 
		
		HttpSession session = req.getSession(); 
		User user = (User) session.getAttribute("USER");
		
	
		User userSecondArticle = new User ("shaq", 3, "shaq@gmail.com", false); 
		Article secondArticle = new Article ("titre 2 mon article", "blablablablabla", userSecondArticle); // creation d'un deuxieme article 
		
		
		req.setAttribute("articleTwoTitle", secondArticle.getTitre()); 		
		req.setAttribute("articleTwoContent", secondArticle.getContenu());				// donne 3 attributs a la requête req
		req.setAttribute("articleTwoUser", secondArticle.getUser());
		
		req.getRequestDispatcher("/WEB-INF/second-article.jsp").forward(req, resp);
				}


}


	

