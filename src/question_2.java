/*
 * 文件名：question_2.java
 * 版权：Copyright 2018-2019 Love. Co. Ltd. All Rights Reserved.
 * 描述：sunshine
 * 修改人：sunshine
 * 修改时间：2020年06月27日
 * 系统名称：leetcode-test
 */

import com.sun.tools.javac.util.StringUtils;

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
        ListNode node6 = new ListNode(4);

        node4.next = node5;
        node5.next = node6;
        addTwoNumbers(node1, node4);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode currentNode = l1;
        while (currentNode.next != null) {

        }
        return null;
    }
}