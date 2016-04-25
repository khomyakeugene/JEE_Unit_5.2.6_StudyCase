package com.company.tasks;

import java.util.List;

/**
 * Created by Yevhen on 25.04.2016.
 */
public class ExecutorProxy<E> implements Executor<E> {

    private Executor<E> executor;

    public void setExecutor(Executor<E> executor) {
        this.executor = executor;
    }

    @Override
    public void addTask(Task<? extends E> task) {
        executor.addTask(task);
    }

    @Override
    public void addTask(Task<? extends E> task, Validator<E> validator) {
        executor.addTask(task, validator);
    }

    @Override
    public void execute() {
        System.out.println("ExecutorProxy before execute");
        executor.execute();
        System.out.println("ExecutorProxy after execute");
    }

    @Override
    public List<E> getValidResults() {
        return executor.getValidResults();
    }

    @Override
    public List<E> getInvalidResults() {
        return executor.getInvalidResults();
    }
}
