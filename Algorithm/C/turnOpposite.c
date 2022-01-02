#include <stdio.h>
int printArray(int arr[][4], int size)
{
	int i, j;
	for (i = 0; i < size; i++) {
		for (j = 0; j < 4; j++)
			if (j < 3)
				printf("%d ", arr[i][j]);
			else
				printf("%d", arr[i][j]);
		printf("\n");
	}
}
void initArray(int a[][4], int size, int num)
{
	int i, j;
	int b[4][4] = { 0 };

	for (i = 0; i < size; i++)
	{
		a[i][0] = i;
		b[i][0] = i;
		for (j = 1; j < 4; j++)
		{
			a[i][j] = a[i][j - 1] + num;
			b[i][j] = b[i][j - 1] + num;
		}
	}
	

	for (i = 0; i < size; i++)
	{
		for (j = 0; j < 4; j++)
		{
			a[size - 1 - i][4 - 1 - j] = b[i][j];
		}
	}
}
int main(void)
{
	int i, j;
	int a[4][4], b[4][4];
	int n;
	scanf_s("%d", &n);
	initArray(a, 4, n);
	printArray(a, 4);
}