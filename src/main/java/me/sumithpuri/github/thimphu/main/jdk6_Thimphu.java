package me.sumithpuri.github.thimphu.main;

import me.sumithpuri.github.thimphu.dynamiccompilation.jdk6_DynamicCompilation;
import me.sumithpuri.github.thimphu.integratedws.webservice.jdk6_WebServices;
import me.sumithpuri.github.thimphu.scriptingengine.jdk6_Scripting;

/**
 * MIT License
 *
 * Copyright (c) 2018-19,	Sumith Kumar Puri

 * GitHub URL 			https://github.com/sumithpuri
 * Blog Post URL		http://www.techilashots.com/2015/05/java-se-6-whats-new-part-0204.html	
 * Blog Short URL		https://goo.gl/iUt46h
 * Package Prefix 		me.sumithpuri.github.thimphu
 * Project Codename		thimphu
 * Contact E-Mail		code@sumithpuri.me
 * Contact WhatsApp		+91 9591497974
 *
 *
 * Permission is hereby  granted,  free  of  charge, to  any person  obtaining a  copy of  this  software and associated 
 * documentation files (the "Software"), to deal in the  Software without  restriction, including without limitation the 
 * rights to use, copy, modify, merge, publish, distribute, sublicense,and/or sell copies of the Software, and to permit 
 * persons to whom the Software is furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in  all copies or substantial portions of the 
 * Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS  OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE 
 * WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR 
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES  OR  OTHER  LIABILITY, WHETHER IN AN ACTION  OF  CONTRACT, TORT OR 
 * OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

/* 
 * You may run this main class to run all the Demo Code of the [Thimphu] Project. It demonstrates most important changes 
 * in Java 6.
 */
public class jdk6_Thimphu {

	public static void main(String[] args) throws Exception {
		
		System.out.println("Copyright (c) 2018-19,	Sumith Kumar Puri");
		System.out.println();
		System.out.println("Project Codename      Thimphu");
		System.out.println("Project Description   Java 6 Companion Code Samples");
		System.out.println("Technical Blog        http://www.techilashots.com");
		System.out.println("Technical Blog Post   https://goo.gl/iUt46h");
		System.out.println("[Developer Notes]     [01] Use Java Version 9.0+ Compiler");
		System.out.println();
		System.out.println("------------------------------------------------------------");
		System.out.println("[01. Scripting Engine]");
		scriptingEngine();
		System.out.println("------------------------------------------------------------");
		System.out.println("[02. Dynamic Compilation]");
		dynamicCompilation();
		System.out.println("------------------------------------------------------------");
		System.out.println("[03. Integrated Web Services]");
		integratedWebServices();
		System.out.println("------------------------------------------------------------");
		
	}
	
	
	private static void scriptingEngine() throws Exception {
		
		jdk6_Scripting scriptingEngine = new jdk6_Scripting();
		scriptingEngine.demonstrate();
	}
	
	private static void dynamicCompilation() throws Exception{
		
		jdk6_DynamicCompilation dynamicCompilation = new jdk6_DynamicCompilation();
		dynamicCompilation.demonstrate();
	}
	
	private static void integratedWebServices() {
		
		jdk6_WebServices integratedWebService = new jdk6_WebServices();
		System.out.println("Demonstration of Integrated Web Services Is Disabled in Maven Build\n");
		System.out.println("[For a Step-by-Step Usage of Java 6 Integrated Web Services, Follow the Steps]");

		System.out.println("A. | Web Service/Server - jd6_WebServices.java | Client - jdk6_WebServicesClient.java |");
		System.out.println("1. Go to the Command-Line (Root of Source Folder), With atleast Java 6 Installed");
		System.out.println("2. Execute apt -d sample me.sumithpuri.github.thimphu.integratedws.webservice.jdk6_WebServices.java ");
		System.out.println("3. Execute java -cp sample me.sumithpuri.github.thimphu.integratedws.webservice.jdk6_WebServices  ");
		System.out.println("4. wsimport -p me.sumithpuri.github.thimphu.integratedws.generated -keep http://localhost:8080/calculator?wsdl");
		System.out.println("5. Next, Execute the me.sumithpuri.github.thimphu.integratedws.webservice.client.jdk6_WebServicesClient");
		System.out.println("!. Make Sure that while Executing the Client, the Generated Artefacts are in its Classpath!");

		
		//integratedWebService.demonstrate();
	}
}
