package top150.graphgeneral.leet399;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class T92Leet399EvaluateDivision {

    // 1. Построить граф из уравнений - матрица смежности графа,
    // горизонталь вертикаль узлы, в ячейках стоимость перехода O(n)
    // 2. Пройти все запросы, O(k)
    //   2.1 ищем путь от одного узла к другому, BFS vs DFS -> O(n)
    //   2.2 ищем стоимость этого пути
    // 3. возвращаем массив из найденных стоимостей
    //
    //итого  сложность O(n*k)

    public void dfs(String node,
                    String destination,
                    HashMap<String, HashMap<String, Double>> graph,
                    HashSet<String> visited,
                    double[] answer,
                    double temp) {

        if (visited.contains(node))
            return;

        visited.add(node);
        if (node.equals(destination)) {
            answer[0] = temp;
            return;
        }

        for (Map.Entry<String, Double> entry : graph.get(node).entrySet()) {
            String ne = entry.getKey();
            double val = entry.getValue();
            dfs(ne, destination, graph, visited, answer, temp * val);
        }
    }

    public HashMap<String, HashMap<String, Double>> buildGraph(List<List<String>> equations, double[] values) {
        HashMap<String, HashMap<String, Double>> graph = new HashMap<>();

        for (int i = 0; i < equations.size(); i++) {
            String dividend = equations.get(i).get(0);
            String divisor = equations.get(i).get(1);
            double value = values[i];

            graph.putIfAbsent(dividend, new HashMap<>());
            graph.putIfAbsent(divisor, new HashMap<>());

            graph.get(dividend).put(divisor, value);
            graph.get(divisor).put(dividend, 1.0 / value);
        }

        return graph;
    }

    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        HashMap<String, HashMap<String, Double>> graph = buildGraph(equations, values);
        double[] finalAns = new double[queries.size()];

        for (int i = 0; i < queries.size(); i++) {
            String dividend = queries.get(i).get(0);
            String divisor = queries.get(i).get(1);

            if (!graph.containsKey(dividend) || !graph.containsKey(divisor)) {
                finalAns[i] = -1.0;
            } else {
                HashSet<String> visited = new HashSet<>();
                double[] ans = {-1.0};
                double temp = 1.0;
                dfs(dividend, divisor, graph, visited, ans, temp);
                finalAns[i] = ans[0];
            }
        }

        return finalAns;
    }
}
