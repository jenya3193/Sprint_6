import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(MockitoJUnitRunner.class)
public class LionConstructorExceptionTest {

    @Mock
    Feline feline;

    @Test
    public void lionExceptionTest() {
        Exception thrown = assertThrows(Exception.class, () -> new Lion("Львенок", feline));
        assertEquals("Используйте допустимые значения пола животного - самей или самка", thrown.getMessage());
    }

}
