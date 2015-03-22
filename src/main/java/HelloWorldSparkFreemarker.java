import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import spark.Spark;
import freemarker.template.Configuration;
import freemarker.template.Template;


public class HelloWorldSparkFreemarker {

	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.setClassForTemplateLoading(HelloWorldSparkFreemarker.class, "/");
		
		Spark.get("/", (request, response) -> {
			StringWriter stringWriter = new StringWriter();
			
			Template template = config.getTemplate("hello.ftl");
			
			Map<String, String> map = new HashMap<String, String>();
			map.put("name", "John");
			map.put("name", "Peter");
			
			template.process(map, stringWriter);
			return stringWriter;
		});
		
	}

}
