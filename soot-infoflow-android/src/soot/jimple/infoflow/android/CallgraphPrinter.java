package soot.jimple.infoflow.android;

import soot.jimple.toolkits.callgraph.CallGraph;
import soot.jimple.toolkits.callgraph.Edge;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CallgraphPrinter {
    public static void printGraph(CallGraph callGraph) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(
                new FileWriter("/home/nikola/Development/FlowDroid/CallGraphOutput/callgraph.dot"));

        for (Edge edge : callGraph) {
            bufferedWriter.write("\"" + edge.src().getDeclaringClass() + ": " + edge.src().getName() + "\"");
            bufferedWriter.write(" -> ");
            bufferedWriter.write("\"" + edge.tgt().getDeclaringClass() + ": " + edge.tgt().getName() + "\"");
            bufferedWriter.write("\n");
        }

        bufferedWriter.close();
    }
}
