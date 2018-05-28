//
// Created by liliangbin on 2018/5/28.
//


#include <stdio.h>
#include <malloc.h>

typedef struct {

    int data[1000];
    int top;

} *SeqStack, Node;

SeqStack create() {
    Node *List;
    List = (Node *) malloc(sizeof(Node));
    List->top = 0;
    return List;
}

int push (Node * stack,int data){

    if(stack->top==1000){
        return 0;
    } else{

        stack->data[stack->top];
        stack->top++;
        return 1;
    }
}

int pop (Node *stack,int &data){

    if(stack->top==0){
        return 0;
    } else{
        stack->top--;
        data  = stack->[stack->top];
        return 1;
    }
}
#include <iostream>

int main() {
    std::cout << "Hello, World!" << std::endl;


    return 0;
}
/*顺序存储的栈*/