import jakarta.servlet.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.ArrayList;
import java.util.*;

import java.io.IOException;
import java.io.PrintWriter;
public class AddServlet extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException{
		PrintWriter out = res.getWriter();
		
		List<String> list = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("How many names you want to add: ");
		int num = sc.nextInt();
		
		System.out.print("Enter "+num+" names: ");
		for(int i=1;i<=num;i++) {
			String names = sc.next();
			list.add(names);
		}
		int num1 = 32;
		int num2 = 8;
		
		int sum = num1+num2;
		out.print(sum);
		
		out.print("<html><head><title>List Demo</title></head><body><h3>Name list is:</h3>");
		list.forEach(values -> out.print(values));
		out.print("</body></html>");
	}
}
