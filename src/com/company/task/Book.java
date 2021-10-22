package com.company.task;

public class Book {
    private static final String auth = "V.Davydenko";
    private String cover;
    private int page;

    public Book(String cover, int page){
        this.cover = cover;
        this.page = page;

    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}
