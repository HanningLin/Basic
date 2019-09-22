package Graph.Skills;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * only path
 */
public class MazeOfCheeseBoard {

    private boolean hasPath(int[][] maze, int[] start, int[] end) {
//        maze[x][y] = '0';
        int[][] directions = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
//      之字， 日字
//        {1, 1} {0, 2}

//        将空间复杂度降低到m * n
        boolean[][] visited = new boolean[maze.length][maze[0].length];

        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(start[0], start[1]));
        visited[start[0]][start[1]] = true;

        while (!queue.isEmpty()) {
            Point cur = queue.poll();
            if (cur.x == end[0] && cur.y == end[1]) {
                for (boolean[] visit : visited) {
                    System.out.println(Arrays.toString(visit));
                }
                return true;
            }
            for (int[] direction : directions) {
                int newX = cur.x + direction[0];
                int newY = cur.y + direction[1];
                if (isValid(maze, newX, newY) && !visited[newX][newY]) {
                    queue.offer(new Point(newX, newY));
//                    maze[newX][newY] = '0';
                    visited[newX][newY] = true;
                }
            }
        }
        return false;
    }

    private boolean isValid(int[][] maze, int x, int y) {
        return x >= 0 && y >= 0 && x < maze.length && y < maze[0].length && maze[x][y] == 1;
    }

    class Point {
        int x;
        int y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }


    public static void main(String[] args) {
        int[][] maze = new int[][]{
                {1, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0},
                {1, 1, 1, 1, 1, 1}
        };

        MazeOfCheeseBoard mazeOfCheeseBoard = new MazeOfCheeseBoard();
        System.out.println(mazeOfCheeseBoard.hasPath(maze, new int[]{0, 0}, new int []{5, 5}));

    }
}
