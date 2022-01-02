#include <stdio.h>
int is_word_in_word(char w1[], int start, char w2[])
{
	int i;
	int count;
	int index = 1;
	int j = 0;

	for (i = 0; w2[i] != '\0'; i++);
	count = i;

	for (i = start; i < start + count; i++)
	{
		if (w1[i] != w2[j]) {
			index = 0;
		}
		j++;
	}

	return index;
}
int main(void)
{
	char s1[30], s2[30];
	int i, j, k;

	scanf_s("%s", s1, sizeof(s1));
	scanf_s("%s", s2, sizeof(s2));


	for (k = 0; s2[k] != '\0'; k++);

	for (i = 0; s1[i] != '\0'; i++)
	{
		if (is_word_in_word(s1, i, s2))
		{
			for (j = i; s1[j] != '\0'; j++)
			{
				s1[j] = s1[j + k];
			}
			s1[j] = '\0';
		}
	}

	printf("%s\n", s1);
}