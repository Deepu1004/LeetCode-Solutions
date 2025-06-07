class Solution:
    def rotate(self, matrix: List[List[int]]) -> None:
        n = len(matrix)

        top, bottom = 0, n - 1

        while(top<bottom):
            for i in range(n):
                matrix[top][i], matrix[bottom][i] = matrix[bottom][i], matrix[top][i]
            top += 1
            bottom -= 1

        for i in range(n):
            for j in range(i+1, n):
                matrix[i][j],matrix[j][i] = matrix[j][i], matrix[i][j]

        return matrix 