package LinkingLists;

import node.SingleLinkedNode;

public class LinkedListUtilities {

    public static SingleLinkedNode createValidList(int nodeCount) {
        if (nodeCount == 0) {
            return null;
        }

        SingleLinkedNode head = null;

        for (int i= nodeCount; i> 0; i--) {
            head = new SingleLinkedNode(head, i);
        }

        return head;
    }

    public static SingleLinkedNode createListWithDuplicates(int nodeCount) {
        if (nodeCount == 0) {
            return null;
        }

        SingleLinkedNode head = null;

        for (int i= nodeCount; i> 0; i--) {
            head = new SingleLinkedNode(head, i);

            if (i%2 == 0) {
                head = new SingleLinkedNode(head, i);
            }
        }

        return head;
    }

    public static String StringifyList(SingleLinkedNode node) {
        SingleLinkedNode current = node;
        StringBuilder stringBuilder = new StringBuilder();

        while (current != null) {
            stringBuilder.append(current.getData());
            stringBuilder.append('\n');
            current = current.getNext();
        }

        return stringBuilder.toString();
    }
}
