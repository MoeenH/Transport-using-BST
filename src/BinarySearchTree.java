public class BinarySearchTree {
    NodeBus root;
    NodeBus[] Distance = new NodeBus[100];
    int count = 1;
    int count2 = 1;


    public void insertByDistance(NodeBus N) {

        if (root == null) {
            root = N;
        } else {
            NodeBus temp = root;
            NodeBus prev = root;
            while (temp != null) {
                if (N.distance >= temp.distance) {
                    prev = temp;
                    temp = temp.right;
                } else {
                    prev = temp;
                    temp = temp.left;
                }
            }
            if (N.distance >= prev.distance) {
                prev.right = N;
            } else {
                prev.left = N;
            }
        }
    }






    public void TraverseLNR(NodeBus node) {
        if (node == null) {
            return;
        }
        TraverseLNR(node.left);
        Distance[count] = node;
        System.out.println(count + " => " + " Name : " + node.name + ", Distance : " + node.distance + " , Location : " + node.location);
        count++;
        TraverseLNR(node.right);
    }

    public NodeBus findNode(NodeBus N, Double distance) {

        if (N == null) {
            System.out.println("The element does not exist");
            return null;
        }
        if (N.distance.compareTo(distance) == 0) {
            return N;
        }
        if (N.distance.compareTo(distance) > 0) {
            return findNode(N.left, distance);
        } else {
            return findNode(N.right, distance);
        }
    }
}

