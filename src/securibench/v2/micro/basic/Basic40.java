/*
   Copyright 2006 Benjamin Livshits

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
/**
   @author Benjamin Livshits <livshits@cs.stanford.edu>
   
   $Id: Basic40.java,v 1.3 2006/04/21 17:14:26 livshits Exp $
 */
package securibench.v2.micro.basic;

import java.io.IOException;
import java.io.PrintWriter;

import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.support.DefaultMultipartHttpServletRequest;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import securibench.v2.micro.BasicTestCase;
import securibench.v2.micro.MicroTestCase;

/**
 * @servlet description="MultipartRequest test"
 * @servlet vuln_count = "1"
 */
public class Basic40 extends BasicTestCase implements MicroTestCase {
	private static final String FIELD_NAME = "name";

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		MultipartHttpServletRequest mreq = new DefaultMultipartHttpServletRequest(req);
		String name = mreq.getParameter(FIELD_NAME);

		PrintWriter writer = resp.getWriter();
		writer.println(name);
	}

	public String getDescription() {
		return "MultipartRequest test";
	}

	public int getVulnerabilityCount() {
		return 1;
	}
}