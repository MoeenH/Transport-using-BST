public class NodeBus {

    NodeBus left;
    NodeBus right;
    String name;
    String location;
    Double distance;

    linklist routes = new linklist();

    public NodeBus(String name, String location, Double distance) {
        this.name = name;
        this.location = location;
        this.distance = distance;
    }

    public String toString() {
        return
                "Name : " + this.name + ", Distance : " + this.distance + " " + " , Location : "+ this.location+ " "+routes;
    }
}

