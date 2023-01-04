package org.example;

public class Main {
    public static void main(String[] args) {
        Document doc = new Document();
        doc.setWorker(new Worker(22, 221, "Какое-то имя"));

        doc.SaveAs();// Save html
        // xml
        // <xml>
        // <Worker>
        // <age>22</age>
        // <salary>221</salary>
        // <name>Какое-то имя</name>
        // </Worker>
        // </xml>

        doc.SaveAs();// Save md
        // # Worker
        // * age 22
        // * salary 221
        // * name Какое-то имя


        doc.SaveAs();// Save json
        // {
        // "worker" : {
        // "age":22,
        // "salary":221,
        // "name":"Какое-то имя",
        // }
        // }
    }
}
