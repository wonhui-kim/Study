//�׷��� ����
#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>
#include <stdlib.h>

#define TRUE 1
#define FALSE 0
#define MAX_VERTICES 10

int visited[MAX_VERTICES];

typedef struct GraphNode
{
	int vertex;
	struct GraphNode* link;
} GraphNode;

typedef struct GraphType {
	int n;	// ������ ����
	GraphNode* adj_list[MAX_VERTICES];
} GraphType;

void graph_init(GraphType* g)
{
	int v;
	g->n = 0;
	for (v = 0; v < MAX_VERTICES; v++)
		g->adj_list[v] = NULL;
}

void insert_edge(GraphType* g, int u, int v) // *����*�׷����� ���� ����
{
	GraphNode* node;
	if (u >= g->n || v >= g->n) {
		fprintf(stderr, "�׷���: ���� ��ȣ ����");
		return;
	}
	node = (GraphNode*)malloc(sizeof(GraphNode));
	node->vertex = v;
	node->link = g->adj_list[u];
	g->adj_list[u] = node;
}

int is_edge_in(GraphType* g, int u, int v) //����
{
	// �ۼ�

	GraphNode* node = g->adj_list[u];

	if (u >= g->n || v >= g->n) {
		fprintf(stderr, "�׷���: ���� ��ȣ ����");
		return;
	}

	while (node != NULL) {
		if (node->vertex == v)
			return 1;
		node = node->link;
	}

	return 0;
}

int main(void)
{
	GraphType g;
	int u, v;
	int i;

	graph_init(&g);
	scanf("%d", &g.n);
	scanf("%d %d", &u, &v);
	while (u != -1 && v != -1) {
		insert_edge(&g, u, v);
		scanf("%d %d", &u, &v);
	}

	for (i = 0; i < 3; i++) { // 3�� �ݺ�
		scanf("%d %d", &u, &v);
		printf("%d\n", is_edge_in(&g, u, v));
	}
}
