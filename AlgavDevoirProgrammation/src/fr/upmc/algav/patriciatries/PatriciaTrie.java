package fr.upmc.algav.patriciatries;

import java.util.ArrayList;

import fr.upmc.algav.hybridtries.IHybridTrie;
import fr.upmc.algav.interfaces.ITrie;

public class PatriciaTrie implements IPatriciaTrie {

	private PatriciaTreeNode rootNode;
	private final Alphabet usedAlphabet;

	public PatriciaTrie(Alphabet usedAlphabet) {
		this.usedAlphabet = usedAlphabet;
		//this.rootNode = new PatriciaTreeNode(usedAlphabet.getNodeArity());
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void insert(String word) {
		if (isEmpty()) {

		}
	}
	
	@Override
	public void insert(ArrayList<String> words) {
		for (String word : words) {
			insert(word);
		}
	}
	
	@Override
	public boolean search(String word) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int countWords() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public ArrayList<String> listWords() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countNull() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int height() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float averageDepth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int prefix(String word) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ITrie remove(String word) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void print(String FileName) {
		// TODO Auto-generated method stub
	}

	@Override
	public IPatriciaTrie merge(IPatriciaTrie trie1, IPatriciaTrie trie2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IHybridTrie toHybridTrie() {
		// TODO Auto-generated method stub
		return null;
	}
}