package com.CalculatorApplication.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.*;

public class CalcApp implements EntryPoint
{
    public void onModuleLoad()
    {
        final Calculator calculator = new Calculator();

        final Button equalsButton = new Button(" = ");
        final ListBox operationBox = new ListBox();

        calculator.supportedOperations().forEach(operationBox::addItem);

        final DoubleBox argBox1 = new DoubleBox();
        final DoubleBox argBox2 = new DoubleBox();
        final Label output = new Label();

        equalsButton.addClickHandler(
                e ->
                {
                    Double result = calculator.calculate(
                            operationBox.getSelectedValue(),
                            argBox1.getValue(),
                            argBox2.getValue()
                    );
                    output.setText(String.valueOf(result));
                });

        RootPanel.get("argSlot1").add(argBox1);
        RootPanel.get("argSlot2").add(argBox2);
        RootPanel.get("operationSlot").add(operationBox);
        RootPanel.get("buttonSlot").add(equalsButton);
        RootPanel.get("outputSlot").add(output);
    }
}
