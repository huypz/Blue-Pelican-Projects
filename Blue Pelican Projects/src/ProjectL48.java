import java.nio.channels.Pipe;
import java.util.ArrayList;

public class ProjectL48 {
    private static PipelineNode headNode = null;
    private static PipelineNode tailNode = null;

    public static void main(String[] args) {
        //Creation of the nodes
        append(0, "Pump station");
        append(3050, "Hwy 35");
        append(4573, "Kerr");
        append(5623, "Tank farm");
        append(6542, "Taylor"); //3050 + 990 + 553 = 4573

        traverseAndPrint();
        System.out.println("******* now insert a node before old node 2 *******\n");
        insert(4040, "Cold Creek", 0); // 3050 + 990 = 4040
        traverseAndPrint();
    }

    public static void insert(int pos, String descr, int indx) {
        PipelineNode currentNode = headNode;
        if (indx == 0) {
            PipelineNode newNode = new PipelineNode(pos, descr, currentNode);
            headNode = newNode;
        }
        else {
            // Traverse until indexed node is found
            int nodeNum = 0;
            while (nodeNum < indx - 1) {
                currentNode = currentNode.nextNode;
                nodeNum++;
            }

            PipelineNode newNode = new PipelineNode(pos, descr, currentNode.nextNode);
            currentNode.nextNode = newNode;
        }
    }

    //append a new node to the end of the list and adjust pointers
    public static void append(int pos, String descr) {
        PipelineNode newNode = new PipelineNode(pos, descr, null);
        if(headNode == null) {
            headNode = newNode;
        }
        else {
            tailNode.nextNode = newNode; //update the old tailNode
        }
        tailNode = newNode; //specify a new tailNode
    }

    public static void traverseAndPrint( ) {
        PipelineNode currentNode = headNode;
        int nodeNum = -1;
        do {
            nodeNum++;
            System.out.println("Node number: " + nodeNum);
            System.out.println("Position: " + currentNode.position);
            System.out.println("Description: " + currentNode.description);
            System.out.println(""); //gives a blank line between nodes
            currentNode = currentNode.nextNode;
        } while (currentNode != null); //We don't need to know ahead of time how many
    }
}

class PipelineNode {
    public int position;
    public String description;
    public PipelineNode nextNode;

    public PipelineNode(int pos, String descr, PipelineNode ptr) {
        position = pos;
        description = descr;
        nextNode = ptr;
    }
}
