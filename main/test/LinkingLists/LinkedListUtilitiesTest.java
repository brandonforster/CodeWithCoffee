package LinkingLists;

import node.SingleLinkedNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkedListUtilitiesTest {
    @Test
    public void SuccessfullyPrintsLinkedList() {
        SingleLinkedNode four = new SingleLinkedNode(null, 4);
        SingleLinkedNode three = new SingleLinkedNode(four, 3);
        SingleLinkedNode two = new SingleLinkedNode(three, 2);
        SingleLinkedNode one = new SingleLinkedNode(two, 1);

        String expected = "1\n2\n3\n4\n";

        String actual = LinkedListUtilities.StringifyList(one);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SuccessfullyBuildsLinkedList() {
        String expected = "1\n2\n3\n4\n5\n";

        String actual = LinkedListUtilities.StringifyList(LinkedListUtilities.createValidList(5));

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SuccessfullyBuildsLinkedListWithDuplicates() {
        String expected = "1\n2\n2\n3\n4\n4\n5\n";

        String actual = LinkedListUtilities.StringifyList(LinkedListUtilities.createListWithDuplicates(5));

        Assertions.assertEquals(expected, actual);
    }
}
