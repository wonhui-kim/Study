//트리1
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
	TreeNode* p, * t; // p는 부모노드, t는 현재노드 
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

int calculate_bigger_value(TreeNode* node, int key) //제출
{
	static int value = 0;

	if (node != NULL)
	{
		if (node->key > key || node->key == key)
			value += node->key;
		calculate_bigger_value(node->left, key);
		calculate_bigger_value(node->right, key);
	}

	return value;
}

int main(void)
{
	int n, key;

	TreeNode* root = NULL;

	scanf("%d", &n);
	while (n != -1) {
		root = insert_node(root, n);
		scanf("%d", &n);
	}

	scanf("%d", &key);
	printf("%d\n", calculate_bigger_value(root, key));
}

