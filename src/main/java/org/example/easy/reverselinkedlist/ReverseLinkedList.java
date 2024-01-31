package org.example.easy.reverselinkedlist;

    public class ReverseLinkedList {
        int val;
        ReverseLinkedList next;

        ReverseLinkedList(int val) {
            this.val = val;
        }

        ReverseLinkedList(int val, ReverseLinkedList next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return  val +
                    "=" + next
                    ;
        }

        public static void main(String[] args) {
            ReverseLinkedList first = new ReverseLinkedList(5);
            ReverseLinkedList second = new ReverseLinkedList(4, first);
            ReverseLinkedList third = new ReverseLinkedList(3, second);
            ReverseLinkedList forth = new ReverseLinkedList(2, third);
            ReverseLinkedList finish = new ReverseLinkedList(1, forth);
            System.out.println(finish);
            System.out.println(reverseList(finish));
        }

        public static ReverseLinkedList reverseList(ReverseLinkedList head) {

            ReverseLinkedList previous = null;
            ReverseLinkedList current = head;
            while (current != null) {
                ReverseLinkedList nextElement = current.next;
                current.next = previous;
                previous = current;
                current = nextElement;
            }
            return previous;
        }

    }