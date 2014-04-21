package com.cci;


public class RotateMatrix {

    public static int[][] rotate(int[][] matrix){
        //Out loop for layers
        int width = matrix[0].length;
        for(int layer = 0 ; layer < width /2 ; layer++){
            int layerWidth = width - layer -1;
            for(int i = layer ; i < layerWidth ; i++){
                int offset = i - layer;

                int top = matrix[layer][i];

                //Left to top.
                matrix[layer][i] = matrix[layerWidth - offset][layer];

                //Bottom to left
                matrix[layerWidth - offset][layer] = matrix[layerWidth][layerWidth - offset];

                //Right to bottom
                matrix[layerWidth][layerWidth - offset] = matrix[i][layerWidth];

                //Top to right
                matrix[i][layerWidth] = top;
            }
        }

        return matrix;
    }
}
