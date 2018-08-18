package io.mike.java8;

@FunctionalInterface
public interface MikeFun {
	
	/** 被 @java.lang.FunctionalInterface 注解修饰的接口只能有一个 【java8 抽象方法】 */
	void onlyOne();
	
	/** 定义实现类覆盖 @java.lang.Object 中的 public 方法不是 【java8 抽象方法】 */
	boolean equals(Object o);
	
	/** 接口中的默认方法不是 【java8 抽象方法】 */
	default void defaultMethod() {
		
	}
	
	/** 静态方法不是 【java8 抽象方法】 */
	static void staticMethond() {
		
	}
	
	
}