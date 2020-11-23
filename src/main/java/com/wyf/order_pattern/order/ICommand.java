package com.wyf.order_pattern.order;

public interface ICommand {
    void execute();

    void undo();
}
