import java.util.*;
public class bfs_graph {
    static class edge{
        int src;
        int des;
        edge(int s,int d){
            this.src=s;
            this.des=d;}
    }
    public static void createGraph(ArrayList<edge> ar[]){
        for(int i=0;i< ar.length;i++){
            ar[i]=new ArrayList<>();
        }
        ar[0].add(new edge(0,1));
        ar[0].add(new edge(0,2));

        ar[1].add(new edge(1,0));
        ar[1].add(new edge(1,3));

        ar[2].add(new edge(2,0));
        ar[2].add(new edge(2,4));

        ar[3].add(new edge(3,1));
        ar[3].add(new edge(3,4));
        ar[3].add(new edge(3,5));

        ar[4].add(new edge(4,2));
        ar[4].add(new edge(4,3));
        ar[4].add(new edge(4,5));

        ar[5].add(new edge(5,3));
        ar[5].add(new edge(5,4));
        ar[5].add(new edge(5,6));

        ar[6].add(new edge(6,5));
    }
    public static void bfs(ArrayList<edge> ar[]){
        Queue<Integer>q=new LinkedList<>();
        boolean[]vis=new boolean[7];
        q.add(0);
        while(!q.isEmpty()){
            int curr=q.remove();
            if(vis[curr]==false){
                vis[curr]=true;
                System.out.print(curr+" ");
                for(int i=0;i<ar[curr].size();i++){
                    edge e=ar[curr].get(i);
                    q.add(e.des);
                }
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<edge> ar[]=new ArrayList[7];
        createGraph(ar);
        bfs(ar);

    }
}
