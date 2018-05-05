package LinkingLists;

import node.SingleLinkedNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DupeRemoverTest {
    @Test
    public void DuplicatesRemovedSuccessfully() {
        SingleLinkedNode listWithDupes = LinkedListUtilities.createListWithDuplicates(6);

        String expected = "1\n2\n3\n4\n5\n6\n";
        String actual = LinkedListUtilities.StringifyList(DupeRemover.removeDuplicates(listWithDupes));

        Assertions.assertEquals(expected, actual);
    }
}
