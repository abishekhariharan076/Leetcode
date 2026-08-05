class Solution {
    void dfs(int node,HashSet<Integer> visited,List<Integer> arr[]){
        if(visited.contains(node))return;

        visited.add(node);

        List<Integer> list=arr[node];

        for(int ele:list){
            if(!visited.contains(ele)){
                dfs(ele,visited,arr);
            }
        }

        
    }
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        HashSet<Integer> visited=new HashSet<>();
        List<Integer> arr[]=(ArrayList<Integer>[])new ArrayList[n];
        for(int i=0;i<n;i++){
            arr[i]=new ArrayList<>();
        }

        for(int i=0;i<invocations.length;i++){
            int a=invocations[i][0];
            int b=invocations[i][1];

            arr[a].add(b);
        }

        dfs(k,visited,arr);


        List<Integer> ans=new ArrayList<>();
        boolean flag=true;
        for(int i=0;i<invocations.length;i++){
            int a=invocations[i][0];
            int b=invocations[i][1];

            if(!visited.contains(a) && visited.contains(b)){
                flag=false;
                break;
            }        

        }

        for(int i=0;i<n;i++){
            if(!flag || !visited.contains(i)) ans.add(i);
        }

        return ans;

    }
}