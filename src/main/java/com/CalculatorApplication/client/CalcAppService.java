package com.CalculatorApplication.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("CalcAppService")
public interface CalcAppService extends RemoteService
{
    String getMessage(String msg);

    class App
    {
        private static CalcAppServiceAsync ourInstance = GWT.create(CalcAppService.class);

        public static synchronized CalcAppServiceAsync getInstance() {
            return ourInstance;
        }
    }
}
