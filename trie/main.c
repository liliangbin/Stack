#include <stdio.h>
#include <mem.h>
#include <search.h>
#include <stdbool.h>
#include <afxres.h>

char num_str[10001][11];

int cmp(const void *a, const void *b) {
    return strcmp((char *) a, (char *) b);
}


int main() {

    int t;
    scanf("%d", &t);
    while (t--) {
        bool flag = FALSE;
        int n;
        scanf("%d",&n);
        for (int i = 0; i < n; i++) {
            scanf("%s", &num_str[i]);

        }

        qsort(num_str, n, sizeof(num_str[0]), cmp);

        for (int i = 0; i < n - 1; i++) {

            if (strncmp(num_str[i], num_str[i + 1],strlen(num_str[i] )) == 0) {

                flag = true;
                break;
            }
        }

            if (flag == true) {//如果由号码是其它号码的前缀
                printf("NO\n");
            } else {
                printf("YES\n");
            }
        }

    return 0;
}