/**
 * Hello world!
 */
public class App {
    public String greetVisitor(final String... names) {
        return createGreeting(createVisitorList(names));
    }

    private String createVisitorList(final String ... names) {
        if (names == null) {
            return "my friend";
        } else if (names.length == 1) {
            return names[0].equals("") ? "my friend" : names[0];
        } else if (names.length == 2) {
            return names[0] + " and " + names[1];
        } else {
            final StringBuilder visitors = new StringBuilder();
            for (int i = 0; i < names.length; i++) {
                visitors.append(names[i]);
                if (i != names.length - 1) {
                    visitors.append(", ");
                }
                if (i == names.length - 2) {
                    visitors.append("and ");
                }
            }
            return visitors.toString();
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