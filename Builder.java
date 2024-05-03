public class Builder {
    public void print(ListNode start){
        ListNode current = start;
        while (current.next != null){
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println(current.data);
    }
    public void print(ListNode start, int element){
        ListNode current = start;
        int i = 1;
        while (current.next != null){
            if (i == element){
                System.out.println(current.data);
                break;
            }
            current = current.next;
            i++;
        }
    }
    public void add(ListNode start, int data){
        ListNode send = start;
        while (send.next != null){
            send = send.next;
        }
        send.next = new ListNode(data);
    }
    public void add(ListNode start, int data, int location){ //extension of the add method (makes location a optional parameter)
        ListNode current = start;
        int i = 1;
        int out = 0;
        while (current.next != null){
            if (i == location){
                current.next = new ListNode(data, current.next);
                out++;
                break;
            }
            if (out == 0){
                i++;
            }
            i++;
            current = current.next;
        }
        if (out != 1){
            current.next =  new ListNode(data, current.next);
        }
    }
    public void remove(ListNode start, int location){
        ListNode current = start;
        int i = 1;
        int out = 0;
        while (current.next != null){
            if (i == location){
                current.next = current.next.next;
                out++;
                break;
            }
            if (out == 0){
                i++;
            }
            i++;
            current = current.next;
        }
        if (out == 0){
            current.next = null;
        }
    }
}
