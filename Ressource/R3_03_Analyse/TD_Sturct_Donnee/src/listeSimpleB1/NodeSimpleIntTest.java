package listeSimpleB1;

import static org.junit.jupiter.api.Assertions.*;

public class NodeSimpleIntTest {

    void testConstructeur() {
        NodeSimpleInt node = new NodeSimpleInt(13, null);

        assertEquals(null, node);
    }

}
