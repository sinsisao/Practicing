#pragma warning(disable : 4996)
#include <stdio.h>
#include <conio.h>

int main(void) {
    puts("hello world!");

    int key = getch();
    printf(": %d\n", key);
    key = getch();
    printf(": %d\n", key);
    return 0;
}