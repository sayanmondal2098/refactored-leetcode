class P876 {
    public ListNode middleNode(ListNode head) {
        // get the length of the linked list
        int len = 0;
        ListNode current = head;
        while (current != null) {
            len++;
            current = current.next;
        }
        current = head;
        int mid = len / 2;
        for (int i = 0; i < mid; i++) {
            current = current.next;
        }
        return current;
    }
    }