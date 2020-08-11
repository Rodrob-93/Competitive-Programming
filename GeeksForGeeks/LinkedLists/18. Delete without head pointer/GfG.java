/*
class Node
{
	int data ;
	Node next;
	Node(int d)
	{
		data = d;
		next = null;
	}
}
*/

// This function should delete node from linked list. The function
// may assume that node exists in linked list and is not last node
// node: reference to the node which is to be deleted

class GfG
{
    void deleteNode(Node node)
    {
        while(node.next.next!=null){
            node.data = node.next.data;
            node = node.next;
        }
        node.data = node.next.data;
        node.next = null;
    }
}