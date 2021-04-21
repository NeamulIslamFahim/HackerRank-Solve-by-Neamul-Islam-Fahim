#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
int simpleArraySum(int a[1000], int n){

    int sum = 0;
    for(int i=0; i<n; i++){
        sum = sum + a[i];
    }

    return sum;

}
int main()
{
    int a[1000],n;
    scanf("%d",&n);
    for(int i=0; i<n; i++){
        scanf("%d", &a[i]);
    }
    int num = simpleArraySum(a,n);
    printf("%d\n", num);

    return 0;

}
