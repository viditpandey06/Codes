#include<stdio.h>
#include<stdlib.h>
struct Node{
int data;
struct  Node* next;
};
int main()
{   struct Node* fast = NULL;
    struct Node* slow = NULL;
    struct Node* head = NULL;
    struct Node* second = NULL;
    struct Node* third = NULL;
    struct Node* fourth =NULL;
 
    
    head = (struct Node*)malloc(sizeof(struct Node));
    second = (struct Node*)malloc(sizeof(struct Node));
    third = (struct Node*)malloc(sizeof(struct Node));
    fourth = (struct Node *)malloc(sizeof(struct Node));

    head->data = 200;
    head->next = second;
 
    second->data = 300; 
    second->next = third;
 
    third->data = 400; 
    third->next = fourth;
    fourth->data = 500;
    fourth->next = second;

    fast = head;
    slow = head;
    while (fast!= NULL)
    {
        fast = fast->next->next;
        slow = slow->next;
        if(fast==slow)
        {
            printf("Cycle present");
            break;
        }
  }
     printf("Not present");
  // printf("%d",slow->data);
  return 0;
}
