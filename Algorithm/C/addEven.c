#include <stdio.h>

int addEachEvenRec(int n)
{
	if (n == 0)
		return 0;
	else if (n % 2 != 0)
		return addEachEvenRec(n / 10);
	else
		return n % 10 + addEachEvenRec(n / 10);
}
int main(void)
{
	int num;
	scanf_s("%d", &num);
	printf("%d\n", addEachEvenRec(num));
}