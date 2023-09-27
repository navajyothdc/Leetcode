class Solution {
    public boolean isBipartite(int[][] graph) {
        int color[] = new int[graph.length];
        Queue<Integer> q = new LinkedList<>();  
        for(int i=0; i < graph.length; i++){
            if(color[i] == 0){
                color[i] = 1;
                q.add(i);
                while(!q.isEmpty()){
                    int vertex = q.poll();
                    for(int v : graph[vertex]){//iterating the adjacency list
                        if(color[v] == color[vertex]){//iterating the adjacency list and checking if the 
                                                      //neighbours are of same color as the vertex's. If 
                                                      //yes there is a cycle of odd vertex and not bipartite
                            return false;
                        } else if(color[v] == 0){
                            color[v] = -color[vertex]; //Give the neighbours the alternative color of the
                                                        // vertex. If vertex is 1 then neighbour is -1 and
                                                        // vice versa
                            q.add(v);

                        }
                    }
                }
            }
        }
        return true;
    }
}