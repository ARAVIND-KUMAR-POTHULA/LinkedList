package javapractice;

import org.junit.Assert;
import org.junit.Test;


public class MyLinkedListTest {
    @Test
    public void given3NumbersWhenAddedToLinkedListShouldAddToTop() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtTop(myFirstNode);
        myLinkedList.addAtTop(mySecondNode);
        myLinkedList.addAtTop(myThirdNode);
        myLinkedList.printMyNodes();
        boolean result = myLinkedList.head.equals(myThirdNode) &&
                         myLinkedList.head.getNext().equals(mySecondNode) &&
                         myLinkedList.tail.equals(myFirstNode);
        Assert.assertTrue(result);
    }
    @Test
    public void given3NumbersWhenAddedToLinkedListShouldAddToBottom() {
        MyNode<Integer> myFirstNode = new MyNode<>(50);
        MyNode<Integer> mySecondNode = new MyNode<>(36);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtBottom(myFirstNode);
        myLinkedList.addAtBottom(mySecondNode);
        myLinkedList.addAtBottom(myThirdNode);
        myLinkedList.printMyNodes();
        boolean result = myLinkedList.tail.equals(myThirdNode) &&
                         myLinkedList.head.getNext().equals(mySecondNode) &&
                         myLinkedList.head.equals(myFirstNode);
        Assert.assertTrue(result);
    }
}
