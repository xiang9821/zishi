package test;

import annotationTest.MyAutowired;
import service.Action;
import seviceImpl.ActionImpl;
import seviceImpl.MethodImpl;

import java.lang.reflect.Field;

public class MyAutowireTest {

	public static void main(String[] args) {
		//测试 往ActionImpl中Method注入methodImpl对象
		ActionImpl acImpl = new ActionImpl();
		Class<?> aClass =  acImpl.getClass();
		System.out.println("aClass.getName::"+aClass.getName());
		System.out.println("aClass.getDeclaredFields。length:::"+aClass.getDeclaredFields().length);
//		aClass.getDeclaredFields() 获取该类的所有成员变量
		for (Field declaredField : aClass.getDeclaredFields()) {
			//判断是否存在MyAutowire注解
			MyAutowired annotation = declaredField.getAnnotation(MyAutowired.class);
			System.out.println("annotation::"+annotation);
			if(annotation == null){continue;}//跳过无该注解的
			//获取注解名，空则同类名
			String autowriteValue = annotation.value();
			if("".equals(autowriteValue)){
				autowriteValue = declaredField.getType().getName();
			}
			System.out.println("autowriteValue::"+autowriteValue);
//			BeanWrapper beanWrapper = this.beanWrapperMap.get(autowriteValue);
			declaredField.setAccessible(true);
			try {
				declaredField.set(acImpl,new MethodImpl());
			} catch (IllegalAccessException e) {
				System.out.println("e1::"+e.getMessage());
			}
		}
		try {
			acImpl.eat();
		}catch (Exception e){
			System.out.println("e2::"+e.getMessage());
		}

	}
}
