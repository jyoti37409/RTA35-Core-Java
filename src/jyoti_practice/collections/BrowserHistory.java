package jyoti_practice.collections;

import java.util.LinkedList;

public class BrowserHistory {
    private  LinkedList<String> history;
    private  LinkedList<String> forwordStack;

    public   BrowserHistory(){
        history = new LinkedList<>();
        forwordStack = new LinkedList<>();

    }
    public  void visit(String url){
        history.add(url);
        System.out.println("Visited : "+ history);
        forwordStack.clear();
    }
    public void back(){
        if(this.history.size()>1){
            String lastVisited = history.removeLast();
            System.out.println("lastpage is : " +lastVisited);
            forwordStack.add(lastVisited);
            System.out.println("page added to forward stack : " +forwordStack);
            System.out.println("Visited Last page : "+ history.getLast());

        }
    }
    public void forword(){
        if(!forwordStack.isEmpty()){
            String nexpage = forwordStack.removeLast();
            history.add(nexpage);
            System.out.println("forward to nextpage : " + nexpage);
        }
        else {
            System.out.println("page is not available");
        }
    }

    public  void printhistory(){
        System.out.println("history : "+this.history);
        System.out.println("forwordstack: " + this.forwordStack);
    }


    public static void main(String[] args) {
        BrowserHistory hist = new BrowserHistory();
        hist.visit("www.google.com");
        hist.visit("www.chatgpt.com");
        hist.visit("www.stackoverflow.com");
        hist.visit("www.bbc.com");
        hist.visit("www.cbn.com");
        hist.back();
        hist.printhistory();
        hist.forword();
        hist.printhistory();

        hist.back();
        hist.printhistory();

        hist.back();
        hist.printhistory();

        hist.forword();
        hist.printhistory();

    }

}
