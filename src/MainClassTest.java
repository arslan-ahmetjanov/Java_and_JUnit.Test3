import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainClassTest {
    @Test
    public static void testGetClassString() {
        String result = Main.getClassString();
        Assertions.assertTrue(result.contains("hello") || result.contains("Hello"),
                "class_string does not contain 'Hello' or 'hello'");
    }
}
