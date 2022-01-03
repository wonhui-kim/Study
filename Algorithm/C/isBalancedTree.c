//Ʈ��2
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
	TreeNode * p, *t; // p�� �θ���, t�� ������ 
	TreeNode* n;	    // n�� ���ο� ���

	t = root;
	p = NULL;

	while (t != NULL) { // �����尡 NULL�� �ɶ�����
			//if( key == t->key ) return;
			p = t; // �����带 �θ���� �ϰ�
				// �����带 ����
				if (key < t->key)
				t = t->left;
			else
				t = t->right;
		}

	n = (TreeNode*)malloc(sizeof(TreeNode));
	if (n == NULL) return;
	// ������ ����
	n->key = key;
	n->left = n->right = NULL;

	// �θ� ���� ��ũ ����
	if (p != NULL)
		if (key < p->key)
			p->left = n;
		else
			p->right = n;
	else // ���ʿ� Ʈ���� ����־�����
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

int isBalanced(TreeNode* node) //����
{
	// �ۼ�
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

	for (i = 0; i < 3; i++) { // ������ �ݺ��ؼ� �˻�
		root = NULL;

		// Ʈ���� �����
		scanf("%d", &n);
		while (n != -1) {
			root = insert_node(root, n);
			scanf("%d", &n);
		}
		printf("%d\n", isBalanced(root));
	}
}
