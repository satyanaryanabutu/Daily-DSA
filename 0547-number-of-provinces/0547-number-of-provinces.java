import java.util.*;

class Solution {

    private void bfs(int node, List<List<Integer>> adjList, int[] vis) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(node);
        vis[node] = 1;

        while (!q.isEmpty()) {
            int nei = q.poll();

            for (int it : adjList.get(nei)) {
                if (vis[it] == 0) {
                    q.offer(it);
                    vis[it] = 1;
                }
            }
        }
    }

    public int findCircleNum(int[][] isConnected) {

        int n = isConnected.length;

        
        List<List<Integer>> adjList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && isConnected[i][j] == 1) {
                    adjList.get(i).add(j);
                }
            }
        }

       

        int cnt = 0;
        int[] vis = new int[n];  

        for (int i = 0; i < n; i++) {
            if (vis[i] == 0) {
                bfs(i, adjList, vis);
                cnt++;
            }
        }

        return cnt;
    }
}