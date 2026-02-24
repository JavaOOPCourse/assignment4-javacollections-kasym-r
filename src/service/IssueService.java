package service;

import model.Issue;
import java.util.PriorityQueue;
import java.util.Iterator;

public class IssueService {

    private PriorityQueue<Issue> issues = new PriorityQueue<>();

    public void initializeIssues() {
        issues.add(new Issue("Lost Scholarship", 1));
        issues.add(new Issue("Exam Conflict", 2));
        issues.add(new Issue("Visa Problem", 1));
        issues.add(new Issue("Grade Appeal", 3));
        issues.add(new Issue("Course Overload", 4));
    }

    public void showMostUrgent() {
        System.out.println("Most urgent issue: " + issues.peek());
    }

    public void resolveIssues() {
        issues.poll();
        issues.poll();
        System.out.println("2 issues removed");
    }

    public void printRemainingIssues() {
        Iterator<Issue> it = issues.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public void addNewIssue(String description, int urgency) {
        issues.add(new Issue(description, urgency));
    }
}
