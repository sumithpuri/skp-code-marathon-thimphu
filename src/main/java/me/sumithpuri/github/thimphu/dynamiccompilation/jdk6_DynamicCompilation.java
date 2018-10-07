package me.sumithpuri.github.thimphu.dynamiccompilation;

import java.io.FileOutputStream;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

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
public class jdk6_DynamicCompilation {
	
	//you may chose a simpler path as well, ideally a relative path (from the root classpath) or from properties file
	private static String javaPluginPath = "src\\main\\java\\me\\sumithpuri\\github\\thimphu"
												+ "\\dynamiccompilation\\plugin\\jdk6_DynamicJavaPlugin.java";


	public static void main(String[] args) throws Exception {
	
		demonstrate();
	}
	
	public static void demonstrate() throws Exception {
		
		System.out.println("Testing Dynamic Compilation, Java Class/Plugin Located At....");
		System.out.println(javaPluginPath);
	
		
		JavaCompiler javaCompiler = ToolProvider.getSystemJavaCompiler();
		FileOutputStream fileOutputStream = new FileOutputStream("errors.txt");
		
		int compilationResult = javaCompiler.run(null, null, fileOutputStream, "-verbose", javaPluginPath);
		
		if(compilationResult==0) {
			
			System.out.println("Dynamic Compilation was Successful for the File Located in the Above Path!");
			System.out.println("Please Execute/Invoke the Dynamically Generated Class Using Reflection (or Manually)");
		}
	}
}