import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class FelineClassTest {

    @Test
    public void eatMeatTest() throws Exception {
        Feline feline = new Feline();
        assertEquals(feline.eatMeat(), List.of("Животные", "Птицы", "Рыба"));
    }

    @Test
    public void getFamilyTest() {
        Feline feline = new Feline();
        assertEquals(feline.getFamily(), "Кошачьи");
    }

    @Test
    public void getKittensTest() {
        Feline feline = new Feline();
        assertEquals(feline.getKittens(), 1);
    }

    @Test
    public void getKittensIntTest() {
        Feline feline = new Feline();
        assertEquals(feline.getKittens(5), 5);
    }

}
