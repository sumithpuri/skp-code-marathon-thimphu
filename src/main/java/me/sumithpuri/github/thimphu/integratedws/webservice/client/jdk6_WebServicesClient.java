package me.sumithpuri.github.thimphu.integratedws.webservice.client;

import me.sumithpuri.github.thimphu.integratedws.generated.Jdk6WebServices;
import me.sumithpuri.github.thimphu.integratedws.generated.Jdk6WebServicesService;

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
/* [credits: https://weblogs.java.net/blog/vivekp/archive/2006/12/webservices_in.html]  
 * 
 * [if you wish to use from command-line, go to the root of your source folder and perform the following]
 *    
 * apt -d sample me.sumithpuri.github.thimphu.integratedws.webservice.jdk6_WebServices.java  
 * java -cp sample me.sumithpuri.github.thimphu.integratedws.webservice.jdk6_WebServices  
 * wsimport -p me.sumithpuri.github.thimphu.integratedws.generated -keep http://localhost:8080/calculator?wsdl
 */ 
public class jdk6_WebServicesClient {
	
    public static void main(String[] args) {          
    
    	 Jdk6WebServicesService service = new Jdk6WebServicesService();  
         Jdk6WebServices serviceProxy = service.getJdk6WebServicesPort();  
         int result = serviceProxy.add(12, 12);  
         System.out.println("Sum: " + result);  
    }  
}  