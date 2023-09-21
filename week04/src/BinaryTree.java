// Start of Binary Tree
class BinaryTree {
	BinaryTree llink;
	BinaryTree btree;
	Object data;
	BinaryTree rlink;

	public BinaryTree() {
		llink = null;
		data = null;
		rlink = null;
		// ������
	}

	public BinaryTree(Object data) {
		this.llink = null;
		this.data = data;
		this.rlink = null;
		// ������
	}

	public BinaryTree(BinaryTree llink, Object data, BinaryTree rlink) {
		this.llink = llink;
		this.data = data;
		this.rlink = rlink;
		// ������
	}

	public boolean isEmpty(BinaryTree btree) {
		if (btree == null) {
			return true;
		} else {
			return false;
		}
		// ��������˻�
	}

	public BinaryTree leftSubTree(BinaryTree btree) {
		if (isEmpty(btree) == true) {
			return null;
		} else {
			return btree.llink;
		}
		// ���� ���� ��ȯ
	}

	public BinaryTree rightSubTree(BinaryTree btree) {
		if (isEmpty(btree) == true) {
			return null;
		} else {
			return btree.rlink;
		}
		// ������ ���� ��ȯ
	}

	public Object rootData(BinaryTree btree) {
		if (isEmpty(btree) == true) {
			return null;
		} else {
			return btree.data;
		}
		// ��Ʈ ����Ÿ ��ȯ
	}

	public void inorder(BinaryTree btree) {
		if (btree == null)
			return;

		inorder(btree.llink);
		System.out.print(btree.data + " ");
		inorder(btree.rlink);
	} // End of inorder

	public void preorder(BinaryTree btree) {
		if (btree == null)
			return;

		System.out.print(btree.data + " ");
		preorder(btree.llink);
		preorder(btree.rlink);

	} // End of Preorder

	public void postorder(BinaryTree btree) {
		if (btree == null)
			return;

		postorder(btree.llink);
		postorder(btree.rlink);
		System.out.print(btree.data + " ");
	} // end of inorder

	public BinaryTree copy(BinaryTree btree) {
		BinaryTree Stree;

		Stree = new BinaryTree();
		if (btree == null)
			Stree = null;
		else {
			//��ĭ�� ä�켼��  
			Stree.llink = copy(btree.llink);
			Stree.rlink = copy(btree.rlink);
			Stree.data = btree.data;
		}
		return Stree;
	} // end of copy

	public boolean equal(BinaryTree btree, BinaryTree ctree) {
		boolean ans = false;
		if ((btree == null) && (ctree == null)) {
			ans = true;
		} else if ((btree != null) && (ctree != null)) {
			if (btree.data == ctree.data) {
				ans = equal(btree.llink, ctree.llink);
			}
			if (ans) {
				ans = equal(btree.rlink, ctree.rlink);
			}
		}
		return ans;
	} // end of equal

	public BinaryTree swap(BinaryTree btree) {
		BinaryTree Stree;
		BinaryTree ltree;
		BinaryTree rtree;

		Stree = null;
		// Try it !!
		// Stree = new BinaryTree();
		if (btree != null) {
			ltree = swap(btree.rlink);
			rtree = swap(btree.llink);
			Stree = new BinaryTree(ltree, btree.data, rtree);
		}
		return Stree;
	} // end of swap
	
	public boolean isLeaf() {
	    return llink == null && rlink == null;// ��ĭ9: ���� ��ũ�� ������ ��ũ�� null���� Ȯ��
	} // end of isLeaf
	
	public int size() {
		// ��ĭ10: ���� ��ũ�� ������ ��ũ�� null�̸� ��ȯ�� 1
	    if(llink == null && rlink == null) return 1;
	    // ��ĭ11: ���� ��ũ�� null�̸� ������ ��ũ�� ũ��� ��Ʈ�� ũ��(1)�� ���ؼ� ��ȯ
	    if(llink == null) return 1 + rlink.size();
	    // ��ĭ12: ������ ��ũ�� null�̸� ���� ��ũ�� ũ��� ��Ʈ�� ũ��(1)�� ���ؼ� ��ȯ
	    if(rlink == null) return 1 + llink.size(); 
		// ��ĭ13: ����, ������ ��ũ �� �� null�� �ƴ϶�� ����+������+��Ʈ ũ�� ��ȯ
	    return 1 + llink.size() + rlink.size();
	  }  // end of size

