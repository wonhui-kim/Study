/* 
count input character in String

ex) input: t theater
    output: 2
*/

#include <stdio.h>
int char_num(char* p, char c)
{
	int count = 0;

	for (*p; *p != '\0'; p++)
	{
		if (*p == c)
			count++;
	}

	return count;
}
int main(void)
{
	char w[30];
	char* p;
	char ch;
	p = w;
	scanf_s("%c", &ch, sizeof(&ch));
	scanf_s("%s", w, sizeof(w));
	printf("%d\n", char_num(w, ch));
}
