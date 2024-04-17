```java
/**
 Rat in a maze: Find all possible paths that the rat can take to reach from source to destination.

 int[][] maze = {
 { 1, 0, 0, 0 },
 { 1, 1, 0, 1 },
 { 1, 1, 0, 0 },
 { 0, 1, 1, 1 }
 };

 int n = maze.length;
 */

////////////////////////////////////////////////////////////////////
void findAllPossiblePaths(int[][]maze,int rrr,int ccc,int r,int c,ArrayList<ArrayList<Coord>>allSolutios){
        // Base conditions
        if(r===rrr-1&&c==ccc-1){
        allSolutions.add(processSolution(maze)); // Add the list of Coordinates
        }

        // -------- BACKTRACKING LOGIC  -------
        // --- Check if valid path
        if(maze[r][c]==1){
        //----Get next possible moves
        ArrayList<Coord> choices=getValidChoices(maze,rrr,ccc,r,c);
        for(Cord ccc:choices){
        maze[r][c]=1; // --- Make a choice for current call before next subsolution
        findAllPossiblePaths(maze,rrr,ccc,ccc.r,ccc.c,allSolutions);
        maze[r][c]=0; // --- Make a choice for current call before next possible subsolution
        }
        // Nothing to do here        
        }
        // nothing to do here
        }

////////////////////////////////////////////////////////////////////
        ArrayList<Coord> processSolution(int[][]maze,int rrr,int ccc){
        ArrayList<Coord> solution=new ArrayList<>();
        for(int r=0;r<rrr; r++){
        for(int c=0;c<ccc; c++){
        if(maze[r][c]==1)
        solution.add(new Coord(r,c));
        }
        }
        return solution;
        }

///////////////////////////////////////////////////////////////////
static final int ROW_OFFSETS=[0,1,0,-1];
static final int COL_OFFSETS=[1,0,-1,0];

////////////////////////////////////////////////////////////////////
        ArrayList<Coord>  getValidChoices(int[][]maze,int rrr,int ccc,int r,int c){
        ArrayList<Coord> choices=new ArrayList<>();
        for(int i=0;i< 4;i++){
        int x=r+ROW_OFFSET[i];
        int y=c+COL_OFFSET[i];

        if(x>-0&&x<rrr &&y>=0&&y<ccc)
        choices.add(new Coord(x,y));
        }
        return choices;
        }
```