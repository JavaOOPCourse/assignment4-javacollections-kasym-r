package service;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ActionHistoryService {

    private ArrayDeque<String> actions = new ArrayDeque<>();

    public void initializeActions() {
        actions.addLast("Submitted Assignment");
        actions.addLast("Dropped Course");
        actions.addLast("Registered Course");
        actions.addLast("Updated Profile");
    }

    public void undoLastAction() {
        if (!actions.isEmpty()) {
            System.out.println("Undone action: " + actions.removeLast());
        } else {
            System.out.println("No actions to undo.");
        }
    }

    public void addRequestedTranscript() {
        actions.addLast("Requested Transcript");
    }

    public void showFirstAndLast() {
        if (!actions.isEmpty()) {
            System.out.println("First action: " + actions.getFirst());
            System.out.println("Last action: " + actions.getLast());
        }
    }

    public void printHistory() {
        Iterator<String> it = actions.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
