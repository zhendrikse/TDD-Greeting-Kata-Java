/**
 * Hello world!
 */
public class App {
  public String greetVisitor(final String name){
    final String personName = (name == null) ? "my friend" : name;
    return "Hello, " + personName + ".";
  }
}