#include<assert.h>
#include <string.h>
#include <iostream>
#include <stdio.h>
#include<stdlib.h>
using namespace std;
struct StackNode {
public:
    char  data;
    StackNode *link;
    StackNode(char d = 0, StackNode *next = NULL) : data(d), link(next) { }
    ~StackNode( ){};
};
class LinkedStack  {
private:zxtr
    StackNode *top;
public:
    LinkedStack() : top(NULL) {}
    void Push(char &x);
    int  Pop(char & x);
    friend ostream & operator << (ostream& os, LinkedStack& s) ;
};
ostream& operator << (ostream& os, LinkedStack& S){
// //输出栈元素的重载操作 <<

    StackNode *p=S.top;int i=0;
    while(p!=NULL)
    {os<<++i<< ":" << p->data<<endl; p=p->link;}
    return os;
};

void LinkedStack::Push(char &x) {
//将元素值x插入到链式栈的栈顶,即链头。
    top = new StackNode( x, top );	//创建新结点
    assert (top != NULL);		//创建失败退出
};

int LinkedStack::Pop(char & x) {
//删除栈顶结点, 返回被删栈顶元素的值。
    if (top == NULL ) return 0;         //栈空返回
    StackNode *p = top;		            //暂存栈顶元素
    top = top->link;			      //退栈顶指针
    x = p->data;
    delete p;		          //释放结点
    return 1;
};

int huiwen( char  s[] );
int main()
{
    char  s[100] ;
    gets(s);
    cout<< huiwen(s)<<endl;
    return 1;
}
