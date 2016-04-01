import java.util.ArrayList;
import java.util.List;

public class Node {
        private HiRiQ data;
        private Node parent;
        private List<Node> children;
        
        public Node(HiRiQ data){
        	this.data = data;
        	parent = null;
        	children = new ArrayList<Node>();
        }
    }