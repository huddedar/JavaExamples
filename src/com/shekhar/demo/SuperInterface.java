package com.shekhar.demo;

public interface SuperInterface {
	default public String identifyMyself() {
        return "I am a SuperInterface.";
    }
}
