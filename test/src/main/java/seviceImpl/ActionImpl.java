package seviceImpl;

import annotationTest.MyAutowired;
import service.Action;
import service.Method;

public class ActionImpl implements Action {

	@MyAutowired
	private Method method;

	public void run() {
		System.out.println("run...");
	}

	public void eat() {
		System.out.println("eat...");
		method.ll();
	}

}
