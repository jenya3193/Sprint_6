import com.example.Animal;
import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(JUnit4.class)
public class LionConstructorExceptionTest {

    @Mock
    Feline feline;

    @Test
    public void LionExceptionTest() {
        Exception thrown = assertThrows(Exception.class, () -> new Lion("Львенок", feline));
        assertEquals("Используйте допустимые значения пола животного - самей или самка", thrown.getMessage());
    }

}
