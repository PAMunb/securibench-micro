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

import java.io.IOException;

import javax.servlet.ReadListener;
import javax.servlet.ServletInputStream;

public class DummyServletInputStream extends ServletInputStream {

	
	public int read() throws IOException {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	
	public boolean isReady() {
		// TODO Auto-generated method stub
		return false;
	}

	
	public void setReadListener(ReadListener readListener) {
		// TODO Auto-generated method stub

	}

}
