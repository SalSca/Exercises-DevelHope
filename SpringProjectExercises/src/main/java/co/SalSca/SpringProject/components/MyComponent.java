package co.SalSca.SpringProject.components;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    private final String myComponentName;

    public MyComponent() {
        myComponentName="myName";

    }

    public String getMyComponentName(){
        return myComponentName;
    }

}
