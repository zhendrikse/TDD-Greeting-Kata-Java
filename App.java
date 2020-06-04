/**
 * Hello world!
 */
public class App {
    public String greetVisitor(final String name){
        return createGreeting(name);
    }

    private String createGreeting(final String name) {
        final String visitor = (name == null) ? "my friend" : name;
        final String hello = isStringUpperCase(visitor) ? "HELLO " : "Hello, ";
        final String endChar = isStringUpperCase(visitor) ? "!" : ".";
        return hello + visitor + endChar;
    }

    private boolean isStringUpperCase(final String string){
        char[] charArray = string.toCharArray();
        
        for(int i = 0; i < charArray.length; i++){
            if( !Character.isUpperCase( charArray[i] ))
                return false;
        }
        
        return true;
    }
}