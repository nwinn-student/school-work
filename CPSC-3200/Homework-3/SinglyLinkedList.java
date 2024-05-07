

/*
 * Copyright 2014, Michael T. Goodrich, Roberto Tamassia, Michael H. Goldwasser
 *
 * Developed for use with the book:
 *
 *    Data Structures and Algorithms in Java, Sixth Edition
 *    Michael T. Goodrich, Roberto Tamassia, and Michael H. Goldwasser
 *    John Wiley & Sons, 2014
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/**
 * A basic singly linked list implementation.
 *
 * @author Michael T. Goodrich
 * @author Roberto Tamassia
 * @author Michael H. Goldwasser
 */
public class SinglyLinkedList<E> implements Cloneable, Iterable<E> {
  //---------------- nested Node class ----------------
  /**
   * Node of a singly linked list, which stores a reference to its
   * element and to the subsequent node in the list (or null if this
   * is the last node).
   */
  private static class Node<E> {

    /** The element stored at this node */
    private E element;            // reference to the element stored at this node

    /** A reference to the subsequent node in the list */
    private Node<E> next;         // reference to the subsequent node in the list

    /**
     * Creates a node with the given element and next node.
     *
     * @param e  the element to be stored
     * @param n  reference to a node that should follow the new node
     */
    public Node(E e, Node<E> n) {
      element = e;
      next = n;
    }

    // Accessor methods
    /**
     * Returns the element stored at the node.
     * @return the element stored at the node
     */
    public E getElement() { return element; }

    /**
     * Returns the node that follows this one (or null if no such node).
     * @return the following node
     */
    public Node<E> getNext() { return next; }

    // Modifier methods
    /**
     * Sets the node's next reference to point to Node n.
     * @param n    the node that should follow this one
     */
    public void setNext(Node<E> n) { next = n; }
  } //----------- end of nested Node class -----------

  // instance variables of the SinglyLinkedList
  /** The head node of the list */
  private Node<E> head = null;               // head node of the list (or null if empty)

  /** The last node of the list */
  private Node<E> tail = null;               // last node of the list (or null if empty)

  /** Number of nodes in the list */
  private int size = 0;                      // number of nodes in the list

  /** Constructs an initially empty list. */
  public SinglyLinkedList() { }              // constructs an initially empty list

  // access methods
  /**
   * Returns the number of elements in the linked list.
   * @return number of elements in the linked list
   */
  public int size() { return size; }

  /**
   * Tests whether the linked list is empty.
   * @return true if the linked list is empty, false otherwise
   */
  public boolean isEmpty() { return size == 0; }

  /**
   * Returns (but does not remove) the first element of the list
   * @return element at the front of the list (or null if empty)
   */
  public E first() {             // returns (but does not remove) the first element
    if (isEmpty()) return null;
    return head.getElement();
  }

  /**
   * Returns (but does not remove) the last element of the list.
   * @return element at the end of the list (or null if empty)
   */
  public E last() {              // returns (but does not remove) the last element
    if (isEmpty()) return null;
    return tail.getElement();
  }
  /**
   * Returns (but does not remove) the penultimate node of the list.
   * @return node before the end of the list - exception if size < 2 (IllegalStateException)
   */
  
  private Node<E> penultimateNode( ) {
      //***** Complete this method ***** //
      Node<E> penNode = head;
      if(size < 2){
        throw new IllegalStateException("Node size must be < 2.");
        }
        //Finds the next to last node
      while(penNode.getNext() != tail){
          penNode = penNode.getNext();
      }
      return penNode;
  }
  /**
   * Returns (but does not remove) the penultimate element of the list.
   * @return element before the end of the list - exception if size < 2 (IllegalStateException)
   */
  public E penultimate() { //do not change this method - complete the penultimateNode() method
      return penultimateNode().getElement();
  }
  /**
   * Returns (but does not remove) the middle element of the list.
   * @return element before the end of the list - exception if size = 0 (IllegalStateException)
   */
  public E getMiddle() {
      //***** Complete this method*****//
      Node<E> midNode = head;
      if(size == 0){
        throw new IllegalStateException("Node size must be > 0.");
        }
      if(size == 1){
        return midNode.getElement();
        }
        //Even size has a special case
      if(size % 2 == 0){
        for(int i = 0; i < size/2 - 1; i++){
            midNode = midNode.getNext();
        }
        return midNode.getElement();
      }
        //Determines the center of the list
      for(int i = 0; i < size/2; i++){
            midNode = midNode.getNext();
      }
      return midNode.getElement();
  }
  // update methods
  /**
   * Adds an element to the front of the list.
   * @param e  the new element to add
   */
  public void addFirst(E e) {                // adds element e to the front of the list
    head = new Node<>(e, head);              // create and link a new node
    if (size == 0)
      tail = head;                           // special case: new node becomes tail also
    size++;
  }

