package org.example;

public class NewFormat implements TitleFormat{
    @Override
    public void print(String text) {
        System.out.println(" ❤️ " + text + " ❤️ ");
    }
}
