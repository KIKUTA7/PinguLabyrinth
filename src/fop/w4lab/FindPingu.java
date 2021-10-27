package fop.w4lab;

public class FindPingu extends Maze {
    static int[][] maze;

    public static void main(String[] args) {
        int width = readInt("Width of the labyrinth?");
        int height = readInt("Height of the labyrinth?");
        int maxDistance = readInt("How far do you dare to go?");
        if (width < 3 || height < 3 || maxDistance < 1) {
            write("Erroneous input!");
            return;
        }
        // always generates the same maze.
        maze = generateStandardPenguinMaze(width, height);
        // generaty random maze.
        // maze = generatePenguinMaze(width, height);
        int penguins = walk(1, 0, maxDistance);
        System.out.println("Rescued pinguins: " + penguins);
    }

    public static int walk(int x, int y, int maxDistance) {
        if (maxDistance < 0 || x >= maze.length || x < 0 || y < 0 || y >= maze[0].length) return 0;
        if (maze[x][y] == WALL || maze[x][y] == OLD_PATH_ACTIVE) return 0;

        int sum = 0;
        if (maze[x][y] == PENGUIN)
            sum = 1;
        int mat[][] = new int[][]{{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
        // int mat[][] = {{-1,0},{0,1},{1,0},{0,-1}} esec mosula.
        maze[x][y] = PLAYER;
        draw(maze);
        maze[x][y] = OLD_PATH_ACTIVE;
        for (int i = 0; i < 4; i++)
        {     sum += walk(x + mat[i][0], y + mat[i][1], maxDistance - 1);
        maze[x][y] = PLAYER;
        draw(maze);
        maze[x][y] = OLD_PATH_ACTIVE;
    }
        maze[x][y] = OLD_PATH_DONE;
        return sum;
    }






    }


