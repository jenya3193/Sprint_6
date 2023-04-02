import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatClassTest {

    @Spy
    Feline feline;

    @Test
    public void getSoundTest() {
        Cat cat = new Cat(feline);
        assertEquals(cat.getSound(), "Мяу");
    }

    @Test
    public void getFoodTest() throws Exception {
        Cat cat = new Cat(feline);
        assertEquals(cat.getFood(), List.of("Животные", "Птицы", "Рыба"));
    }

}
