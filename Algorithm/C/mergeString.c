#include <stdio.h>

void mergeStringOneByOne(char c[], char a[], char b[])
{
	int i = 0;
	int cIdx = 0;

	while (1) {
		if (a[i] != '\0' && b[i] != '\0') {
			c[cIdx++] = a[i];
			c[cIdx++] = b[i];
			i++;
		}
		else if (a[i] != '\0') {
			while (a[i] != '\0') {
				c[cIdx++] = a[i++];
			}
			c[cIdx] = '\0';
			break;
		}
		else {
			while (b[i] != '\0') {
				c[cIdx++] = b[i++];
			}
			c[cIdx] = '\0';
			break;
		}
	}
}
int main(void)
{
	char word1[10];
	char word2[10];
	char mergedWord[20];
	scanf_s("%s", word1, sizeof(word1));
	scanf_s("%s", word2, sizeof(word2));
	mergeStringOneByOne(mergedWord, word1, word2);
	printf("%s\n", mergedWord);
}