	public int height() {
		// ��ĭ14: ���� ��ũ�� ������ ��ũ�� null�̸� ��ȯ�� 0
		 if(llink == null && rlink == null) return 0;
		// ��ĭ15: ���� ��ũ�� null�̶�� ������ ��ũ�� ����+1
		 if(llink == null) return rlink.height() + 1;
		// ��ĭ16: ������ ��ũ�� null�̶�� ���� ��ũ�� ����+1
		 if(rlink == null) return llink.height() + 1;
	    return 1 + Math.max(llink.height(), rlink.height());
	  } // end of height 

	public int numLeaves() {
	    if (llink==null && rlink==null) return 1;
	    if (llink==null) return rlink.numLeaves();
	    // ��ĭ 17: ������ ��ũ�� null�̸� ���� ��ũ�� numLeaves ȣ��
	    if(rlink == null) return llink.numLeaves();
	    // ��ĭ 18: ����, ������ ��ũ�� null�� �ƴϸ� ���ʰ� ������ ��ũ�� numLeaves�� ����
	    if(llink != null && rlink != null) return llink.numLeaves() + rlink.numLeaves();
		return 0;
	  }  // end of numLeaves
	
	private void printNode(BinaryTree T) {
		if (T != null) {
			// ��ĭ15: ���ʰ�ȣ ��� 
			System.out.print("( ");
			// ��ĭ16: printNode�� �̿��� ����Ʈ���� ���� ����Ʈ�� ȣ��
			printNode(T.llink);
			// ��ĭ17: ����Ʈ���� ������ ���
			System.out.print(T.data);
			// ��ĭ18: printNode�� �̿��� ����Ʈ���� ������ ����Ʈ�� ȣ��
			printNode(T.rlink);
			// ��ĭ19: �����ʰ�ȣ ���
			System.out.print(" )");
		}
	}

	public void printBST() {
		// ��ĭ20: printNode�� �̿��� ����Ʈ�� ���
		printNode(btree);
		System.out.println();
	}
	
	

	// ////////////////////////////////////////////////////////////////
	// ���� Ž��Ʈ�� //
	// ////////////////////////////////////////////////////////////////
	private BinaryTree insertKey(BinaryTree T, String x) {
		// �������Ͻ� �ֻ��� ��忡 ����
		if (isEmpty(T)) {
			// ��ĭ9: ����, ������ ��ũ�� null�� �����ʹ� x�� ����Ʈ�� ����
			BinaryTree newNode = new BinaryTree(null, x, null);
			// ��ĭ10: ����Ʈ�� ��ȯ
			return newNode;
		}
		// �Էµ� ���ڿ��� data���� ������ ���� ��ũ�� ����
		else if (x.compareTo((String) T.data) < 0) {
			// ��ĭ11: ���� ��ũ�� �ٽ� insertKey�� ����Ͽ� ��ȯ�� ����
			T.llink = insertKey(T.llink, x);
			return T;
		}
		// �Էµ� ���ڿ��� data���� ũ��� ������ ��ũ�� ����
		else if (x.compareTo((String) T.data) > 0) {
			// ��ĭ12: ������ ��ũ�� �ٽ� insertKey�� ����Ͽ� ��ȯ�� ����
			T.rlink = insertKey(T.rlink, x);
			return T;
		} 
		else {
			return T;
		}
	}

	public void insert(String x) {
		btree = insertKey(btree, x);
	}

	public BinaryTree find(String x) {
		BinaryTree T = btree;
		int result;

		while (T != null) {
			// �񱳸� �ؼ� data���� �������� ���� ��ũ�� �i�ư�.
			if ((result = x.compareTo((String) T.data)) < 0) {
				// ��ĭ13: ���� ��ũ �Ѿư�
				T = T.llink;
			}
			// �񱳸� �ؼ� data�� �����Ƿ� �˻��� data�� ��ȯ��.
			else if (result == 0) {
				return T;
			}
			// �񱳸� �ؼ� data���� ŭ���� ������ ��ũ�� �i�ư�.
			else {
				// ��ĭ14: ������ ��ũ �Ѿư�
				T = T.rlink;
			}
		}
		return T;
	}
} // end of BinaryTree class
