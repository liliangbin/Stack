
#include <stdio.h>
#include <stdlib.h>

#define BASE 10 //基数桶[0-9]

void radixsort(int arr[], int size)
{
    if (arr == NULL)
        return ;

    //找出最大数
    int max = arr[0];
    int i;
    for (i = 1; i < size; ++i) {
        if (arr[i] > max) {
            max = arr[i];
        }
    }

    int exp = 1; //位数
    int *temp = (int*) malloc(size * sizeof(int));
    while (max / exp > 0) {

        //重置基数桶
        int bucket[BASE] = {0};

        //统计每个基数上有多少个数据
        for (i = 0; i < size; ++i) {
            bucket[(arr[i] / exp) % BASE]++;
        }

        //求出基数桶的边界索引,bucket[i]值为第i个桶的右边界索引+1
        for (i = 1; i < BASE; ++i) {
            bucket[i] += bucket[i - 1];
           // printf("  i  ===>%d",i);
        }

        //这里要从右向左扫描，保证排序稳定性
        for (i = size - 1; i >= 0; i--) {
            temp[--bucket[(arr[i] / exp) % BASE]] = arr[i];
            printf("");
        }
        printf("temp  ===>");
        for (int j = 0; j <BASE ; ++j) {
            printf("%d  ",temp[j]);

        }
        printf("\n");
        //将基数桶排好的数据赋值到原数据，完成一趟排序
        for (i = 0; i < size; ++i) {
            arr[i] = temp[i];
        }

        exp *= BASE; //位数递增

    }
    free(temp);
}

int main()
{
    int arr[] = {27, 91, 1, 97, 17, 23, 84, 28, 72, 5, 67, 25};
    int size = sizeof(arr) / sizeof(int);

    // soer
    radixsort(arr, size);

    //print
    int i;
    for (i = 0; i < size; ++i)
        printf("%d ", arr[i]);
    printf("\n");

    getchar();
    return 0;
}