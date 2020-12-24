package DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        // Create your subway line here:
    
        DoublyLinkedList subway = new DoublyLinkedList();
        subway.addToHead("Times Square");
        subway.addToHead("Grand Central");
        subway.addToHead("Central Park");
        subway.printList();
    
        subway.addToTail("Penn Station");
        subway.addToTail("Wall Street");
        subway.addToTail("Brooklyn Bridge");
        subway.printList();
    
        subway.removeHead();
        subway.removeTail();
        subway.printList();
    
        subway.removeByData("Times Square");
        subway.printList();
      }
}
