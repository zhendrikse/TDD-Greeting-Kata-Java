import static org.junit.Assert.*;
import org.junit.Test;
/**
 * Unit test for simple App.
 */
public class AppTest {
  private App classUnderTest = new App();
  @Test
  //@DisplayName("Test if the method interpolates the input {name} in a simple greeting")
  public void testGreetVisitorSimpleHelloPositiveCase() {
    assertEquals("Hello, Bob.", classUnderTest.greetVisitor("Bob"));
  }

  @Test
  //@DisplayName("Test if the method is able to handle null input")
  public void testGreetVisitorNullAsInput() {
    assertEquals("Hello, my friend.", classUnderTest.greetVisitor(null));
  }

  @Test
  public void testGreetVisitorShouting() {
    assertEquals("HELLO BOB!", classUnderTest.greetVisitor("BOB"));
  }
}