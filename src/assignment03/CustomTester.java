package assignment03;

import assignment03.WordTree.WordTreeNode;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class CustomTester {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();



		//Collections.addAll(list, "a", "and", "ax", "dog", "door", "dot");
		//Collections.addAll(list, "a", "and", "tod", "ax", "door", "dot", "a");
		//System.out.print(list.toString());
		WordTree   tree = new WordTree();
		tree.insert("a");
		tree.insert("and");
		//tree.loadWords(list);
		System.out.print(tree.getPrefix("and"));
	}
}
