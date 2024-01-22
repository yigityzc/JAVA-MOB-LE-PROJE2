package com.taz.mobilfinal.ui.label;

public class Label {
    private String labelText;

    public Label(){
        this.labelText = null;
    }

    public Label(String labelText){this.labelText = labelText;}

    public String getLabelText(){return labelText;}

    public void setLabelText(String labelText){this.labelText = labelText;}
}
