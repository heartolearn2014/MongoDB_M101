import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;

public class HelloWorldFreemarkerStyle {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.setClassForTemplateLoading(HelloWorldFreemarkerStyle.class, "/");
		
		try {
			Template template = configuration.getTemplate("hello.ftl");
			
			StringWriter string = new StringWriter();
			Map<String, String> nameMap = new HashMap<String, String>();
			nameMap.put("name", "John");
			
			template.process(nameMap, string);
			//System.out.println(string + "\n");
			
			nameMap.put("name", "Peter");
			
			template.process(nameMap, string);
			System.out.println(string + "\n");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
