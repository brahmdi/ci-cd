import com.test.gitcicd.Calcul;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculTest {

    Calcul calcul ;

    @BeforeEach
    void setup(){
        calcul = new Calcul(1,2) ;
    }
    @Test
    public  void testSomme(){
        assertEquals(4,calcul.somme()) ;
    }
}
