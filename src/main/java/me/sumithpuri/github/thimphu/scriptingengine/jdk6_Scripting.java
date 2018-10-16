package me.sumithpuri.github.thimphu.scriptingengine;

import java.io.File;  
import java.io.FileReader;  
import javax.script.Invocable;  
import javax.script.ScriptEngine;  
import javax.script.ScriptEngineManager;  

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
 * rights to use, copy, modify, merge, publish, distribute, sub-license and/or sell copies of the Software and to permit 
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
public class jdk6_Scripting {  
	
	//you may chose a simpler path as well, ideally a relative path or load from a properties file
	private static String scriptSourcePath = "src\\main\\java\\me\\sumithpuri\\github\\thimphu"
												+ "\\scriptingengine\\script\\jdk6_DynamicMarketScript.js";

	public void todaysLogic() throws Exception {            
    
		// dynamically change script - invoke code in groovy, js - even tcl!  
       ScriptEngineManager manager = new ScriptEngineManager();  
       ScriptEngine jsEngine = manager.getEngineByName("JavaScript");  
       
       System.out.println(jsEngine.toString());  
       
       if (jsEngine instanceof Invocable) {  
            try {  
                 File file = new File("market.js");  
            } catch (Throwable e) {  
                 e.printStackTrace();  
            }        
            
           
            FileReader reader = new FileReader(scriptSourcePath);              
            jsEngine.eval(reader);              
            ((Invocable) jsEngine).invokeFunction("dailyMarketSequence");  
        }  
     } 
	
     public static void main(String[] args) throws Exception {  
    
    	   demonstrate();
     }  
     
     public static void demonstrate() throws Exception {
    	 
    	 jdk6_Scripting scripting = new jdk6_Scripting();  
         scripting.todaysLogic();
     }
}  
