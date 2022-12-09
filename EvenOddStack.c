#include<stdio.h>
#include<stdlib.h>
#define Max 100 
 
int Top=-1,Top1=-1,Top2=-1; inp_array[Max],ctr=0,temp1=0;
int inp1_array[Max],inp2_array[Max];
void Push();
void Pop();
void show();
void size();
void merge();
void push1();
void push2();
void show1();
void show2();
 
int main()
{
	int choice;
	
	while(1)	
	{ 
		printf("\nOperations performed by Stack");
		printf("\n1.Push the element\n2.Pop the element\n3.Show\n4.Size\n5.Merge\n6.Exit");
		printf("\n\nEnter the choice:");
		scanf("%d",&choice);
		
		switch(choice)
		{
			case 1: Push();
                    ctr++;
					break;
			case 2: Pop();
                    ctr--;
					break;
			case 3: show();
					break;
            case 4: size();
                    break;
            case 5: merge();
                    break;
			case 6: printf("End"); exit(0);
			
			default: printf("\nInvalid choice!!");
		}
	}
}
 
void Push()
{
	int x;
	
	if(Top==Max-1)
	{
		printf("\nOverflow!!");
	}
	else
	{
		printf("\nEnter element to be inserted to the stack:");
		scanf("%d",&x);
		Top=Top+1;
		inp_array[Top]=x;
	}
}
 
void Pop()
{
	if(Top==-1)
	{
		printf("\nUnderflow!!");
	}
	else
	{
		printf("\nPopped element:  %d",inp_array[Top]);
		Top=Top-1;
	}
}
 
void show()
{
	
	
	if(Top==-1)
	{
		printf("\nUnderflow!!");
	}
	else
	{
		printf("\nElements present in the stack: \n");
		for(int i=Top;i>=0;--i)
			printf("%d\n",inp_array[i]);
	}
}

void size()
{
    printf("Size of the stack is: \n");
    printf("%d",ctr);
}
void merge()
{   

    for(int i=Top;i>=0;--i){
			if(inp_array[i]%2==0)
            { 
                temp1=inp_array[i];
            push1(temp1);
            }
            else{
                temp1=inp_array[i];
            push2(temp1);
            }    
    } 

    printf("Even stack is:\n");
    show1();
    printf("Odd stack is:\n");
    show2();   
}

void push1(int x)
{

	//int x;
		
		Top1=Top1+1;
		inp1_array[Top1]=x;
}
void push2(int x)
{
	//int x;
		Top2=Top2+1;
		inp2_array[Top2]=x;
}
void show1()
{

	
		
		for(int i=Top1;i>=0;--i)
			printf("%d\n",inp1_array[i]);

}
void show2(){


		for(int i=Top2;i>=0;--i)
			printf("%d\n",inp2_array[i]);

}