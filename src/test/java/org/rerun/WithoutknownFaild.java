package org.rerun;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;
import org.testng.internal.annotations.IAnnotationTransformer;

public class WithoutknownFaild implements IAnnotationTransformer {

	@Override
	public void transform(ITestAnnotation a, Class testClass, Constructor testConstructor, Method testMethod) {
	//IRetryAnalyzer retryAnalyzer = a.getRetryAnalyzer();
		a.setRetryAnalyzer(WithknownFaild.class);
		
	}
	

}
