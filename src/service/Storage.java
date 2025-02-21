package service;

import model.Product;

import java.util.ArrayList;
import java.util.List;

public abstract class Storage <T extends Product>{
    protected List<T> contents = new ArrayList<>();
    public synchronized void addContent(List<? extends T> contents){
        this.contents.addAll(contents);
    }
    public List<T> getContents (){
        return contents;
    }
    public int getContentsCount(){
        return contents.size();
    }

}