  /**
   * Adds an element to the end of the list.
   * @param e  the new element to add
   */
  public void addLast(E e) {                 // adds element e to the end of the list
    Node<E> newest = new Node<>(e, null);    // node will eventually be the tail
    if (isEmpty())
      head = newest;                         // special case: previously empty list
    else
      tail.setNext(newest);                  // new node after existing tail
    tail = newest;                           // new node becomes the tail
    size++;
  }
  /**
   * Adds an element to be the second of the list.
   * @param e  the new element to add
   */
  public void addSecond(E e) { 
      //***** Complete this method *****//
      if(size == 0){
        throw new IllegalStateException("Node size must be > 0.");
        }
      Node<E> secondNode = head.getNext();
      Node<E> addedNode = new Node<>(e, secondNode);  
      head.setNext(addedNode);
      
        //Checks and ensures that the tail is maintained
      Node<E> tailCheckerNode = head;
      for(int i = 0; i < size; i++){
          if(tailCheckerNode.getNext() == null){break;}  
          tailCheckerNode = tailCheckerNode.getNext();
        }
      tail = tailCheckerNode;
      size++;
  }
  
  /**
   * Adds an element at the ith position in the list.
   * @param e  the new element to add.  
   */ 
  public void add(E e, int i) {
      //***** Complete this method *****//
      if(i < 0){
        throw new IndexOutOfBoundsException("Invalid input location, must be >= 0.");
        }
      if(size == 0 && i > 0){
        throw new IndexOutOfBoundsException("Node size must not be 0 when the input is > 0.");
        }
        
      Node<E> prevNode = head; //Node prior to the input, starts from head
      if(i == 0){
        addFirst(e);
        size--;
        }
      else{
        while(i != 0){
            if(i == 1){
                //Adds a node connected to the previous's next node
                //then connects the previous node to the added node
                Node<E> newNode = new Node<E>(e, prevNode.getNext());
                prevNode.setNext(newNode);
                break;
            }
            //Shifts node position
            prevNode = prevNode.getNext();
            i--;
          }    
        }
        
        //Checks and ensures that the tail is maintained
      Node<E> tailCheckerNode = head;
      for(int j = 0; j < size; j++){
          if(tailCheckerNode.getNext() == null){break;}  
          tailCheckerNode = tailCheckerNode.getNext();
        }
      tail = tailCheckerNode;
      size++;
  }

  /**
   * Removes and returns the first element of the list.
   * @return the removed element (or null if empty)
   */
  public E removeFirst() {                   // removes and returns the first element
    if (isEmpty()) return null;              // nothing to remove
    E answer = head.getElement();
    head = head.getNext();                   // will become null if list had only one node
    size--;
    if (size == 0)
      tail = null;                           // special case as list is now empty
    return answer;
  }
  /**
   * Removes and returns the ith element of the list.
   * @return the removed element exception i not in proper range
   */
  public E remove(int i) {
      //***** Complete this method *****//
      if(isEmpty()) return null;
      if(i >= size) return null;
      
      Node<E> prevNode = null;
      Node<E> removedNode = head;
      
      if(i == 0){
        removeFirst();
        size++;
        }
      else{
        while (i > 0){
            //Positions the nodes accordingly
            prevNode = removedNode;
            removedNode = removedNode.getNext();
            i--;
        }  
        //Sets the previous node's next value to the removed node's next
        prevNode.setNext(removedNode.getNext());
        }
      size--;
      
        //Checks and ensures that the tail is maintained
      Node<E> tailCheckerNode = head;
      for(int j = 0; j < size; j++){
          if(tailCheckerNode.getNext() == null){break;}  
          tailCheckerNode = tailCheckerNode.getNext();
        }
      tail = tailCheckerNode;
      
      if(size == 0) tail = null;
      return removedNode.getElement();
  }
  
