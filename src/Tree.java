import java.util.ArrayList;
import java.util.List;

public class Tree {
    
	private Node root;

	
    public Tree(HiRiQ rootData) {
        root = new Node(rootData);

    }
    
	public static void main(String[] args) {
	
		HiRiQ inputObject = new HiRiQ((byte) 0);
		inputObject.print();
		

		
		/*
		boolean[] B = new boolean[33];
		HiRiQ W = new HiRiQ((byte) 0);
		W.print();
		System.out.println(W.IsSolved());
		HiRiQ X = new HiRiQ((byte) 1);
		X.print();
		System.out.println(X.IsSolved());
		HiRiQ Y = new HiRiQ((byte) 2);
		Y.print();
		System.out.println(Y.IsSolved());
		HiRiQ Z = new HiRiQ((byte) 3);
		Z.print();
		System.out.println(Z.IsSolved());
		HiRiQ V = new HiRiQ((byte) 4);
		V.print();
		System.out.println(V.IsSolved());
		B=V.load(B);
		for (int i=0; i<33; i++){B[i]= !B[i];};
		V.store(B); V.print(); System.out.println(V.IsSolved());
		*/
		
	   


	    

	}
}