package reflect_java;

import java.lang.reflect.Constructor;

import entity.Student;

public class Study1 {
	
	public static void main(String[] args) {
		Study1 s = new Study1();
		s.test1();
	}
	
	public static void test1(){
		try {
			Class<?> cla = Study1.class.forName("entity.Student");
			Student student = (Student)cla.newInstance();
			System.out.println(student.toString());
			Constructor<?>[] constructors = cla.getDeclaredConstructors();
			for(Constructor<?> c:constructors){
				System.out.println();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
