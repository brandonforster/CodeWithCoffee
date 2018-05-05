package LinkingLists;

import node.SingleLinkedNode;

import java.util.HashSet;
import java.util.Set;

public class DupeRemover {

    // Write code to remove duplicates from an unsorted linked list
    public static SingleLinkedNode removeDuplicates(SingleLinkedNode listWithDupes) {
        SingleLinkedNode current = listWithDupes;
        SingleLinkedNode caboose = current;

        Set<Integer> nodeSet = new HashSet<>();

        while (current != null) {
            if (nodeSet.contains(current.getData())) {
                caboose.setNext(current.getNext());
            }

            nodeSet.add(current.getData());
            caboose = current;
            current = current.getNext();
        }

        return listWithDupes;
    }
}
