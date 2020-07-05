/*
 * 文件名：question_2.java
 * 版权：Copyright 2018-2019 Love. Co. Ltd. All Rights Reserved.
 * 描述：sunshine
 * 修改人：sunshine
 * 修改时间：2020年06月27日
 * 系统名称：leetcode-test
 */

/**
 * <2. 两数相加>
 * <给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * <p>
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * <p>
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * <p>
 * 示例：
 * <p>
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。>
 *
 * @author sunshine
 * @version 1.0 2020年06月27日
 * @see question_2
 * @since 1.0
 */
public class question_2 {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;
        ListNode node4 = new ListNode(5);
        ListNode node5 = new ListNode(6);
        ListNode node6 = new ListNode(8);

        node4.next = node5;
        node5.next = node6;
        addTwoNumbers(node1, node4);
    }

    /**
     * 逆序存储
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //如果首节点相加大于等于10 ，则需要一个头结点去接收
        //头结点暂定为 0
        ListNode head = new ListNode(0);
        ListNode currentNode = head;
        ListNode currentNodeL1 = l1;
        ListNode currentNodeL2 = l2;
        //设置一个进位标志
        int flag = 0;
        while (currentNodeL1 != null || currentNodeL2 != null) {
            //取出两个链表中的第一个节点（实际是数字最低位），进行相加
            int l1Int = currentNodeL1 == null ? 0 : currentNodeL1.val;
            int l2Int = currentNodeL2 == null ? 0 : currentNodeL2.val;
            int sum = l1Int + l2Int + flag;
            //对10 取模
            flag = sum / 10;
            // 对10 取余 ，为当前节点的求和值
            currentNode.next = new ListNode(sum % 10);
            //逆序，下一节点赋值为当前节点
            currentNode = currentNode.next;

            //不为空取下一节点
            if (currentNodeL1 != null){
                currentNodeL1 = currentNodeL1.next;
            }
            if (currentNodeL2 != null){
                currentNodeL2 = currentNodeL2.next;
            }
        }
        //如果进位不等于0.说明头结点为1
        if (flag!=0){
            currentNode.next=new ListNode(flag);
        }
        return head.next;
    }
}