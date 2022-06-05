
The goal of this assignment is to help as many poor penguins as possible. The penguins are jointly with you, trapped in a labyrinth of which there is no exit. Your task is to search for penguins in order to feed them.

You start from your starting point in search for penguins. In a single move, you can advance in one of four directions: upward, downward, left or right. In order to carry as many penguins as possible, you do not carry food, but leave it at the starting point. Which means that you will have to trace pack your way there. In order not to get lost, you should keep your distance to the starting point on the current path always less or equal to the given maximal distance so that (in case of sudden exhaustion or diminishing cuddliness) of pengiuns, you may comfortably return to the starting point.

Implement within the file FindPingu.java the java method public static int walk(int x, int y, int maxDistance) which, starting from some origin, recursively searches all out-going paths for unhappy penguins and returns their number. The length of the currently active path, i.e., the number of visited entries that have not yet been ultimately left, thereby should be less than maxDistance. Use the method void draw(int[][] labyrinth) in oder to visualize the labyrint after each step. The 2-dimensional array labyrinth contains for every entry a value encoding what can be found there. The following (int) constants may occur:

WALL: this position contains a wall and therefore cannot be entered.
FREE: This position is empty and therefore can be entered.
PLAYER: This is the position of the heroic pengiun rescuer (you).
OLD_PATH_ACTIVE: This position has already been visited during your search, you will return to this position on your way back in order to search for more paths (the position is part of the active path).
OLD_PATH_DONE: This position has already been visited. You will, however, not return to this position,
PENGUIN: At this position sits an ailing penguin.
Some of these constants can be written at a position in the labyrinth (such as, e.g., PLAYER), others are only read (like, e.g., WALL) Take up found penguins by replacing the corresponding constant by other appropriate path constants (OLD_PATH_ACTIVE or OLD_PATH_DONE). A main mathod is already provided by the template. By commenting in or out of the corresponding line in main, you may choose a random labyrinth or not.

You may control the graphical output by means of the following keys:

b (break): pauses the putput
c (continue): continues
+: faster
-: slower
