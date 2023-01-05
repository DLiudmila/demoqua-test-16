import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class JUnit5Examples {

    @BeforeAll
    static void beforeAll() {
        System.out.println("###  @BeforeAll  !");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("###  @AfterAll  !");
    }

    @BeforeEach
    void beforeEach() {
//        open ("google.com")
        System.out.println("###  @BeforeEach  !");
    }
    @AfterEach
    void afterEach() {
//        open ("google.com")
        System.out.println("###  @AfterEach  !");
    }
    @Test
    void firstTest() {
        System.out.println("###  firstTest() !");
        assertTrue(5<7);
    }
    @Test
    void secondTest() {
        System.out.println("###  secondTest() !");
        assertFalse(5>7, "ЖОПА");
    }
}
