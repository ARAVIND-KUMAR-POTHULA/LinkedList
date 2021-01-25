package javapractice;

public class MyLinkedList {

    public  INode tail;
    public  INode head;

    ;
    public MyLinkedList() {
        this.tail = null;
        this.head = null;
    }

    public void addAtTop(MyNode<Integer> newNode) {
        if(this.tail == null) {
            this.tail = newNode;
        }
        if(this.head == null) {
            this.head = newNode;
        } else {
            INode tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }
    public void addAtBottom(MyNode<Integer> newNode) {
        if(this.head == null) {
            this.head = newNode;
        }
        if(this.tail == null) {
            this.tail = newNode;
        } else {
            this.tail.setNext(newNode);
            this.tail = newNode;

        }
    }

    public void addInBetween(MyNode<Integer> nodeBeforeInsertingNode, MyNode<Integer> insertingNode) {

        INode tempNode = head;

        while (tempNode.getNext() != nodeBeforeInsertingNode.getNext()) {
            tempNode = tempNode.getNext();
        }

            insertingNode.setNext(tempNode.getNext());
            tempNode.setNext(insertingNode);
        }

    public void deleteFirstElement() {
        head = head.getNext();

        }

    public void deleteLastElement() {
        INode tempNode = head;

        while (tempNode.getNext() != null) {
            tail = tempNode;
            tempNode = tempNode.getNext();
        }
        tail.setNext(null);

    }
    public void printMyNodes() {
        StringBuffer myNodes = new StringBuffer("My Nodes: ");
        INode tempNode = head;
        while (tempNode.getNext() != null) {
            myNodes.append(tempNode.getKey());
            if (!tempNode.equals(tail)) myNodes.append("->");
            tempNode = tempNode.getNext();

        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);
    }

}
