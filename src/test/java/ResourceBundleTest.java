import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Locale;
import java.util.ResourceBundle;

import static org.junit.Assert.assertEquals;

public class ResourceBundleTest {

    @Test
    void testEnglishBundle() {
        ResourceBundle rb = ResourceBundle.getBundle("MessagesBundle", new Locale("en", "US"));
        Assertions.assertEquals("Enter amount of eggs", rb.getString("prompt.eggAmt"));
    }

    @Test
    void testFinnishBundle() {
        ResourceBundle rb = ResourceBundle.getBundle("MessagesBundle", new Locale("fi", "FI"));
        Assertions.assertEquals("Syötä kananmunien määrä", rb.getString("prompt.eggAmt"));
    }
    @Test
    void testJapaneseBundle() {
        ResourceBundle rb = ResourceBundle.getBundle("MessagesBundle", new Locale("jp", "JP"));
        Assertions.assertEquals("卵の量を入力してください?", rb.getString("prompt.eggAmt"));
    }
    @Test
    void testSwedishBundle() {
        ResourceBundle rb = ResourceBundle.getBundle("MessagesBundle", new Locale("swe", "SWE"));
        Assertions.assertEquals("Hur många tamago?", rb.getString("prompt.eggAmt"));
    }

}
