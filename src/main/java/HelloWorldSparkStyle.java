import spark.Spark;


public class HelloWorldSparkStyle {
	public static void main(String[] args) {
		Spark.get("/myhome", (request, response) -> {
			return "Hello world!!!!";
		});
	}

}
