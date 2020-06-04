/**
 * Hello world!
 */
public class App {
    public String greetVisitor(final String... name) {
        if (name == null) {
            return createGreeting("my friend");
        } else if (name.length == 1) {
            final String visitor = name[0].equals("") ? "my friend" : name[0];
            return createGreeting(visitor);
        } else {
            return createGreeting(name[0] + " and " + name[1]);
        }
        
    }

    private String createGreeting(final String visitor) {
        final String hello = isStringUpperCase(visitor) ? "HELLO " : "Hello, ";
        final String endChar = isStringUpperCase(visitor) ? "!" : ".";
        return hello + visitor + endChar;
    }

    private boolean isStringUpperCase(final String string) {
        char[] charArray = string.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (!Character.isUpperCase(charArray[i]))
                return false;
        }

        return true;
    }
}