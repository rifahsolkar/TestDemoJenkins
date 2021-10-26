import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AdditionTest {

    @Test
    void add() {
        int result=Addition.add(3,3);
        int correct=6;
        assertEquals(correct,result);
    }

}