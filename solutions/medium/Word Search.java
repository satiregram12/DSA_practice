// Title: Word Search
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/word-search/


            return false;
        }

        char temp = board[row][col];
        board[row][col] = '#';

        boolean found =
                dfs(board, word, row + 1, col, index + 1) ||
                dfs(board, word, row - 1, col, index + 1) ||
                dfs(board, word, row, col + 1, index + 1) ||
                dfs(board, word, row, col - 1, index + 1);

        board[row][col] = temp;

        return found;
    }
}
