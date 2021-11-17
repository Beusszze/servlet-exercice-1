package filter;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;

// Filtre faisant ressortir les user qui ont isAdmin == true
@WebFilter(filterName ="admin")
public class AdminFilter implements Filter{
	
	public AdminFilter() {}
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
			System.out.println("Admin filter init...");
	
	}
	
	@Override
	public void destroy() {
			System.out.println("Admin filter destroy...");
			}
	
	
	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain filterChain)
			throws IOException, ServletException {
		
	}

}
