/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercice1;

import javax.enterprise.context.Dependent;
import javax.inject.Named;

/**
 *
 * @author Dell
 */
@Dependent
@Named
public class MessageServerBean {
    public String getMessage(){
        return "Hello World!";
    }
}
