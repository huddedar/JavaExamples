package com.shekhar.demo;

public interface Interface1 extends SuperInterface {
	default public String identifyMyself() {
        return "I am a interface1.";
    }
}
