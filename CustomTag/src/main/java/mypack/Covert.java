package mypack;

import java.io.IOException;
import java.io.StringWriter;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;

public class Covert extends SimpleTagSupport 
{
	StringWriter sw = new StringWriter();

	@Override
	public void doTag() throws JspException, IOException {
		// TODO Auto-generated method stub
		super.doTag();
		
		getJspBody().invoke(sw);
		JspWriter out = getJspContext().getOut();
		out.print(sw.toString().toUpperCase());
	}
	

}
