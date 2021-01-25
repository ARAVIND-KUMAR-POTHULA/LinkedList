package javapractice;

public  class MyNode<K>  {
    private final K key;
    private MyNode next;

    public MyNode(K key) {
        this.key = key;
        this.next = null;
    }


    public MyNode<K> getNext() {
        return next;
    }

    public  void setNext(MyNode next) {
        this.next = (MyNode<K>) next;
    }

}
