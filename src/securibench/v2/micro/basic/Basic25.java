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
    
    $Id: Basic25.java,v 1.4 2006/04/04 20:00:40 livshits Exp $
 */
package securibench.v2.micro.basic;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import securibench.v2.micro.BasicTestCase;
import securibench.v2.micro.MicroTestCase;

/**
 * @servlet description="test getParameterValues"
 * @servlet vuln_count = "1"
 */
public class Basic25 extends BasicTestCase implements MicroTestCase {
	private static final String FIELD_NAME = "name";

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String[] s = req.getParameterValues(FIELD_NAME);
		String name = s[0].toLowerCase(Locale.UK);

		PrintWriter writer = resp.getWriter();
		writer.println(name); /* BAD */
	}

	public String getDescription() {
		return "test getParameterValues";
	}

	public int getVulnerabilityCount() {
		return 1;
	}
}