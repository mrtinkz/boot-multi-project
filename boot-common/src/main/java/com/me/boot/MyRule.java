package com.me.boot;

@Rule(name = "my rule", description = "my rule description", priority = 1)
public class MyRule {

    @Condition
    public boolean when(@Fact("fact") fact) {
        //my rule conditions
        return true;
    }

    @Action(order = 1)
    public void then(Facts facts) throws Exception {
        //my actions
    }

    @Action(order = 2)
    public void finally() throws Exception {
        //my final actions
    }

}
