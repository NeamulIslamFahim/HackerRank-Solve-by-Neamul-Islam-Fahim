#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    int n, sum = 0;
    scanf("%d", &n);

    while(n!=0) {
        int d = n%10;
        sum  = sum+d;
        n = n/10;
    }

    printf("%d", sum);
    return 0;
