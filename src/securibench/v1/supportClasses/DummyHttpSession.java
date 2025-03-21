/*******************************************************************************
 * Copyright (c) 2012 Secure Software Engineering Group at EC SPRIDE.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v2.1
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/old-licenses/gpl-2.0.html
 * 
 * Contributors: Christian Fritz, Steven Arzt, Siegfried Rasthofer, Eric
 * Bodden, and others.
 ******************************************************************************/
package securibench.v1.supportClasses;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.StringTokenizer;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;

@SuppressWarnings("deprecation")
public class DummyHttpSession implements HttpSession {
	HashMap<String, Object> attributes = new HashMap<String, Object>();
	HashMap<String, Object> values = new HashMap<String, Object>();
	
	public Object getAttribute(String arg0) {
		if(attributes.containsKey(arg0)){
			return attributes.get(arg0);
		}
		return null;
	}

	@SuppressWarnings("rawtypes")
	
	public Enumeration getAttributeNames() {
		return new StringTokenizer("");
	}

	
	public long getCreationTime() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public long getLastAccessedTime() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public int getMaxInactiveInterval() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public ServletContext getServletContext() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public HttpSessionContext getSessionContext() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Object getValue(String arg0) {
		if(values.containsKey(arg0)){
			return values.get(arg0);
		}
		return null;
	}

	
	public String[] getValueNames() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void invalidate() {
		// TODO Auto-generated method stub
		
	}

	
	public boolean isNew() {
		// TODO Auto-generated method stub
		return false;
	}

	
	public void putValue(String arg0, Object arg1) {
		values.put(arg0, arg1);
		
	}

	
	public void removeAttribute(String arg0) {
		// TODO Auto-generated method stub
		
	}

	
	public void removeValue(String arg0) {
		// TODO Auto-generated method stub
		
	}

	
	public void setAttribute(String arg0, Object arg1) {
		attributes.put(arg0, arg1);
		
	}

	
	public void setMaxInactiveInterval(int arg0) {
		// TODO Auto-generated method stub
		
	}

}
