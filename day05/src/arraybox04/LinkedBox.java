package arraybox04;

public class LinkedBox implements Box {

    // 创建几个属性
    private Node first; // 记录首节点
    private Node last; // 记录尾节点
    private int size; // 记录有效元素的个数

    public boolean add(int element) {
        // 将 element 存入一个新的 Node 对象里 添加至链表的尾端
        this.linkLast(element);
        // 告知添加成功
        return true;
    }


    public int get(int index) {
        // 检测 index 是否合法
        rangeCheck(index);
        Node targetNode = node(index);
        return targetNode.item;
    }


    public int remove(int index) {
        // 检测 index 是否合法
        rangeCheck(index);
        Node targetNode = this.node(index);
        // 删除当前的目标节点
        int oldValue = unlink(targetNode);
        return oldValue;
    }


    public int size() {
        return size;
    }

    // 负责将元素添加在新的node里 挂在链表的尾端
    private void linkLast(int element) {
        // 获取链表的尾节点
        // 创建一个新的node对象 将新数据包装起来
        Node newNode = new Node(last, element, null);
        // 将新节点对象设置为尾节点
        last = newNode;
        // 严谨的判断
        if (last == null) {
            // 如果原来尾节点没有对象 证明这个链表没有使用过的
            first = newNode;
        } else {
            // 原来用过 刚在已经将新的节点连接在last之后了
            // 原来尾节点的下一个节点
            last.next = newNode;
        }
        size++;
    }

    private void rangeCheck(int index) {
        if (index < 0 || index >= size) {
            throw new BoxIndexOutOfBoundsException("Index" + index + "Size" + size);
        }
    }

    // 负责找寻给定index位置的node对象
    private Node node(int index) {
        Node targetNode; //找到存储的当前的那个目标
        // 判断index范围，是在前半部分 还是在后半部分
        if (index < (size >> 1)) {
            // 从前往后找 比较快
            targetNode = first;
            for (int i = 0; i < index; i++) {
                targetNode = targetNode.next;
            }
        } else {
            // 从后往前找
            targetNode = last;
            for (int i = size - 1; i > index; i++) {
                targetNode = targetNode.prev;
            }
        }
        return targetNode;
    }

    private int unlink(Node targetNode) {
        //获取当前node item 信息
        int oldValue = targetNode.item;
        // 当前node的前一个
        Node prev = targetNode.prev;
        // 当前node的下一个
        Node next = targetNode.next;

        if (prev == null) {
            // 我就是第一个
            first = next;
        } else {
            prev.next = next;
        }

        if (next == null) {
            // 我就是最后一个
            last = prev;
        } else {
            next.prev = prev;
        }

        size--;

        return oldValue;
    }
}
