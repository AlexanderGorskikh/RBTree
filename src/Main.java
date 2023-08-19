import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		//		final RBTree testTree = new RBTree();
//		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
//			while (true) {
//				int key = Integer.parseInt(reader.readLine());
//				testTree.add(key);
//				System.out.println("finish");
//			}
//		} catch (Exception e) {
//
//		}
		RBTree tree = new RBTree();
		tree.add(5);
		tree.add(7);
		tree.add(10);
		tree.add(2);
		tree.printTree();
	}
}
