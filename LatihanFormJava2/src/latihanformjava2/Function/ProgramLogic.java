/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanformjava2.Function;

import latihanformjava2.Model.ModelProgram;
/**
 *
 * @author Asus
 */
public class ProgramLogic extends ModelProgram {
    ModelProgram mp = new ModelProgram();
    
    //4 parameter
    public String result (String name, String born_date, String mental,
            String gender){
        
        String noun = mp.returnGenderNoun(gender);
        String mental_status = mp.returnMental(mental);
        
        // sign \ itu garis baru
        return "The name is " + name + " \nwas born at " + born_date +
                ".\n" + noun + " is currently " + mental_status;
    }
    
    //parameternya cm 1, cm balikin nama
    public String result(String name){
        return "The name is " + name + ".";
    }
    
    //parameternya 2, nama dan mental
    public String result(String name, String mental){
        String mental_status = mp.returnMental(mental);
        
        return "The name is " + name + " \n is currently " + mental_status + ".";
    }
}
