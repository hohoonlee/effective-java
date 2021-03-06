package ch06;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RunTests {
	public static void main(String[] args) throws Exception {
		int tests = 0;
		int passed = 0;

		Class<?> testClass = Class.forName("ch06.Sample2");

		for(Method m : testClass.getDeclaredMethods()) {
			if(m.isAnnotationPresent(Test.class)) {
				tests++;
				try {
					m.invoke(null);
					passed++;
				}catch(InvocationTargetException e) {
					Throwable exc = e.getCause();
					System.out.println(m + " Fail: " + exc);
				}catch(Exception e1) {
					System.out.println("Error @Test : " + m);
				}
			}else if(m.isAnnotationPresent(ExceptionTest.class)) {
				tests++;
				try {
					m.invoke(null);
					System.out.printf("테스트 %s 실패: 예외를 던지지 않음%n", m);
				}catch(InvocationTargetException e) {
					Throwable exc = e.getCause();
					int oldPassed = passed;
					Class<? extends Throwable>[] excTypes = m.getAnnotation(ExceptionTest.class).value();
					for(Class<? extends Throwable> excType : excTypes) {
						if(excType.isInstance(exc)) {
							passed++;
							break;
						}
					}
					if(passed == oldPassed){
						System.out.printf("테스트 %s 실패:  %s%n", m, exc);
					}
				}catch(Exception e1) {
					System.out.println("Error @Test : " + m);
				}
			}
		}
		System.out.printf("성공: %d, 실패: %d%n", passed, tests - passed);
	}
}
