package recursive;

class Maze {

    
    public static void main(final String[] args) {
        String[][] maze =  readmaze();;
       
        final int x = 11, y = 1;
        if (solveMaze(maze, x, y)) {
            printmaze(maze);
        }
        else{
            System.out.println("Solution doesn't exist");
        }

    }

    private static String[][] readmaze() {
        String[][] maze = {
            {"#","#","#","#","#","#","#","#","#","#","#","#","#"},
            {"#"," "," "," "," "," "," "," ","#"," "," "," ","#"},
            {"#"," ","#","#","#","#","#"," ","#","#","#"," ","#"},
            {"#"," "," "," "," "," ","#"," "," "," "," "," ","#"},  
            {"#"," ","#","#","#"," ","#"," ","#","#","#","#","#"}, 
            {"#"," "," "," "," "," ","#"," "," "," "," "," ","#"},
            {"#","#","#"," ","#","#","#","#","#"," ","#"," ","#"},
            {"#"," ","#"," "," "," "," "," ","#"," ","#"," ","#"},
            {"#"," ","#","#","#"," ","#","#","#"," ","#","#","#"},
            {"#"," "," "," ","#"," ","#"," "," "," "," "," ","#"},
            {"#","#","#"," ","#"," ","#"," ","#","#","#","#","#"},
            {"#"," "," "," "," "," ","#"," "," "," "," ","F","#"},
            {"#","#","#","#","#","#","#","#","#","#","#","#","#"}

            };
            return maze;
    }

    private static void printmaze(final String[][] maze) {
        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 13; j++) {
                System.out.print(maze[i][j]);
            }
            System.out.println();
        }
    }

    private static boolean solveMaze(final String[][] maze, final int x, final int y) {
        if(maze[x][y] == "F"){
            return true;
        }
        else if(maze[x][y] == "#" || maze[x][y] == "+"){
            return false;
        }
        maze[x][y] = "+";
        if(solveMaze(maze,x,y+1)) return true;
        if(solveMaze(maze,x+1,y)) return true;
        if(solveMaze(maze,x,y-1)) return true;
        if(solveMaze(maze,x-1,y)) return true;
        //maze[x][y] = " ";
        return false;
    }
}