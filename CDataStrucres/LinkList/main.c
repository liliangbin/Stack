#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

#define FLAG 0

typedef struct test {
    double coef;
    double exp;
    struct test *next;
} Node, *LinkList;

LinkList Create() {

    double a, n;
    scanf("%lf", &a);
    Node *H, *T, *S;
    T = H;
    while (a != FLAG) {
        scanf("%lf", &n);
        S = (Node *) malloc(sizeof(Node));
        S-> coef = a;
        S-> exp = n;
        S-> next = NULL;
        T-> next = S;
        S = T;

    }
    return H;
}

LinkList add(Node *A, Node *B) {
    Node *ha, *p, *q;
    p = A->next;
    q = B->next;
    Node *H, *T, *S;
    T = H;
    ha = A->next;
    while (p != NULL && q != NULL) {
        S = (Node *) malloc(sizeof(Node))

        if (p->exp < q->exp) {
            S->coef = p->coef;
            S->exp = p->exp;
            S->next = NULL;
            T->next = S;
            T = S;
            p = p->next;

        }
        if (p->exp > q->exp) {

            S->coef = q->coef;
            S->exp = q->exp;
            S->next = NULL;
            T->next = S;
            T = S;
            q = q->next;
        }
        if (p->exp == q->exp) {
            double tmp = p->coef + q->coef;
            if (tmp == 0) {
                q = q->next;
                p = p->next;
                continue;

            } else {


                S->coef = tmp;
                S->exp = q->exp;
                S->next = NULL;
                T->next = S;
                T = S;
                q = q->next;
                p = p->next;
            }


        }
    }
    if (p == NULL) {
        while (q != NULL) {

            S = (Node *) malloc(sizeof(Node));
            S->coef = q->coef;
            S->exp = q->exp;
            T->next = S;
            T = S;
            q = q->next;

        }

    }
    if (q == NULL) {

        while (p != NULL) {
            S = (Node *) malloc(sizeof(Node));
            S->coef = p->coef;
            S->exp = p->exp;
            S->next = NULL;
            T->next = S;
            T = S;
            p = p->next;


        }
    }

    return H;

}

void  printLinkLi(Node * A){
    while (true);
}
int main() {
    char command;
    scanf("%c", &command);
    Node *A, *B ,*tmp;
    while (true) {
        scanf("%c", &command);
        switch (command) {
            case 'X':
                A = Create();
                B = Create();
                break ;
            case 'P':
                tmp = (Node *)malloc(sizeof(Node)) ;
                tmp = add(A,B);
                printLinkLi(tmp);
                break ;


        }
        return 0;
    }  }