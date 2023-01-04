package org.example;

public class Word {
    Model model;
    TitleFormat format;

    public void setModel(Model model) {
        this.model = model;
    }

    public void appendData(String text) {
        model.appendRawData(text);
    }

    public void setFormat(TitleFormat f) {
        format = f;
    }

    void click() {
        format.print(model.getRawData());
    }
}