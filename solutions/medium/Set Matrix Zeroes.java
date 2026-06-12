// Title: Set Matrix Zeroes
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/set-matrix-zeroes/

                    matrix[i][j]=0;
                }
            }
        }

        if(firstRow){
            for(int j=0;j<n;j++){
                matrix[0][j]=0;
            }
        }

        if(firstCol){
            for(int i=0;i<m;i++){
                matrix[i][0]=0;
            }
        }
    }
}
