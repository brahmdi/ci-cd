import com.test.gitcicd.Calcul;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculTest {

    Calcul calcul ;

    public CalculTest(Calcul calcul) {
        super();
    }

    @BeforeEach
    void setup(){
        calcul = new Calcul(1,2) ;
    }
    @Test
    public  void testSomme(){
        assertEquals(3,calcul.somme()) ;
    }
    @Test
    void testSoustraction(){
        assertTrue(calcul.soustractio()<0);
    }
    @Test
    void testMultupl(){
        assertNotEquals(0,calcul.multuplication());
    }
    @Test
    void testGreatest(){
        assertEquals("b",calcul.greatest());
    }

}

