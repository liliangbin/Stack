#include <stdio.h>
#include <malloc.h>


typedef struct  Node{
    int data;
    struct  Node * next;

}NodeList ,*LinkList;

LinkList  create(){

    NodeList * H,*S;
    int n;
    scanf("%d",&n);
    while (n!=0){
        S =  (NodeList* )malloc(sizeof(NodeList));
        S->data = n;
        H->next

    }
}
int main() {
    printf("Hello, World!\n");
    return 0;
}