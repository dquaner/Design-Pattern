package org.dyy.dp.adapter.spring.adapter;

import org.dyy.dp.adapter.spring.controller.HttpController;

public class HttpHandlerAdapter implements HandlerAdapter {
    @Override
    public boolean supports(Object handler) {
        return (handler instanceof HttpController);
    }

    @Override
    public void handle(Object handler) {
        ((HttpController) handler).doHttpHandler();
    }
}
