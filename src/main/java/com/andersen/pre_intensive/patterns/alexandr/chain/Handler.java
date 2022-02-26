package com.andersen.pre_intensive.patterns.alexandr.chain;

abstract class Handler {
    int priority;
    Handler next;
    public Handler(int priority) {this.priority = priority; }
    public void setNext(Handler next) {this.next = next;}

    String handlerAction(String message, int level){
        if (level<=priority){
            return write(message);
        }
        if (next!=null){
            next.handlerAction(message, level);
        }
        return "";
    }
    abstract String write(String message);
}
