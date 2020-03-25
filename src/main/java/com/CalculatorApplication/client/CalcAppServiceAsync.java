package com.CalculatorApplication.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface CalcAppServiceAsync
{
    void getMessage(String msg, AsyncCallback<String> async);
}
