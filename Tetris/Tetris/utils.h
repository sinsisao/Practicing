#pragma once
#define MAP_X_MAX 30
#define MAP_Y_MAX 16
#define MAP_EMPTY 0
#define MAP_WALL 1
#define MAP_BLOCK 2

#define BLOCK_TYPE_MAX 10
#define BLOCK_ROTATION_MAX 4
#define BLOCK_X_MAX 4
#define BLOCK_Y_MAX 4

extern char blocks[BLOCK_TYPE_MAX][BLOCK_ROTATION_MAX][BLOCK_X_MAX][BLOCK_Y_MAX];
