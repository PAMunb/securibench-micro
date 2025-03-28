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
import java.util.StringTokenizer;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;

public class DummyServletConfig implements ServletConfig {


	public String getInitParameter(String arg0) {
		return arg0;
	}

	@SuppressWarnings("rawtypes")
	public Enumeration getInitParameterNames() {
		return new StringTokenizer("one two three");
	}

	public ServletContext getServletContext() {
		return new DummyServletContext();
	}

	public String getServletName() {
		return "dummyServlet";
	}

}
