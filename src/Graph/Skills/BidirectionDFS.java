package Graph.Skills;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class BidirectionDFS {

    public int BidirectionDFS (GraphNode start, GraphNode end) {
        int res = 0;

        Queue<GraphNode> startQueue = new LinkedList<>();
        Set<GraphNode> startVisited = new HashSet<>();
        startQueue.offer(start);
        startVisited.add(start);

        Queue<GraphNode> endQueue = new LinkedList<>();
        Set<GraphNode> endVisited = new HashSet<>();
        startQueue.offer(end);
        startVisited.add(end);

        while (!startQueue.isEmpty()) {
            res++;
            int size = startQueue.size();
            while (size-- > 0) {
                GraphNode node = startQueue.poll();
                for (GraphNode neighbor : node.neighbors) {
                    if (endVisited.contains(neighbor)) {
                        return res;
                    }
                    if (!startVisited.contains(neighbor)) {
                        startVisited.add(neighbor);
                        startQueue.offer(neighbor);
                    }
                }
            }
        }

        while (!endQueue.isEmpty()) {
            res++;
            int size = endQueue.size();
            while (size-- > 0) {
                GraphNode node = endQueue.poll();
                for (GraphNode neighbor : node.neighbors) {
                    if (startVisited.contains(neighbor)) {
                        return res;
                    }
                    if (!endVisited.contains(neighbor)) {
                        endVisited.add(neighbor);
                        endQueue.offer(neighbor);
                    }
                }
            }
        }

        return res;
    }
}
