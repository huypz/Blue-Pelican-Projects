public class ProjectL51 {
    public static void main(String[] args) {
        BST bstObj = new BST(50);
        bstObj.addNode(56);
        bstObj.addNode(52);
        bstObj.addNode(25);
        bstObj.addNode(74);
        bstObj.addNode(54);
        bstObj.traverseAndPrint(bstObj.rootNode);

        System.out.println(bstObj.find(74));
        System.out.println(bstObj.find(13));
    }
}

class BST {
    public BstNode rootNode;

    public BST(int i) {
        rootNode = new BstNode(i);
    }

    public void addNode(int i) {
        BstNode currentNode = rootNode;
        boolean isFinished = false;
        do {
            //Traverse right
            if (i > currentNode.intData) {
                if (currentNode.rightNode == null) {
                    currentNode.rightNode = new BstNode(i);
                    isFinished = true;
                }
                else {
                    currentNode = currentNode.rightNode;
                }
            }
            //Traverse left
            else {
                if (currentNode.leftNode == null) {
                    currentNode.leftNode = new BstNode(i);
                    isFinished = true;
                }
                else {
                    currentNode = currentNode.leftNode;
                }
            }
        } while (!isFinished);
    }

    public void traverseAndPrint(BstNode currentNode) {
        System.out.printf("%-20s", "data=" + currentNode.intData);
        if (currentNode.leftNode == null) {
            System.out.printf("%-20s", "left=null");
        }
        else {
            System.out.printf("%-20s", "left=" + (currentNode.leftNode).intData);
        }

        if (currentNode.rightNode == null) {
            System.out.printf("%-20s", "right=null");
        }
        else {
            System.out.printf("%-20s", "right=" + (currentNode.rightNode).intData);
        }
        System.out.println();
        if (currentNode.leftNode != null) {
            traverseAndPrint(currentNode.leftNode);
        }
        if (currentNode.rightNode != null) {
            traverseAndPrint(currentNode.rightNode);
        }
    }

    public boolean find(int i) {
        BstNode currentNode = rootNode;
        do {
            if (i > currentNode.intData) { //Traverse right
                if (currentNode.rightNode == null) {
                    return false;
                }
                else if (i == (currentNode.rightNode).intData) {
                    return true;
                }
                else {
                    currentNode = currentNode.rightNode;
                }
            }
            else { //Traverse left
                if (currentNode.leftNode == null) {
                    return false;
                }
                else {
                    if (i == (currentNode.leftNode).intData) {
                        return true;
                    }
                    else {
                        currentNode = currentNode.leftNode;
                    }
                }
            }
        } while (true);
    }

}

class BstNode {
    public BstNode rightNode;
    public BstNode leftNode;
    public int intData;

    public BstNode(int i) {
        rightNode = null;
        leftNode = null;
        intData = i;
    }
}