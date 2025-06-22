package com.example.task;

public class Task {
    private final String taskId;
    private String taskName;
    private String status;

    public Task(String taskId, String taskName, String status) {
        this.taskId   = taskId;
        this.taskName = taskName;
        this.status   = status;
    }

    public String getTaskId()    { return taskId; }
    public String getTaskName()  { return taskName; }
    public void   setTaskName(String name)   { this.taskName = name; }
    public String getStatus()    { return status; }
    public void   setStatus(String s)        { this.status = s; }

    @Override
    public String toString() {
        return String.format(
            "Task[id=%s, name=%s, status=%s]",
            taskId, taskName, status
        );
    }
}
