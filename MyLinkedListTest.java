package javapractice;

import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;


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
    @Test
    public void givenNewNumberWhenAddedToLinkedListShouldAddInBetweenTwoNodes() {
        MyNode<Integer> myFirstNode = new MyNode<>(50);
        MyNode<Integer> mySecondNode = new MyNode<>(70);
        MyNode<Integer> insertingNode = new MyNode<>(36);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtBottom(myFirstNode);
        myLinkedList.addAtBottom(mySecondNode);
        myLinkedList.printMyNodes();
        myLinkedList.addInBetween(myFirstNode,insertingNode);
        myLinkedList.printMyNodes();
        boolean result = myLinkedList.tail.equals(mySecondNode) &&
                         myLinkedList.head.getNext().equals(insertingNode) &&
                         myLinkedList.head.equals(myFirstNode);
        Assert.assertTrue(result);
    }
    @Test
    public void given3NumbersWhenAddedToLinkedListShouldDelete1stElement() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtBottom(myFirstNode);
        myLinkedList.addAtBottom(mySecondNode);
        myLinkedList.addAtBottom(myThirdNode);
        System.out.println("ELEMENTS BERFORE DELETING");
        myLinkedList.printMyNodes();
        myLinkedList.deleteFirstElement();
        System.out.println("ELEMENTS AFTER DELETING");
        myLinkedList.printMyNodes();
        boolean result = myLinkedList.head.equals(mySecondNode) &&
                         myLinkedList.head.getNext().equals(myThirdNode);

        Assert.assertTrue(result);
    }
    @Test
    public void given3NumbersWhenAddedToLinkedListShouldDeleteLastElement() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtBottom(myFirstNode);
        myLinkedList.addAtBottom(mySecondNode);
        myLinkedList.addAtBottom(myThirdNode);
        System.out.println("ELEMENTS BERFORE DELETING");
        myLinkedList.printMyNodes();
        myLinkedList.deleteLastElement();
        System.out.println("ELEMENTS AFTER DELETING");
        myLinkedList.printMyNodes();
        boolean result = myLinkedList.head.equals(myFirstNode) &&
                         myLinkedList.tail.equals(mySecondNode);

        Assert.assertTrue(result);
    }
    @Test
    public void given3NumbersAddedToLinkedListShouldSearchGivenElement() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtBottom(myFirstNode);
        myLinkedList.addAtBottom(mySecondNode);
        myLinkedList.addAtBottom(myThirdNode);
        myLinkedList.printMyNodes();


        int result = myLinkedList.searchElement(30);

        Assert.assertEquals(30,result);
    }
    @Test
    public void givenNewNumberWhenAddedToLinkedListShouldAddAfterNode() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyNode<Integer> insertingNode = new MyNode<>(40);
        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.addAtBottom(myFirstNode);
        myLinkedList.addAtBottom(mySecondNode);
        myLinkedList.addAtBottom(myThirdNode);
        System.out.println("ELEMENTS BEFORE INSERTING");
        myLinkedList.printMyNodes();
        myLinkedList.addInBetween(mySecondNode,insertingNode);
        System.out.println("ELEMENTS AFTER INSERTING");
        myLinkedList.printMyNodes();
        boolean result = myLinkedList.head.equals(myFirstNode) &&
                         myFirstNode.getNext().equals(mySecondNode) &&
                         mySecondNode.getNext().equals(insertingNode) &&
                         insertingNode.getNext().equals(myThirdNode);
        Assert.assertTrue(result);
    }
    @Test
    public void given4NumbersWhenAddedToLinkedListShouldDeleteGivenElementAndShouldShowLinkedListSize3() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(40);
        MyNode<Integer> myFourthNode = new MyNode<>(70);

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtBottom(myFirstNode);
        myLinkedList.addAtBottom(mySecondNode);
        myLinkedList.addAtBottom(myThirdNode);
        myLinkedList.addAtBottom(myFourthNode);
        System.out.println("ELEMENTS BERFORE DELETING");
        myLinkedList.printMyNodes();
        myLinkedList.deleteInBetween(mySecondNode,myThirdNode);
        System.out.println("ELEMENTS AFTER DELETING");
        myLinkedList.printMyNodes();
        boolean result = myLinkedList.head.equals(myFirstNode) &&
                         myFirstNode.getNext().equals(mySecondNode) &&
                         mySecondNode.getNext().equals(myFourthNode) ;

        Assert.assertTrue(result);
    }
}
