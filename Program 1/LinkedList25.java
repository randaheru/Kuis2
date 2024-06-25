public class LinkedList25 {
    private LinkedListNode25 head;

    public LinkedList25() {
        this.head = null;
    }

    public void add(Mahasiswa25 data) {
        LinkedListNode25 newNode = new LinkedListNode25(data);
        if (head == null) {
            head = newNode;
        } else {
            LinkedListNode25 temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void delete(String nim) {
        if (head == null) return;

        if (head.data.getNim().equals(nim)) {
            head = head.next;
            return;
        }

        LinkedListNode25 temp = head;
        while (temp.next != null && !temp.next.data.getNim().equals(nim)) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    public Mahasiswa25 get(String nim) {
        LinkedListNode25 temp = head;
        while (temp != null) {
            if (temp.data.getNim().equals(nim)) {
                return temp.data;
            }
            temp = temp.next;
        }
        return null;
    }

    public void printAll() {
        LinkedListNode25 temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
