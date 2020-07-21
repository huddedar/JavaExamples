package com.shekhar.demo;

public interface Interface2 extends SuperInterface{
	default public String identifyMyself() {
        return "I am a interface2.";
    }
}
