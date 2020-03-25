package com.CalculatorApplication.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.CalculatorApplication.client.CalcAppService;

public class CalcAppServiceImpl extends RemoteServiceServlet implements CalcAppService
{
    public String getMessage(String msg) {
        return "Client said: \"" + msg + "\"<br>Server answered: \"Hi!\"";
    }
}