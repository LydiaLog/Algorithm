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
		// 생성자
	}

	public BinaryTree(Object data) {
		this.llink = null;
		this.data = data;
		this.rlink = null;
		// 생성자
	}

	public BinaryTree(BinaryTree llink, Object data, BinaryTree rlink) {
		this.llink = llink;
		this.data = data;
		this.rlink = rlink;
		// 생성자
	}

	public boolean isEmpty(BinaryTree btree) {
		if (btree == null) {
			return true;
		} else {
			return false;
		}
		// 비었는지검사
	}

	public BinaryTree leftSubTree(BinaryTree btree) {
		if (isEmpty(btree) == true) {
			return null;
		} else {
			return btree.llink;
		}
		// 왼쪽 서브 반환
	}

	public BinaryTree rightSubTree(BinaryTree btree) {
		if (isEmpty(btree) == true) {
			return null;
		} else {
			return btree.rlink;
		}
		// 오른쪽 서브 반환
	}

	public Object rootData(BinaryTree btree) {
		if (isEmpty(btree) == true) {
			return null;
		} else {
			return btree.data;
		}
		// 루트 데이타 반환
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
			//빈칸을 채우세요  
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
	    return llink == null && rlink == null;// 빈칸9: 왼쪽 링크와 오른쪽 링크가 null인지 확인
	} // end of isLeaf
	
	public int size() {
		// 빈칸10: 왼쪽 링크와 오른쪽 링크가 null이면 반환값 1
	    if(llink == null && rlink == null) return 1;
	    // 빈칸11: 왼쪽 링크만 null이면 오른쪽 링크의 크기와 루트의 크기(1)을 더해서 반환
	    if(llink == null) return 1 + rlink.size();
	    // 빈칸12: 오른쪽 링크만 null이면 왼쪽 링크의 크기와 루트의 크기(1)을 더해서 반환
	    if(rlink == null) return 1 + llink.size(); 
		// 빈칸13: 왼쪽, 오른쪽 링크 둘 다 null이 아니라면 왼쪽+오른쪽+루트 크기 반환
	    return 1 + llink.size() + rlink.size();
	  }  // end of size

	public int height() {
		// 빈칸14: 왼쪽 링크와 오른쪽 링크가 null이면 반환값 0
		 if(llink == null && rlink == null) return 0;
		// 빈칸15: 왼쪽 링크가 null이라면 오른쪽 링크의 높이+1
		 if(llink == null) return rlink.height() + 1;
		// 빈칸16: 오른쪽 링크가 null이라면 왼쪽 링크의 높이+1
		 if(rlink == null) return llink.height() + 1;
	    return 1 + Math.max(llink.height(), rlink.height());
	  } // end of height 

	public int numLeaves() {
	    if (llink==null && rlink==null) return 1;
	    if (llink==null) return rlink.numLeaves();
	    // 빈칸 17: 오른쪽 링크가 null이면 왼쪽 링크의 numLeaves 호출
	    if(rlink == null) return llink.numLeaves();
	    // 빈칸 18: 왼쪽, 오른쪽 링크가 null이 아니면 왼쪽과 오른쪽 링크의 numLeaves를 더함
	    if(llink != null && rlink != null) return llink.numLeaves() + rlink.numLeaves();
		return 0;
	  }  // end of numLeaves
	
	private void printNode(BinaryTree T) {
		if (T != null) {
			// 빈칸15: 왼쪽괄호 출력 
			System.out.print("( ");
			// 빈칸16: printNode를 이용해 이진트리의 왼쪽 서브트리 호출
			printNode(T.llink);
			// 빈칸17: 이진트리의 데이터 출력
			System.out.print(T.data);
			// 빈칸18: printNode를 이용해 이진트리의 오른쪽 서브트리 호출
			printNode(T.rlink);
			// 빈칸19: 오른쪽괄호 출력
			System.out.print(" )");
		}
	}

	public void printBST() {
		// 빈칸20: printNode를 이용해 이진트리 출력
		printNode(btree);
		System.out.println();
	}
	
	

	// ////////////////////////////////////////////////////////////////
	// 이진 탐색트리 //
	// ////////////////////////////////////////////////////////////////
	private BinaryTree insertKey(BinaryTree T, String x) {
		// 공백노드일시 최상위 노드에 삽입
		if (isEmpty(T)) {
			// 빈칸9: 왼쪽, 오른쪽 링크는 null로 데이터는 x인 이진트리 생성
			BinaryTree newNode = new BinaryTree(null, x, null);
			// 빈칸10: 이진트리 반환
			return newNode;
		}
		// 입력된 문자열이 data보다 작으면 왼쪽 링크에 삽입
		else if (x.compareTo((String) T.data) < 0) {
			// 빈칸11: 왼쪽 링크에 다시 insertKey를 사용하여 반환값 저장
			T.llink = insertKey(T.llink, x);
			return T;
		}
		// 입력된 문자열이 data보다 크면면 오른쪽 링크에 삽입
		else if (x.compareTo((String) T.data) > 0) {
			// 빈칸12: 오른쪽 링크에 다시 insertKey를 사용하여 반환값 저장
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
			// 비교를 해서 data보다 작음으로 왼쪽 링크를 쫒아감.
			if ((result = x.compareTo((String) T.data)) < 0) {
				// 빈칸13: 왼쪽 링크 쫓아감
				T = T.llink;
			}
			// 비교를 해서 data와 같으므로 검색된 data를 반환함.
			else if (result == 0) {
				return T;
			}
			// 비교를 해서 data보다 큼으로 오른쪽 링크를 쫒아감.
			else {
				// 빈칸14: 오른쪽 링크 쫓아감
				T = T.rlink;
			}
		}
		return T;
	}
} // end of BinaryTree class
