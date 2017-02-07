package main.java;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

/**
 * Created by ebricco on 2/7/17.
 */
public class Page extends WebPage {
    public Page(){
        add(new Label("message", "Hellooooo"));
    }
}
