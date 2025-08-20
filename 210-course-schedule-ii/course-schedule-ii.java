class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
         Map<Integer, List<Integer>> adj = new HashMap<>();
        for (int i=0;i<numCourses;i++) {
            adj.put(i, new ArrayList<>());
        }

        int[] indegree = new int[numCourses];

        for (int[] i : prerequisites) {
            adj.get(i[1]).add(i[0]);
            indegree[i[0]]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        List<Integer> order = new ArrayList<>();
        int count = 0;

        for (int i=0;i<numCourses;i++) {
            if (indegree[i] == 0) {
                queue.add(i);
            }
        }

        while (!queue.isEmpty()) {

            int node = queue.remove();
            order.add(node);
            count++;

            for (int element : adj.get(node)) {
                indegree[element]--;
                if (indegree[element] == 0) {
                    queue.add(element);
                }
            }
        }

        if (count == numCourses) {
            return order.stream().mapToInt(i -> i).toArray();
        }

        return new int[]{};
    }
} 