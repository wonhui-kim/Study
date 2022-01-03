//트리2
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#define TRUE 1
#define FALSE 0

typedef struct TreeNode {
	int key;
	struct TreeNode* left, * right;
} TreeNode;

TreeNode* insert_node(TreeNode* root, int key)
{
	TreeNode * p, *t; // p는 부모노드, t는 현재노드 
	TreeNode* n;	    // n은 새로운 노드

	t = root;
	p = NULL;

	while (t != NULL) { // 현재노드가 NULL이 될때까지
			//if( key == t->key ) return;
			p = t; // 현재노드를 부모노드로 하고
				// 현재노드를 전진
				if (key < t->key)
				t = t->left;
			else
				t = t->right;
		}

	n = (TreeNode*)malloc(sizeof(TreeNode));
	if (n == NULL) return;
	// 데이터 복사
	n->key = key;
	n->left = n->right = NULL;

	// 부모 노드와 링크 연결
	if (p != NULL)
		if (key < p->key)
			p->left = n;
		else
			p->right = n;
	else // 애초에 트리가 비어있었으면
			root = n;
	return root;
}

int get_height(TreeNode* node)
{
	int hLeft;
	int hRight;

	if (node == NULL)
		return 0;

	hLeft = get_height(node->left);
	hRight = get_height(node->right);

	return (hLeft > hRight) ? hLeft + 1 : hRight + 1;
}

int isBalanced(TreeNode* node) //제출
{
	// 작성
	if (node == NULL)
		return TRUE;

	if (get_height(node->left) - get_height(node->right) <= 1
		&& get_height(node->left) - get_height(node->right) >= -1
		&& get_height(node->left) && get_height(node->right))
		return TRUE;

	return FALSE;
}

int main(void)
{
	int n, key;
	TreeNode* root = NULL;
	int i;

	for (i = 0; i < 3; i++) { // 세번을 반복해서 검사
		root = NULL;

		// 트리를 만든다
		scanf("%d", &n);
		while (n != -1) {
			root = insert_node(root, n);
			scanf("%d", &n);
		}
		printf("%d\n", isBalanced(root));
	}
}
