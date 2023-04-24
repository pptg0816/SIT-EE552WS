import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class IDLList<E> {

    private static class Node<E> {

        E data;
        Node<E> next;
        Node<E> prev;

        /* Constructor */

        public Node(E elem) {
            this.next = null;
            this.prev = null;
            this.data = elem;
        }

        /* Constructor */

        public Node(E elem, Node<E> prev, Node<E> next) {
            this.data = elem;
            this.next = next;
            this.prev = prev;

        }

        /* Function to set link to next node */

        public void setLinkNext(Node n) {

            next = n;

        }

        /* Function to set link to previous node */

        public void setLinkPrev(Node p) {

            prev = p;

        }

        /* Function to get link to next node */

        public Node<E> getLinkNext() {

            return next;

        }

        /* Function to get link to previous node */

        public Node<E> getLinkPrev() {

            return prev;

        }

        /* Function to set data to node */

        public void setData(E d) {

            data = d;

        }

        /* Function to get data from node */

        public E getData() {

            return data;

        }

    }

     Node<E> head;
     Node<E> tail;
     public int size;
    ArrayList<Node<E>> indices;

    /* Constructor */

    public IDLList() {

        head = null;

        tail = null;

        size = 0;

        indices = new ArrayList<>();

    }

    /* Function to add element at index */

    public boolean add(int index, E elem) {

        Node<E> nptr = new Node<>(elem, null, null);

        if (index < 0 || index > size) return false;

        if (index == 0) {
            add(elem);
            return true;
        }

        Node<E> ptr = head;

        for (int i = 1; i <= size; i++) {

            if (i == index) {

                Node<E> tmp = ptr.next;//ptr.getLinkNext();

                ptr.next = nptr;//ptr.setLinkNext(nptr);

                nptr.prev = ptr;//nptr.setLinkPrev(ptr);

                nptr.next = tmp;//setLinkNext(tmp);

                tmp.prev = nptr;//tmp.setLinkPrev(nptr);
            }

            ptr = ptr.next;//ptr = ptr.getLinkNext();

        }

        indices.add(index,nptr);
        size++;
        return true;
    }

    /* Function to insert element at head */

    public boolean add(E elem) {

        Node<E> nptr = new Node<>(elem, null, null);

        if (head == null) {

            head = nptr;

            tail = head;

        }

        else {

            head.prev = nptr;//head.setLinkPrev(nptr);

            nptr.next = head;//nptr.setLinkNext(head);

            head = nptr;
        }
        indices.add(0,nptr);
        size++;
        return true;

    }

    /* Function to insert element at tail */

    public boolean append(E elem)

    {

        Node nptr = new Node(elem, null, null);

        if (head == null) {

            head = nptr;

            tail = head;

        } else {

            nptr.setLinkPrev(tail);

            tail.setLinkNext(nptr);

            tail = nptr;

        }
        indices.add(nptr);
        size++;
        return true;

    }

    /* Function to get size of list */

    public int size() {

        return size;

    }

    /* Function to get data from index */
    public E get (int index){

       return indices.get(index).data;

    }

    /* Function to get data from head */
    public E getHead () {

        return indices.get(0).data;

    }

    /* Function to get data from tail */
    public E getLast (){

        return indices.get(size).data ;

    }

    /* Function to check if list is empty */

    public boolean isEmpty() {

        return head == null;

    }

    /* Function to remove node at head */
    public E remove(){

        E tmp = head.data;

            if (size == 1) {

                head = null;

                tail = null;

                size = 0;

                indices.remove(0);

                return tmp;

            }

            head = head.next;//head = head.getLinkNext();

            head.next = null;//head.setLinkPrev(null);

            indices.remove(0);

            size--;

            return tmp;
    }

    /* Function to remove node at tail */
    public E removeLast(){

        E tmp = tail.data;

        if (size == 1) {

            head = null;

            tail = null;

            indices.remove(size-1);

            size = 0;

            return tmp;

        }

        tail = tail.prev;

        tail.next = null;

        indices.remove(size-1);

        size--;

        return tmp;
    }

    /* Function to remove node at position */

    public E removeAt(int index) {

        if (index == 0) {
            remove();
        }

        if (index == size) {
            removeLast();
        }

        Node<E> ptr = head.next;//Node ptr = head.getLinkNext()//

        E tmp = get (index);

        for (int i = 1; i <= size; i++) {

            if (i == index) {

                Node<E> p = ptr.prev;//ptr.getLinkPrev();

                Node<E> n = ptr.next;//ptr.getLinkNext();

                p.next = n;//p.setLinkNext(n);

                n.prev = p;//n.setLinkPrev(p);

                indices.remove(index);

                size--;

            }

            ptr = ptr.next;//ptr.getLinkNext();

        }

        return tmp;

    }

    /* Function to remove the first elem in list */

    public boolean remove(E elem){

        Node<E> ptr = head.next;

        for (int i = 1; i <= size; i++) {

            if (ptr.data == elem) {

                Node<E> p = ptr.prev;//ptr.getLinkPrev();

                Node<E> n = ptr.next;//ptr.getLinkNext();

                p.next = n;//p.setLinkNext(n);

                n.prev = p;//n.setLinkPrev(p);

                indices.remove(i - 1);

                size--;

                return true;

            }

            ptr = ptr.next;//ptr.getLinkNext();

        }

        return false;
    }

    /* Function to display status of list */

    public String mytoString() {
        StringBuilder s = new StringBuilder();
    for(Node n:indices ){
        s.append(n.data.toString()).append(',');
    }
    s = new StringBuilder(s.substring(0, s.length() - 1));

    return s.toString();
    }

      

}

/* Class DoublyLinkedList */

