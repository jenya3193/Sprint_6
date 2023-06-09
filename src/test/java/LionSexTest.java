import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionSexTest {

    @Before
    public void initMocks() {
        MockitoAnnotations.initMocks(this);
    }

    @Mock
    Feline feline;

    String sex;
    Boolean mane;

    public LionSexTest(String sex, Boolean mane) {
        this.sex = sex;
        this.mane = mane;
    }

    @Parameterized.Parameters
    public static Object[][] getAnimalKind() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
    public void doesHaveManeTest() throws Exception {
        Lion lion = new Lion(sex,feline);
        assertEquals(mane, lion.doesHaveMane());
    }

}
