package problems.p0200_0300.p0297_serialize_and_deserialize_binary_tree;

import static org.junit.jupiter.api.Assertions.*;

import java.util.StringJoiner;
import letcode.TreeNode;
import org.junit.jupiter.api.Test;

class CodecTest {

    @Test
    void testCodec() {
        TreeNode root = TreeNode.of(1, 2, 3, null, null, 4, 5);
        Codec ser = new Codec();
        String serData = ser.serialize(root);
        assertEquals("1,2,N,N,3,4,N,N,5,N,N,", serData);
        Codec deser = new Codec();
        TreeNode act = deser.deserialize(serData);

        assertEquals("[1, 2, 3, 4, 5]", act.toString());
    }

    @Test
    void testCodec2() {
        Codec ser = new Codec();
        Codec deser = new Codec();
        assertNull(deser
            .deserialize(ser
                .serialize(null))
        );
    }
}