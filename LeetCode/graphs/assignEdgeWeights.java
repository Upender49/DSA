package graphs;
// 3558. Number of Ways to Assign Edge Weights I
class Solution {
    static int mod = (int) (1e9 + 7);

    public int assignEdgeWeights(int[][] edges) {
        int n = edges.length;
        ArrayList<Integer> arr[] = new ArrayList[n + 2];
        for (int i = 0; i <= n + 1; i++) {
            arr[i] = new ArrayList<>();
        }
        for (int[] e : edges) {
            int x = e[0];
            int y = e[1];
            arr[x].add(y);
            arr[y].add(x);
        }
        int max = findDepth(arr, 1, -1);
        max = max % mod;
        return (int) power(2L, max - 1);
    }

    public static long power(long base, int expo) {
        long ans = 1;
        while (expo > 0) {
            if ((expo & 1) == 1)
                ans = (ans * base) % mod;

            base = (base * base) % mod;
            expo >>= 1;
        }
        return ans;
    }

    public static int findDepth(ArrayList<Integer> arr[], int node, int parent) {
        ArrayList<Integer> list = arr[node];
        int max = 0;
        for (int neigh : list) {
            if (neigh == parent)
                continue;
            max = Math.max(max, findDepth(arr, neigh, node) + 1);
        }
        return max;
    }

}