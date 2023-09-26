class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0; i < numCourses; i++){
            graph.add(new ArrayList<>());// filling outer list with empty lists
        }
        for(int i=0; i<prerequisites.length; i++){
            int u = prerequisites[i][0];//converting prerequesites to an adjacency list
            int v = prerequisites[i][1];
            graph.get(u).add(v);//getting index of list and adding element to the inner list
        }
        int topo[] = new int[numCourses];
        int indegree[] = new int[numCourses];
        Queue<Integer> q= new LinkedList<>();
        for(int i = 0; i < numCourses; i++){
            for(Integer it : graph.get(i)){
                indegree[it]++;
            }
        }
        for(int i = 0; i < numCourses; i++){
            if(indegree[i] == 0){
                q.add(i);
            }
        }
        int index = 0;
        while(!q.isEmpty()){
            Integer poped = q.poll();
            // topo[index] = poped;
            index++;
            for(Integer it : graph.get(poped)){
                indegree[it]--;
                if(indegree[it] == 0){
                    q.add(it);
                }
            }
        }
        //topo array is not needed here only the index will give the count
        return (index == numCourses)? true : false;
    }
}