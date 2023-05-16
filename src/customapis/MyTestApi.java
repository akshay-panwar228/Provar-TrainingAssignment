package customapis;


import java.util.logging.Logger;

import com.provar.core.model.base.api.ValueScope;
import com.provar.core.testapi.ITestExecutionContext;
import com.provar.core.testapi.annotations.*;

@TestApi( title="Convert into Dollar"
        , summary=""
        , remarks=""
        , iconBase=""
        , defaultApiGroups={"Custom"}
        )
@TestApiParameterGroups(parameterGroups={
	    @TestApiParameterGroup(groupName="inputs", title="Inputs"),
	    @TestApiParameterGroup(groupName="result", title="Result"),
	    })
public class MyTestApi {
    
    @TestApiParameter(seq=1, 
            summary="Value in Rupees that needs to be converted into Dollar",
            remarks="",
            mandatory=true,
            parameterGroup="inputs")
    public double Rupees;
    
//    @TestApiParameter(seq=2, 
//            summary="The second parameter's summary.",
//            remarks="",
//            mandatory=true,
//            parameterGroup="inputs")
//    public boolean param2;

    @TestApiParameter(seq=10, 
            summary="The name that the result will be stored under.",
            remarks="",
            mandatory=true,
            parameterGroup="result")
    public String resultName;

    @TestApiParameter(seq=11, 
            summary="The lifespan of the result.",
            remarks="",
            mandatory=true,
            parameterGroup="result",
            defaultValue="Test")
    public ValueScope resultScope;

    /** 
     * Used to write to the test execution log.
     */
    @TestLogger
    public Logger testLogger;
    
    /** 
     * Provides access to facilities, mainly to set and get variable values.
     */
    @TestExecutionContext
    public ITestExecutionContext testExecutionContext;
    
    @TestApiExecutor
    public void execute() {
    	
    	double dollar = Rupees/80;

    	// Put our implementation logic here.
    	testLogger.info("Hello from " + this.getClass().getName() +" Rupees : "+Rupees+ " is Equivalent to "+dollar+" USD");

        // Store the result (if appropriate).
    	double dollarResult = dollar;
        testExecutionContext.setValue(resultName, dollarResult, resultScope);
        
    }
    
}
