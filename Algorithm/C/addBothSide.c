/*
 make array(b) with sum both side of the inputted array(a), arraySize:10
 (a)  0    1    2    3    4    5    6    7    8    9
 (b) 0+1  0+2  1+3  2+4  3+5  4+6   ...
 
 ex) input: 2 3 1 0 0 1 1 0 2
     output:5 3 3 1 1 1 1 3 2 
*/


#include <stdio.h>
#define NUMBER 10

int main(void)
{
	int a[NUMBER], b[NUMBER] = { 0 };
	int i;
	for (i = 0; i < NUMBER; i++)
		scanf_s("%d", &a[i]);


	for (i = 0; i < NUMBER; i++)
	{
		if (i < 1)
			b[i] = a[i + 1];
		else if (i > NUMBER - 2)
			b[i] = a[i - 1];
		else
			b[i] = a[i - 1] + a[i + 1];
	}

	for (i = 0; i < NUMBER; i++)
		printf("%d ", b[i]);
	printf("\n");
}
