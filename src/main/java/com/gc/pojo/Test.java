package com.gc.pojo;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

public class Test {
	public static void main(String[] args) {
		try {
			PropertyDescriptor pd=new PropertyDescriptor("name",User.class);
			
		System.out.println(pd.getReadMethod().getName());
		
		Type[] tyopes=pd.getWriteMethod().getGenericParameterTypes();
		
		System.out.println(tyopes[0].toString());
		
		TypeVariable<Method>[] aa=pd.getWriteMethod().getTypeParameters();
		System.out.println(aa.length);
		Type[] types=aa[0].getBounds();
		System.out.println(types.length);
		System.out.println(types[0].toString());
			
		} catch (IntrospectionException e) {
			e.printStackTrace();
		}
	}

}
