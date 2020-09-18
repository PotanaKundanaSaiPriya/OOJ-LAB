//C program 1
#include<stdio.h>
int main()
{
    int t=1;
    int num1,num2;
    int power;
    printf("Enter two numbers: \n");
    scanf("%d %d",&num1,&num2);
    printf("\nchoose from the optiions : \n");
    while(t!=0)
    {
        int i;
        printf("1.addition\n2.subtraction\n3.multiplication\n4.division\n5.greater than\n6.lesser than\n7.equal to\n8.greater than equal to\n9.remainder\n10.exponent\n-1.exit\n\n");
        scanf("%d",&i);
        if(i==1)
          {
            printf("sum = %d\n\n",num1+num2);
          }    
        else if(i==2)
          {
            printf("difference = %d\n\n",num1-num2);
          }    
        else if(i==3)
          {
            printf("product = %d\n\n",num1*num2);
          }    
        else if(i==4)
          {
            printf("quotient = %d\n\n",num1/num2);
          }    
        else if(i==5)
          {
            if(num1>num2)
             {
                printf("%d is greater than %d\n\n",num1,num2);
             }
            else
             {
                printf("%d is greater than %d\n\n",num2,num1);
             }
          }
        else if(i==6)
          {
            if(num1<num2)
             {
                 printf("%d is lesser than %d\n\n",num1,num2);
             }
            else
             {
                 printf("%d is lesser than %d\n\n",num2,num1);
             }
          }    
        else if(i==7)
          {
            if(num1==num2)
             {
                 printf("%d is equal to %d\n\n",num1,num2);
             }
            else
             {
                 printf("%d is not equal to %d\n\n",num1,num2);
             }
          }
        else if(i==8)
          {
            if(num1>=num2)
             {
                 printf("%d is greater than equal to %d\n\n",num1,num2);
             }
            else
             {
                 printf("%d is greater than equal to %d\n\n",num2,num1);
             }
          }
        else if(i==9)
          {
            printf("remainder = %d\n",num1%num2);
          }
        else if(i==10)
          {
            for(int i=0;i<num2;i++)
              {
                power=num1*i;
              }
            printf("%d to the power of %d = %d\n\n",num1,num2,power);  
          }
        else if(i==-1)
          {
            printf("\nThank you");
            t=0;
          }
        else
          {
            printf("\nwrong input\n\n");
          }  
    }

    return 0;
}


// C program 2
#include <stdio.h>
float sumaver(int a,int b)
{
    int sum,aver;
    sum=a+b;
    printf("\nsum of the largest two numbers = %d",sum);
    aver=sum/2;
    return aver;
}
int printeven(int a,int b)
{
    printf("\nall the even numbers between the largest and the second largest numbers are :\n");
    for(int i=a;i<=b;i++)
      {
          if(i%2==0)
            {
                printf("%d\t",i);
            }
      }
}
int main()
{
    int num1,num2,num3,lar1,lar2;
    float average;
    printf("enter 3 numbers :\n");
    scanf("%d %d %d",&num1,&num2,&num3);
    if((num1>num2)&&(num1>num3))
     {
         lar1=num1;
         if(num2>num3)
          {
            lar2=num2;
          }
        else
          {
            lar2=num3;
          }
     }
    else if((num2>num1)&&(num2>num3))
     {
         lar1=num2;
         if(num1>num3)
          {
              lar2=num1;
          }
         else
          {
              lar2=num3;
          }
     }
    else
     {
         lar1=num3;
         if(num1>num2)
          {
              lar2=num1;
          }
         else
          {
              lar2=num2;
          }
     }
    printf("the largest number = %d\n",lar1);
    printf("the second largest number = %d",lar2);
    average=sumaver(lar1,lar2);
    printf("\naverage of the largest two numbers = %f",average);
    printeven(lar2,lar1);
    return 0;
}
