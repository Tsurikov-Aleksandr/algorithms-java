package leet75;

public class T75Leet547NumberOfProvinces {
    public int findCircleNum(int[][] isConnected) {
        int provinces = 0;
        int n = isConnected.length;
        boolean[] vis = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                dfs(i, isConnected, vis);
                provinces++;
            }
        }

        return provinces;
    }

    public void dfs(int node, int[][] matrix, boolean[] vis) {
        vis[node] = true;

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[node][i] == 1 && !vis[i]) {
                dfs(i, matrix, vis);
            }
        }
    }
}
