public class Builder {
    public void print(ListNode start){
        ListNode current = start;
        while (current.next != null){
            System.out.println(current.toString());
            current = current.next;
        }
        System.out.println(current.toString());
    }
    public void print(ListNode start, int element){
        ListNode current = start;
        int i = 0;
        int out = 0;
        while (current.next != null){
            if (i == element){
                System.out.println(current.toString());
                out++;
                break;
            }
            current = current.next;
            i++;
        }
        if (out == 0){
            System.out.println(current.toString());
        }
    }
    public void add(ListNode start, String fName, String lName, String adress, String city, String phoneNumber){
        ListNode send = start;
        while (send.next != null){
            send = send.next;
        }
        send.next = new ListNode(fName, lName, adress, city, phoneNumber);
    }
    public void add(ListNode start, String fName, String lName, String adress, String city, String phoneNumber, int location){ //extension of the add method (makes location a optional parameter)
        ListNode current = start;
        int i = 0;
        int out = 0;
        while (current.next != null){
            if (i == location){
                current.next = new ListNode("", fName, lName, adress, city, phoneNumber, current.next);
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
            current.next =  new ListNode(fName, lName, adress, city, phoneNumber, current.next);
        }
    }
    public void remove(ListNode start, int location){
        ListNode current = start;
        int i = 0;
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
    public void set(ListNode start, String fName, String lName, String adress, String city, String phoneNumber, int location){
        ListNode current = start;
        int i = 0;
        int out = 0;
        while (current.next != null){
            if (i == location){
                if (fName != current.fName){
                    current.fName = fName;
                }
                if (lName != current.lName){
                    current.lName = lName;
                }
                if (adress != current.adress){
                    current.adress = adress;
                }
                if (city != current.city){
                    current.city = city;
                }
                if (phoneNumber != current.phoneNumber){
                    current.phoneNumber = phoneNumber;
                }
                break;
            }
            i++;
            current = current.next;
        }
        if (i == location){
            if (fName != current.fName){
                current.fName = fName;
            }
            if (lName != current.lName){
                current.lName = lName;
            }
            if (adress != current.adress){
                current.adress = adress;
            }
            if (city != current.city){
                current.city = city;
            }
            if (phoneNumber != current.phoneNumber){
                current.phoneNumber = phoneNumber;
            }
        }
    }
    
}
