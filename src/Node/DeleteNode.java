package Node;

/**
 * 删除链表中的节点
 * @author grady
 * @date 20-6-2 上午11:12
 */
public class DeleteNode {
    public static void main(String[] args) {
        DeleteNode deleteNode = new DeleteNode();
        deleteNode.addNode(5);
        deleteNode.addNode(3);
        deleteNode.addNode(2);
        System.out.println(deleteNode.len());
        System.out.println("head:"+deleteNode.head.data);
        deleteNode.printList();
        deleteNode.deleteByIndex(2);
        deleteNode.printList();
    }
    Node head = null;//头结点
    class Node{
        Node next = null;//节点的引用，指向下一个节点
        int data;//节点的对象
        public Node(int data){
            this.data = data;
        }
    }

    /**
     * 删除第index节点
     * @param index
     * @return
     */
    public boolean deleteByIndex(int index){
        if (index < 1 || index >len()){
            return false;
        }
        if (index == 1){
            head = head.next;
            return true;
        }
        int i = 1;
        Node preNode = head;
        Node curNode = preNode.next;
        while (curNode != null){
            if (i == index){
                preNode.next = curNode.next;
                return true;
            }
            preNode = curNode;
            curNode = curNode.next;
            i++;
        }
        return false;
    }

    /**
     * 增加一个节点
     * @param data
     */
    public void addNode(int data){
        Node node = new Node(data);//实例化一个节点
        if (head == null){
            head = node;
            return;
        }
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
    }

    public int len(){
        int length = 0;
        Node temp = head;
        while (temp != null){
            length++;
            temp = temp.next;
        }
        return length;
    }

    public void printList(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data);
            temp = temp.next;
        }
    }

    public boolean delete(Node node){
        if (node == null || node.next == null){
            return false;
        }
        int temp = node.data;
        node.data = node.next.data;
        node.next.data = temp;
        node.next = node.next.next;
        System.out.println("删除成功");
        return true;
    }
}
