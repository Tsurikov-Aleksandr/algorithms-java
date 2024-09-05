package all.easy;

public class Easy2946MatrixSimilarityAfterCyclicShifts {
    public boolean areSimilar(int[][] mat, int k) {
        for (int[] line : mat) {
            for (int j = 0; j < mat[0].length; j++) {
                if (line[j] != line[(j + k) % mat[0].length])
                    return false;
            }
        }

        return true;
    }
}
