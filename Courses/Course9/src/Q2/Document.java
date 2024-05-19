package Q2;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Document {
    String title;
    String content;
    String author;
    List<String> comments;
    Date createdOn;

    public Document(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
        this.comments = new ArrayList<>();
        this.createdOn = new Date();
    }

    public abstract void displayDocument();
    public abstract void updateContent();
    public abstract void addComment();

    public String getDocumentInfo(){
        String ans = "";
        ans = "Title: " + title + "\n" ;
        ans = "Content: " + content + "\n";
        ans = "Author: " + author + "\n";
        ans = "Comments: " + comments + "\n";
        ans = "Created on:  " + createdOn + "\n";
//        ans = "Created on:  " + String.valueOf(createdOn) + "\n";
//        ans = "Created on:  " + createdOn.toString() + "\n";
        return ans;
    }



}
