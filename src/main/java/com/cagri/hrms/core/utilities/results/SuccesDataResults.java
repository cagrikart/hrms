package com.cagri.hrms.core.utilities.results;

public class SuccesDataResults<T> extends DataResult{

    public SuccesDataResults(T data,  String messeage) {
        super(data, true, messeage);
    }
    public SuccesDataResults(T data) {
        super(data,true);
    }
    public SuccesDataResults(  String messeage) {
        super(null, true, messeage);
    }

}