  /**
   * Reverses the order of the nodes in the list.
   * 
   */
  public void reverse() {
      //***** Complete this method *****//      
      Node<E> prevNode = null;
      Node<E> firstNode = head;
      Node<E> nextNode = null;
      while(firstNode != null){
            nextNode = firstNode.getNext();
            firstNode.setNext(prevNode);
            prevNode = firstNode;
            firstNode = nextNode;
        }
      head = prevNode;
      tail = firstNode;
      //Ensures that tail is the last node
      Node<E> tailCheckerNode = head;
      for(int i = 0; i < size; i++){
          if(tailCheckerNode.getNext() == null){
                tail = tailCheckerNode;
                break;
            }  
          tailCheckerNode = tailCheckerNode.getNext();
        }
  }

  @SuppressWarnings({"unchecked"})
  public boolean equals(Object o) {
    if (o == null) return false;
    if (getClass() != o.getClass()) return false;
    SinglyLinkedList other = (SinglyLinkedList) o;   // use nonparameterized type
    if (size != other.size) return false;
    Node walkA = head;                               // traverse the primary list
    Node walkB = other.head;                         // traverse the secondary list
    while (walkA != null) {
      if (!walkA.getElement().equals(walkB.getElement())) return false; //mismatch
      walkA = walkA.getNext();
      walkB = walkB.getNext();
    }
    return true;   // if we reach this, everything matched successfully
  }

  @SuppressWarnings({"unchecked"})
  public SinglyLinkedList<E> clone() throws CloneNotSupportedException {
    // always use inherited Object.clone() to create the initial copy
    SinglyLinkedList<E> other = (SinglyLinkedList<E>) super.clone(); // safe cast
    if (size > 0) {                    // we need independent chain of nodes
      other.head = new Node<>(head.getElement(), null);
      Node<E> walk = head.getNext();      // walk through remainder of original list
      Node<E> otherTail = other.head;     // remember most recently created node
      while (walk != null) {              // make a new node storing same element
        Node<E> newest = new Node<>(walk.getElement(), null);
        otherTail.setNext(newest);     // link previous node to this one
        otherTail = newest;
        walk = walk.getNext();
      }
    }
    return other;
  }

  public int hashCode() {
    int h = 0;
    for (Node walk=head; walk != null; walk = walk.getNext()) {
      h ^= walk.getElement().hashCode();      // bitwise exclusive-or with element's code
      h = (h << 5) | (h >>> 27);              // 5-bit cyclic shift of composite code
    }
    return h;
  }

  /**
   * Produces a string representation of the contents of the list.
   * This exists for debugging purposes only.
   */
  public String toString() {
    StringBuilder sb = new StringBuilder("(");
    Node<E> walk = head;
    while (walk != null) {
      sb.append(walk.getElement());
      if (walk != tail)
        sb.append(", ");
      walk = walk.getNext();
    }
    sb.append(")");
    return sb.toString();
  }
     /**
     * Implements java.lang.Iterable<T>
     */
    public java.util.Iterator<E> iterator() {
        return new ForwardIterator();
    }
    private class ForwardIterator implements java.util.Iterator<E> {
        //***** Define appropriate instance variables here *****//
        private Node<E> currentNode = head;
        private boolean DEBOUNCE = false;
        
        public boolean hasNext() {
            //***** Complete this method *****//            
            if(size == 0){return false;} // checks size
            if(currentNode == null){return false;} //for size 1 head
            if(currentNode.getNext() == null){ //actual checker of next
                if(currentNode == head){ //special case
                    return true;
                }
                return false;
            }
            return true;
        }

        // Note: this method has undefined behavior if hasNext() return false
        public E next() {
            //***** Complete this method *****//
            
            if(hasNext() == false){ //should never occur
                return null;
            }
            if(currentNode == head && size != 1){       
                if(!DEBOUNCE){ //displays head only once
                    DEBOUNCE = true;
                    return head.getElement();
                }
            }
            else if(currentNode == head && size == 1){ //displays head only once
                currentNode = null;
                return head.getElement();
            }
            currentNode = currentNode.getNext();
            return currentNode.getElement();
        }
        
    }
}
