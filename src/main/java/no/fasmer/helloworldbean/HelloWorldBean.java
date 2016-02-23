package no.fasmer.helloworldbean;

import javax.ejb.Stateless;

@Stateless
public class HelloWorldBean implements HelloWorldRemote {

    @Override
    public String helloWorld() {
        return "Hello world !#$%&/()";
    }

}
