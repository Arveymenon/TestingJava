package DynamicProgramming;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Map.Entry;

public class WordSearch {

    public WordSearch(){
        char[][] grid = new char[][] {
            new char[] {'A','B','C','E'},
            new char[] {'S','F','C','S'},
            new char[] {'A','D','E','E'}
        };
        String word = "ABCCED";
        boolean result = false;

        for(int x = 0; x < grid[0].length - 1; x++){
            for(int y = 0; y < grid.length - 1; y++){
                if(grid[y][x] == word.charAt(0)){
                    if(existsCheck(grid, word, 1, x, y))
                        result = true;
                }
            }
        }

        System.out.println(result);
    }
    
    // x and y positions

    public boolean existsCheck(char[][] grid, String word, int p, int j, int i){

        if(p == word.length()){
            return true;
        }
        
        int m = grid[0].length, n = grid.length;

        List<Entry<Integer, Integer>> options = new ArrayList<>();

        if(i - 1 < m && i - 1 > -1 && j < n && j > -1 && grid[i - 1][j] == word.charAt(p)) options.add(Map.entry(i - 1, j));
        if(i < m && i > -1 && j - 1 < n && j - 1 > -1 && grid[i][j - 1] == word.charAt(p)) options.add(Map.entry(i, j - 1));
        if(i + 1 < m && i + 1 > -1 && j < n && j > -1 && grid[i + 1][j] == word.charAt(p)) options.add(Map.entry(i + 1, j));
        if(i < m && i > -1 && j + 1 < n && j + 1 > -1 && grid[i][j + 1] == word.charAt(p)) options.add(Map.entry(i, j + 1));

        for(Entry<Integer, Integer> option: options){
            if(existsCheck(grid, word, p + 1, option.getKey(), option.getValue())){
                return true;
            }
        }
        // Math.min(a, b)
        Math.abs
        return false;
    }
}
