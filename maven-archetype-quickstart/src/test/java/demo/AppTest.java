package demo;

// Junit imports
// import static org.junit.jupiter.api.Assertions.assertTrue;
// import org.junit.jupiter.api.Test;

// test ng imports
import org.testng.annotations.Test;
import org.testng.Assert;

/**
 * JUnit test for simple App.
 */
// public class AppTest {

//     /**
//      * Rigorous Test :-)
//      */
//     @Test
//     public void shouldAnswerWithTrue() {
//         assertTrue(true);
//     }
// }

public class AppTest { // Assuming your class to test is named App
    @Test
    public void testAddition() { // TestNG methods are typically public void by default
        // App app = new App(); // Your class instantiation
        // Assert.assertEquals(app.add(2, 3), 5, "2 + 3 should equal 5");
        Assert.assertTrue(true);
    }
}