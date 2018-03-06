/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author entrar
 */
@WebService(serviceName = "WSFactorial")
public class WSFactorial {

    
    @WebMethod(operationName = "factorial")
    public int factorial(@WebParam(name = "number") int number){
        if (number == 0){
            return 1;
        }else{
            return number * factorial(number-1);
        }
    }
}
