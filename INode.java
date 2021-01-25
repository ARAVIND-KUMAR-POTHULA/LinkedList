package javapractice;

public interface INode<K> {
    K getKey();
   void setNext(INode tempNode);

    INode getNext();
}
