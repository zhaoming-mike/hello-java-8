package io.mike.java8;

@FunctionalInterface
interface PowerFunction<One, Two, Three> {
	
    public Three apply(One one, Two two);
    
}